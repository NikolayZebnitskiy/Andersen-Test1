<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Project info</h2>
<br>

<form:form action="saveProject" modelAttribute="project">

    <form:hidden path="id"/>

    Name <form:input path="projectName"/>
    <br><br>
    Status <form:input path="projectStatus"/>
    <br><br>
    Customer <form:input path="customer.id"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>