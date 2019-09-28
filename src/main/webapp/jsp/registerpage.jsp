<%-- 
    Document   : registerpage
    Created on : Aug 28, 2019, 12:45:50 AM
    Author     : Kate Dianne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./styles.css">

<script>
    <%@include file="../resources/js/jquery.min.js" %>
    <%@include file="../resources/js/popper.min.js" %>
    <%@include file="../resources/js/bootstrap.min.js" %>
</script>
<style>
    <%@include file="../resources/css/bootstrap.min.css" %>
    <%@include file="../resources/css/styles.css" %>
</style>
</head>

<body>

<div class="container register-form">
            <div class="form">
                <div class="note">
                    <p>Register now! To experience the easiest way to score points!</p>
                </div>

                <form action="register" method="post">
                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Username *" value="" name="username" id="username"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Email Address *" value="" name="email" id="email"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Password *" value="" name="password" id="password"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Confirm Password *" value=""/>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit" name="register">Submit</button>
                </div>
                </form>
            </div>
        </div>

</body>        
</html>
