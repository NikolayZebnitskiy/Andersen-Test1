<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>Employees without a project</h2>
<br>

<table>

<tr>

    <th>Name</th>
    <th>Surname</th>
    <th>Age</th>
    <th>Salary</th>
    <th>Address</th>
    <th>Position</th>

    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.age}</td>
            <td>${emp.salary}</td>
            <td>${emp.address}</td>
            <td>${emp.position.positionName}</td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>

</body>
</html>