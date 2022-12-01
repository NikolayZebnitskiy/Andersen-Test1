<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All projects</h2>
<br>

<table>

<tr>

    <th>Name</th>
    <th>Status</th>
    <th>Customer</th>
    <th>Operations</th>

    <c:forEach var="pr" items="${allProjects}">

        <c:url var="updateButton" value="/updateProject">
            <c:param name="prId" value="${pr.id}"/>
        </c:url>

        <c:url var="employeesButton" value="/employeesProject">
                     <c:param name="prId" value="${pr.id}"/>
                </c:url>

        <c:url var="deleteButton" value="/deleteProject">
                     <c:param name="prId" value="${pr.id}"/>
                </c:url>

        <tr>
            <td>${pr.projectName}</td>
            <td>${pr.projectStatus}</td>
            <td>${pr.customer.companyName}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Employees"
                onclick="window.location.href = '${employeesButton}'"/>

                <input type="button" value="Delete"
                onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>

<input type="button" value="Add new project"
    onclick="window.location.href = 'addNewProject'"/>

</body>
</html>