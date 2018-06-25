<%-- 
    Document   : listarUser
    Created on : May 6, 2018, 9:51:00 AM
    Author     : gsf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Cozinhas</title>
    </head>
    <body>
        <div class="limiter">
            <div class="container-table100">
                <div class="wrap-table100">
                    <div class="table">
                        <div class="row header">
                            <div class="cell">
                                Identificador
                            </div>
                            <div class="cell">
                                Cozinha
                            </div>
                        </div>
                        <c:forEach items="${cozinhas}" var="cozinha">
                            <div class="row">
                                <div class="cell" data-title="Full Name">
                                    ${cozinha.id_Cozinha}
                                </div>
                                <div class="cell" data-title="Age">
                                    ${cozinha.nomeCozinha}
                                </div>
                            </div>
                        </c:forEach>
                        </div>
                    </div>
                </div>
            </div>    
            <a href="index.jsp">Retornar ao início</a>
    </body>
    </body>
</html>
