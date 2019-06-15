package servlets;

import businessLogic.BusinessLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add-to-basket")
public class AddToBasketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BusinessLogic businessLogic = new BusinessLogic();
        try {
            businessLogic.addToBasket(req);
        } catch (SQLException e) {
            req.getRequestDispatcher("Error.jsp").forward(req, resp);
        }
        req.getRequestDispatcher("response.jsp").forward(req, resp);
    }
}
