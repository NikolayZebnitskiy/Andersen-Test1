<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Customer info</h2>
<br>

<form:form action="saveCustomer" modelAttribute="customer">

    <form:hidden path="id"/>

    Name <form:input path="companyName"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>