<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>

<h2>Add a project to ${employee.name} ${employee.surname}</h2>
<br>
<table>

<tr>

    <th>Name</th>
    <th>Status</th>
    <th>Customer</th>
    <th>Operations</th>

    <c:forEach var="pr" items="${allProjects}">

        <c:url var="addProjectButton" value="/addProjectToEmployee">
            <c:param name="prId" value="${pr.id}"/>
            <e:param name="empId" value="${employee.id}"/>
        </c:url>

        <tr>
            <td>${pr.projectName}</td>
            <td>${pr.projectStatus}</td>
            <td>${pr.customer.companyName}</td>
            <td>
                <input type="button" value="Add"
                onclick="window.location.href = '${addProjectButton}'"/>
            </td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>
<getAttribute("employee")/>
</body>
</html>