<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 19/10/21
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>error page</title>
</head>

<body>
<%

    List<String> error=(List<String>) request.getAttribute("ERROR");
    for(String e:error)
    {
        out.print("<font color='red'><i>"+e+"</i></font><br/>");
    }

%>
<br/>
<a href="registerLeague">Try Again</a>
</body>
</html>
