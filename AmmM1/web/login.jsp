<%-- 
    Document   : login
    Created on : 4-lug-2016, 21.01.44
    Author     : medas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Effettua l'accesso su The BrewHouse Shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Birra Artigianale, Birre artigianali, Beer, Hand-Made Beer, Birra Fatta in Casa, Vendita Birre Online, Vendita Birra, Birra Artigianale Italiana, Beer-shop, Beer-Store, Birroteca, Migliori Birre, Bicchieri, Boccali, Negozio Birra ">
        <meta name="description" content="Accedi alla tua area Riservata, per poter acquistare o vendere Birre Artigianali e Bicchieri online">
        <meta name="author" content="Michele Medas - Mat: 65089">
        <!--Link al foglio di stile style.css-->
        <link rel="stylesheet" type="text/css" media="screen" href="style.css">
    </head>


    <body>
        <!-- Menu Navigazione  -->
        <div id="page">  
            <nav>
                <ul>
                    <li class="currentpage"> <a href="login.html">Login</a> </li>
                    <li><a href="./">Descrizione</a></li>
                    <li><a href="cliente.html">Clienti</a></li>
                    <li><a href="venditore.html">Venditori</a></li>
                </ul>
            </nav>  
            <header></header> 

            <!-- Menu Navigazione Lato SX  -->
            <jsp:include page="sidebar.jsp" />


            <!-- Form per Effettuare l'accesso -->
            <div id="content">
                <h1>Accedi alla tua Area Riservata</h1>
                <fieldset>
                    <!-- Test per verificare dati di accesso -->
                    <c:if test="${(errore != null)}">
                        <h2>Username o Password Errati, riprova!</h2>     
                    </c:if>

                    <form action="login.html" method="post">
                        <label for="user">Username:</label>
                        <input type="text" name="user" id="user" required>
                        <label for="pswd">Password:</label>
                        <input type="password" name="pswd" id="pswd" required>
                        <input type="submit" name="login" value="Login" id="login"/>
                        <input type="reset" name="reset" value="Reset">
                    </form>
                </fieldset>
            </div> 

            <!-- Footer -->
            <jsp:include page="footer.jsp" />
        </div> 
    </body>
</html>






