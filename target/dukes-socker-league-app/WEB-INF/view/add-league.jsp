<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 20/10/21
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add-league-page</title>
</head>
<body>
<form action="processAddLeague" method="post">
    <label>Season</label><select name="season">
    <option value="UNKNOWN">Select...</option>
    <option value="Spring">Spring</option>
    <option value="Summer">Summer</option>
    <option value="Autumn">Autumn</option>
</select><br/>
    <label>Title</label><input type="text" name="title"><br/>
    <input type="submit" value="add a new legue">
</form>
</body>
</html>
