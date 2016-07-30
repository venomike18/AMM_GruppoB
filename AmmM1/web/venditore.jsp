<%-- 
    Document   : venditore
    Created on : 4-lug-2016, 21.02.39
    Author     : medas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <title>The BrewHouse Shop - Vendi Birre Artigianali </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Vendere, vendite, Birra Artigianale, Birre artigianali, Beer, Birra Fatta in Casa, Vendita Birre Online, Birra Artigianale Italiana, Beer-shop, Beer-Store, Migliori Birre, Vendere Bicchieri, Boccali, Birre Italiane">
        <meta name="description" content="Vendi Online Birre Artigianali Italiane, amplia il nostro scafale online vendendo pure le tue super Birre.">
        <meta name="author" content="Michele Medas - Mat: 65089">
        <!--Link al foglio di stile style.css-->
        <link rel="stylesheet" type="text/css" media="screen" href="style.css">
    </head>


    <body>
        <!-- Menu Navigazione  -->
        <div id="page">
            <nav>
                <ul>
                    <li class="currentpage"> <a href="venditore.html">Venditore</a> </li>
                    <li><a href="./">Descrizione</a></li>
                    <li><a href="login.html">Login</a></li>
                </ul> 
            </nav>  
            <header></header> 

            <jsp:include page="sidebar.jsp" />

            <!-- Verifica se l'utente è un venditore  -->
            <c:if test="${venditore == null}">
                <jsp:include page= "logout.jsp" />
            </c:if>

            <!-- Se l'utente loggato è un venditore  -->
            <c:if test="${venditore != null}">
                <!-- Form di inserimento prodotti per Venditori --> 
                <div id="content">
                    <h1>Vendi un Prodotto</h1>
                    <fieldset>
                        <form action="venditore.html" method="GET">
                            <label for="oggetto">Nome dell’oggetto:</label>
                            <input type="text" name="oggetto" id="oggetto" required>
                            <label for="immagine">URL dell'Immagine:</label>
                            <input type="url" name="immagine" id="immagine" required>
                            <label for="descrizione">Descrizione dell'oggetto:</label>
                            <textarea rows="8" cols="40" name="descrizione" 
                                      id="descrizione" required>Inserisci la descrizione del prodotto
                            </textarea>
                            <label for="prezzo">Prezzo del Prodotto (€):</label>
                            <input type="number" name="prezzo" min="0" max="1000" step="0.05" value="0" id="prezzo" required>
                            <label for="quantità">Quantità disponibile:</label>
                            <input type="number" name="quantità" min="0" max="1000" step="1" value="0" id="quantità" required>
                            <input type="submit" name="invia" value="Invia">
                            <input type="reset" name="reset" value="Reset">
                        </form>  
                    </fieldset>
                </div>
            </c:if>
            
            <!-- Footer -->
            <jsp:include page="footer.jsp" />
        </div> 
    </body>
</html>