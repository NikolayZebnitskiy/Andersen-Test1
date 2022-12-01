<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Projects by ${employee.name} ${employee.surname}</h2>
<br>

 <c:forEach var="emp" items="${employee.projects}">

        <tr>
            <td>${emp.projectName}</td
        </tr>
        <br>
    </c:forEach>

<br>
</body>

</html>