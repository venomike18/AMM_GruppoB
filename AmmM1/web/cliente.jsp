<%-- 
    Document   : descrizione
    Created on : 4-lug-2016, 20.59.59
    Author     : medas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>The BrewHouse Shop - Acquista Online Birre Artigianali Italiane</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Compra Birra Artigianale, Acquista Birre artigianali, buy Beer, Hand-Made Beer, Birra Fatta in Casa, Vendita Birre Online, Vendita Birra, Birra Artigianale Italiana, Beer-shop, Beer-Store, Birroteca, Migliori Birre, Bicchieri, Boccali, Negozio Birra">
        <meta name="description" content="Elenco di tutte le Birre Artigianali in vendita, troverai prezzi, quantità e potrei acquistarli in totale sicurezza">
        <meta name="author" content="Michele Medas - Mat: 65089">
        <!--Link al foglio di stile style.css-->
        <link rel="stylesheet" type="text/css" media="screen" href="style.css">
    </head>


    <body>
        <!-- Menu Navigazione  -->
        <div id="page">
            <nav>
                <ul>
                    <li class="currentpage"> <a href="cliente.html">Cliente</a> </li>
                    <li><a href="./">Descrizione</a></li>
                    <li><a href="login.html">Login</a></li>
                </ul>
            </nav>  
            <header></header> 
            
            <!-- Menu Navigazione Lato SX  -->
            <jsp:include page="sidebar.jsp"/>
            
            <c:if test="${cliente == null}">
                <jsp:include page= "logout.jsp" />
            </c:if>



            
            <!-- Tabella oggetti in Vendita -->
            <c:if test="${cliente != null}">
                <div id="content">
                    
                    <div id="acquistoConcluso"> 
                        <c:if test="${concluso == true}">  <h2>Ti ringraziamo per aver acquistato</h2> </c:if>
                        <c:if test="${concluso == false}"> <h2>Qualcosa è andato storto, credito insufficente</h2> </c:if>
                    </div>
                
                    <h1>Birre Artigianali</h1>
                    <table>
                        <tr class="intestazione"> 
                            <th>Nome</th>
                            <th>Foto</th>
                            <th>Quantità</th>
                            <th>Prezzo</th>
                            <th>Acquista</th>
                        </tr>
                        
                        <c:forEach var="obj" items="${lista}" >    
                            <tr class="dispari">
                                <td>${obj.getNome()}</td>
                                <td><img title="${obj.getNome()}" src="${obj.getImg()}" alt="Foto della Birra ${obj.getNome()}"></td>
                                <td>${obj.getQuantita()}</td>
                                <td>${obj.getPrezzo()}</td>
                                <td><a href="cliente.html?objId=${obj.id}"><img src="img/cart.png" width="30" alt="Aggiungi al carrello"/></a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </c:if>
            <!-- Footer -->
            <jsp:include page="footer.jsp" /> 
        </div>
    </body>
</html>
