<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All customers</h2>
<br>

<table>

<tr>

    <th>Company</th>
    <th>Phone number</th>
    <th>email</th>
    <th>Operations</th>

    <c:forEach var="cs" items="${allCustomers}">

        <c:url var="updateButton" value="/updateCustomer">
            <c:param name="csId" value="${cs.id}"/>
        </c:url>

        <c:url var="projectsButton" value="/projectsCustomer">
                     <c:param name="csId" value="${cs.id}"/>
                </c:url>

        <c:url var="deleteButton" value="/deleteCustomer">
                     <c:param name="csId" value="${cs.id}"/>
                </c:url>

        <tr>
            <td>${cs.companyName}</td>
            <td>${cs.phoneNumber}</td>
            <td>${cs.email}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Projects"
                onclick="window.location.href = '${projectsButton}'"/>

                <input type="button" value="Delete"
                onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</tr>

</table>
<br>

<input type="button" value="Add new company"
    onclick="window.location.href = 'addNewCustomer'"/>

</body>
</html>