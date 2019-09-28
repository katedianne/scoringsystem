<%-- 
    Document   : loginpage
    Created on : Aug 27, 2019, 3:52:40 AM
    Author     : Kate Dianne
--%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <link  href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link  href="${contextPath}/resources/css/styles.css" rel="stylesheet">
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/popper.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
    
    

    
</head>

<body>

    <form action="loginProcess" method="post">
    <div class="container register-form" style="width:30%">
        <div class="form">
            <div class="note">
                <p>LOG IN</p>
            </div>
            
            <div class="form-content">
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="username" id="username" value="" />
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" id="password" value="" />
                    </div>
                </div>
            </div>
            
        </div>
        <button type="submit" class="btnSubmit" name="login" >Submit</button>
    </div>
    </form>
</body>

</html>