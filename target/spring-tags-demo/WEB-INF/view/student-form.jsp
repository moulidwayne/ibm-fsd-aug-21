<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 20/10/21
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>student-form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName" />
    <form:errors path="firstName" cssStyle="color: red"/>
    <br><br>
    Last name: <form:input path="lastName" />
    <form:errors path="lastName" cssStyle="color: red"/>
    <br><br>
    Email: <form:input path="email" />
    <form:errors path="email" cssStyle="color: red"/>
    <br><br>
    Country:<form:select path="country">
        <form:option value="Brazil" label="Brazil" />
        <form:option value="France" label="France" />
        <form:option value="Germany" label="Germany" />
        <form:option value="India" label="India" />
    </form:select><br/><br/>
    Favorite programing language:<br/>
    Java <form:radiobutton path="favoriteLanguage" value="Java" />
    C# <form:radiobutton path="favoriteLanguage" value="C#" />
    PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
    <br/><br/>
    Operating System(s):
    Linux <form:checkbox path="operatingSystems" value="Linux" />
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
    MS Windows <form:checkbox path="operatingSystems"
                              value="MS Windows" />
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
