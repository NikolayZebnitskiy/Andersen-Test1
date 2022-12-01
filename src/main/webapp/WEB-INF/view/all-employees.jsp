<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Employees</h2>
<br>

<table>

<tr>

    <th>Name</th>
    <th>Surname</th>
    <th>Age</th>
    <th>Salary</th>
    <th>Address</th>
    <th>Position</th>
    <th>Operations</th>

    <c:forEach var="emp" items="${allEmps}">

        <c:url var="updateButton" value="/updateEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
             <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="projectsButton" value="/projectsEmployee">
                     <c:param name="empId" value="${emp.id}"/>
                </c:url>

        <c:url var="addProjectsButton" value="/addProjectsEmployee">
                     <c:param name="empId" value="${emp.id}"/>
                </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.age}</td>
            <td>${emp.salary}</td>
            <td>${emp.address}</td>
            <td>${emp.position.positionName}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                onclick="window.location.href = '${deleteButton}'"/>

                <input type="button" value="Projects"
                onclick="window.location.href = '${projectsButton}'"/>

                <input type="button" value="Add projects"
                                onclick="window.location.href = '${addProjectsButton}'"/>
            </td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>

<input type="button" value="Add new employee"
    onclick="window.location.href = 'addNewEmployee'"/>
<br><br>

<input type="button" value="Show all employees without project"
    onclick="window.location.href = 'employeesWithoutProject'"/>
</body>
</html>