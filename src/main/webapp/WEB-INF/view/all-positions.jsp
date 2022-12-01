<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Position</h2>
<br>

<table>

<tr>

    <th>Name</th>
    <th>Operations</th>


    <c:forEach var="pos" items="${allPosition}">

        <c:url var="deleteButton" value="/deletePosition">
            <c:param name="posId" value="${pos.id}"/>
        </c:url>

        <c:url var="updateButton" value="/updatePosition">
                    <c:param name="posId" value="${pos.id}"/>
        </c:url>

        <tr>
            <td>${pos.positionName}</td>
            <td>
                <input type="button" value="Delete"
                onclick="window.location.href = '${deleteButton}'"/>

                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>
            </td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>

<input type="button" value="Add new position"
    onclick="window.location.href = 'addNewPosition'"/>

</body>
</html>