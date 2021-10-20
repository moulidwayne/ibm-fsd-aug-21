<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 19/10/21
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register-league</title>
</head>
<p>
    This form allows you to create a new soccer league.
</p>
<form action="processData" method="POST">
    <c:set var="error" value="${ERROR}"/>
    <c:if test="${error!=null}">
        <c:forEach items="${error}" var="e">
           <li style="color: red"><i><c:out value="${e}"/></i></li>
        </c:forEach>
    </c:if>
    Year<input type="text" name="year" /> <br/><br/>
   Season</label><select name="season">
    <option value="UNKNOWN">select...</option>
    <option value="Spring">Spring</option>
    <option value="Summer">Summer</option>
    <option value="Fall">Fall</option>
    <option value="Winter">Winter</option>
</select> <br/><br/>
    Title<input type="text" name="title" /> <br/><br/>
    <input type="submit" value="Add League" />
</form>
<body>

</body>
</html>
