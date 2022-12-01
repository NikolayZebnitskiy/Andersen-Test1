<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>${customer.companyName} projects</h2>
<br>

<table>

<tr>

    <th>Project</th>
    <th>Status</th>

 <c:forEach var="cs" items="${customer.projects}">

        <tr>
            <td>${cs.projectName}</td>
            <td>${cs.projectStatus}</td>
        </tr>

    </c:forEach>
</tr>

</table>
<br>
</body>

</html>