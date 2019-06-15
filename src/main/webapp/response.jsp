<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page import="servlets.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="sessionId" value="${sessionScope['sessionId'].toString()}"/>
<c:set var="type" value="${sessionScope['type'].toString()}"/>

<script>
    function hide_show(div1, link1, name) {
        var div = document.getElementById(div1).style.display;
        var link = document.getElementById(link1).innerHTML;
        if (div == "") div = "block";
        if (div == "none") {
            div = "block";
            link = name + " hide";
        }
        //или наоборот
        else {
            div = "none";
            link = name + " show";
        }
        document.getElementById(div1).style.display = div;
        document.getElementById(link1).innerHTML = link;
    }
</script>

<html>
<link rel="stylesheet" href="css/userStyle.css">
<body>
<div>

</div>
<button onClick="hide_show('div1', 'link1', 'consumerGoods');return false;" id="link1">Consumer goods hide</button>
<div id="div1">
    <table border="1">
        <tr>
            <td>idProduct</td>
            <td>name</td>
            <td>idProduct</td>
            <td>idSection</td>
            <td>weight</td>
            <td>dateOfManufacture</td>
            <td>expirationDate</td>
            <td></td>
        </tr>
        <c:forEach items="${requestScope['customerGoods']}" var="customerGoods">
            <tr>
                <td><c:out value="${customerGoods.getIdProduct()}"/></td>
                <td><c:out value="${customerGoods.getName()}"/></td>
                <td><c:out value="${customerGoods.getPrice()}"/></td>
                <td><c:out value="${customerGoods.getIdSection()}"/></td>
                <td><c:out value="${customerGoods.getWeight()}"/></td>
                <td><c:out value="${customerGoods.getDateOfManufacture()}"/></td>
                <td><c:out value="${customerGoods.getExpirationDate()}"/></td>
                <td>
                    <form method="post" action="add-to-basket">
                        <button type="submit">Add to basket</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<button onClick="hide_show('div2', 'link2', 'Intermediate consumption goods');return false;" id="link2">Intermediate
    consumption goods hide
</button>
<div id="div2">
    <table border="1">
        <tr>
            <td>idProduct</td>
            <td>name</td>
            <td>idProduct</td>
            <td>idSection</td>
            <td>weight</td>
            <td>dateOfManufacture</td>
            <td>expirationDate</td>
            <td></td>
        </tr>
        <c:forEach items="${requestScope['intermediateConsumptionGoods']}" var="intermediateConsumptionGoods">
            <tr>
                <td><c:out value="${intermediateConsumptionGoods.getIdProduct()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getName()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getPrice()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getIdSection()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getWeight()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getDateOfManufacture()}"/></td>
                <td><c:out value="${intermediateConsumptionGoods.getExpirationDate()}"/></td>
                <td>
                    <form method="post" action="add-to-basket">
                        <button type="submit">Add to basket</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<button onClick="hide_show('div3', 'link3', 'ManufacturedGoods');return false;" id="link3">Manufactured goods hide
</button>
<div id="div3">
    <table border="1">
        <tr>
            <td>idProduct</td>
            <td>name</td>
            <td>idProduct</td>
            <td>idSection</td>
            <td>weight</td>
            <td>dateOfManufacture</td>
            <td>expirationDate</td>
            <td></td>
        </tr>
        <c:forEach items="${requestScope['manufacturedGoods']}" var="manufacturedGoods">
            <tr>
                <td><c:out value="${manufacturedGoods.getIdProduct()}"/></td>
                <td><c:out value="${manufacturedGoods.getName()}"/></td>
                <td><c:out value="${manufacturedGoods.getPrice()}"/></td>
                <td><c:out value="${manufacturedGoods.getIdSection()}"/></td>
                <td><c:out value="${manufacturedGoods.getWeight()}"/></td>
                <td><c:out value="${manufacturedGoods.getDateOfManufacture()}"/></td>
                <td><c:out value="${manufacturedGoods.getExpirationDate()}"/></td>
                <td>
                    <form method="post" action="add-to-basket">
                        <button type="submit">Add to basket</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>