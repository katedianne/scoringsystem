<%--
  Created by IntelliJ IDEA.
  User: JC
  Date: 23/08/2019
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <style>
        <%@include file="../resources/css/bootstrap.min.css" %>
    </style>

    <script>
        <%@include file="../resources/js/jquery-3.4.1.min.js" %>
        <%@include file="../resources/js/bootstrap.min.js" %>




        $(document).ready(function () {
            alert("hello");
            $("#btnLogin").click(function(){
                alert("hello");

                var login = {
                    username : $("#inputUsername").val(),
                    password :  $("#inputPassword").val()
                };

                alert(JSON.stringify(login));

                $.ajax({
                    url:"loginProcess1",
                    type:"POST",
                    contentType: "application/json",
                    data: JSON.stringify(login), //Stringified Json Object
//                    async: false,    //Cross-domain requests and dataType: "jsonp" requests do not support synchronous operation
//                    cache: false,    //This will force requested pages not to be cached by the browser
//                    processData:false, //To avoid making query String instead of JSON
                    dataType : 'json',
                    success: function(response){
                       alert(response);
                       alert(response.username);
                    }
                });
            });
        });



    </script>
</head>
<body>
<div class="container">
    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                </div>
                                <form class="user" >
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-user" name="username" id="inputUsername" aria-describedby="emailHelp" placeholder="Enter Username...">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control form-control-user" name="password" id="inputPassword" placeholder="Password">
                                    </div>
                                    <button type="button" id="btnLogin" class="btn btn-primary btn-user btn-block">Login</button>

                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="forgot-password.html">Forgot Password?</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>

</div>

</body>
</html>
