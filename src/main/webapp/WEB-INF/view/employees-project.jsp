<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Employees involved in the ${project.projectName} project</h2>
<br>

<table>

<tr>

    <th>Name</th>
    <th>Surname</th>
    <th>Position</th>

 <c:forEach var="pr" items="${project.employees}">

        <tr>
            <td>${pr.name}</td>
            <td>${pr.surname}</td>
            <td>${pr.position.positionName}</td>
        </tr>

    </c:forEach>
</tr>

</table>
<br>
</body>

</html>