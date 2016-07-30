<%-- 
    Document   : sidebar
    Created on : 4-lug-2016, 20.37.54
    Author     : medas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="sidebar">
    
    <!-- Menu Navigazione Lato SX  -->
    <h2> Menu</h2>
    <ul>
        <li><a href="./">Descrizione</a></li>
        <li><a href="login.html">Login</a></li>
        <li><a href="venditore.html">Vendi</a></li>
        <li><a href="cliente.html">Cliente</a></li>
    </ul>
    
    <!-- Link ai Social  -->
    <div id="share-buttons">
        <h2> Social</h2>
        <!-- Facebook -->
        <a href="http://www.facebook.com" ><img src="img/facebook.png" alt="Facebook"/></a> 
        <!-- Google+ -->
        <a href="http://www.plus.google.com"><img src="img/google.png" alt="Google"/></a>              
        <!-- LinkedIn -->
        <a href="http://www.linkedin.com"><img src="img/linkedin.png" alt="Linkedin"/></a>
        <!-- Twitter -->
        <a href="http://www.twitter.com"><img src="img/twitter.png" alt="Twitter"/></a>           
    </div> 
    
    <!-- Saldo utente corrente loggato  -->
    <h2> Saldo</h2>
    <c:if test="${sessionScope.cliente != null}">
        ${cliente.getSaldo()}€
    </c:if>
</div>
