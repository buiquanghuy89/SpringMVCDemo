<%@page contentType="text/html;charset = UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Submitted user Information</h2>
<table>
    <tr>
        <td>UserName</td>
        <td>${userName}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>
</table>
</body>

</html>