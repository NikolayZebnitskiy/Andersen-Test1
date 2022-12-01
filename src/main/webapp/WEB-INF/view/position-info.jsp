<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Position info</h2>
<br>

<form:form action="savePosition" modelAttribute="position">

    <form:hidden path="id"/>

    Name <form:input path="positionName"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>