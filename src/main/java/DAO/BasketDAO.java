package DAO;

import dataConnection.DataConnection;
import dataModel.Basket;
import servlets.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BasketDAO {

    public List<Basket> getBasketFromDB(int idBasket, int idProduct) throws SQLException {
        List<Basket> getBasketArr = new ArrayList<>();
        Connection connection = DataConnection.getDBConnection();

        final String sqlQuery =
                String.format("SELECT * FROM Basket WHERE idBasket %s AND idProduct %s",
                        idBasket == Constants.SELECT_ALL_INT ? "LIKE '%'" : "= " + idBasket,
                        idProduct == Constants.SELECT_ALL_INT ? "LIKE '%'" : "= " + idProduct
                );

        PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Basket basket = new Basket(rs.getInt("idBasket"), rs.getInt("idProduct"));
            getBasketArr.add(basket);
        }
        connection.close();
        return getBasketArr;

    }

    public void setBasketToDB(int idProduct) throws SQLException {
        final String sqlQueryBasket = String.format("INSERT INTO Basket (idProduct) " +
                "VALUES ('%d')", idProduct);
        Connection connection = DataConnection.getDBConnection();
        PreparedStatement pstmt = connection.prepareStatement(sqlQueryBasket);
        pstmt.execute();
        connection.close();

    }
}
