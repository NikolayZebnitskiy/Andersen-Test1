<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Projects by ${employee.name} ${employee.surname}</h2>
<br>

 <c:forEach var="emp" items="${employee.projects}">

        <tr>
            <td>${emp.projectName}</td
        </tr>

    </c:forEach>

<br>
</body>

</html>