<%--
  Created by IntelliJ IDEA.
  User: JC
  Date: 23/08/2019
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    <s:url var="url_jqlib" value="/jquery-3.4.1.min.js" />
        <script src="${url_jqlib}"> </script>
        <script>
            <%@include file="../resources/js/jquery-3.4.1.min.js" %>
            $(document).ready(function(){
//                alert('hee');
                  $("#server_time").click(function(){
                      $.ajax({
                          url : 'loginProcess',
                          success : function(data){
                              $("#id_time").html(data)
                          }
                      });
                  })
            });
        </script>
    
</head>
<body>
<form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
    <table align="center">
        <tr>
            <td>
                <form:label path="username">Username: </form:label>
            </td>
            <td>
                <form:input path="username" name="username" id="username" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="password">Password:</form:label>
            </td>
            <td>
                <form:password path="password" name="password" id="password" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td align="left">
                <form:button id="login" name="login">Login</form:button>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="home.jsp">Home</a>
            </td>
        </tr>
    </table>
</form:form>
<table align="center">
    <tr>
        <td style="font-style: italic; color: red;">${message}</td>
    </tr>
</table>
    <h1>nyaw</h1>
        <button id="server_time">hoho</button> <br/>
        <p id="id_time">${firstname}</p> 
</body>
</html>
