<%-- 
    Document   : index
    Created on : 16-sep-2010, 14:16:26
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link id="hojaDeEstilo" rel="stylesheet" type="text/css"
              href="css/estilo.css" media="screen" />
        <title>Crear Personaje</title>
    </head>
    <body>
        <h1>Crea tu personaje !</h1>
        <form name="frmPersonaje" action="SumadorServlet" method="get">
            <table>
                <tr>
                    <td>
                        Usuario: 
                    </td>
                    <td>
                        <input name="nombre" type="text" placeholder="Ingrese su nombre de usuario" required><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        Elija la clase de personaje:
                    </td>
                    <td>
                        <label>
                            <input name="clase" type="radio" value="orco" id="orco" checked="">
                            <img src="img/orco.png">
                        </label>
                        <label>
                            <input name="clase" type="radio" value="humano">
                            <img src="img/humano.png     ">
                        </label>
                        <label>
                            <input name="clase" type="radio" value="elfo">
                            <img src="img/elfo.png     ">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>
                        Tipo de arma:
                    </td>
                    <td>
                        <label>                        
                            <input name="arma" type="radio" value="espada">
                            <img src="img/espada.png">
                        </label>
                        <label>
                            <input name="arma" type="radio" value="arco">
                            <img src="img/arco.png">
                        </label>
                        <label>                        
                            <input name="arma" type="radio" value="hacha">
                            <img src="img/hacha.png">
                        </label>
                    </td>
                </tr>              
                <tr>
                    <td>
                        Tipo de armadura:
                    </td>
                    <td>
                        <label>
                            <input name="armadura" type="radio" value="aLigera">
                            <img src="img/armaduraLigera.png">
                        </label>
                        <label>
                            <input name="armadura" type="radio" value="aPesada">
                            <img src="img/armaduraPesada.png">
                        </label>
                        <label>
                            <input name="armadura" type="radio" value="aGuerrero">
                            <img src="img/armaduraDeGuerrero.png">
                        </label>
                    </td>
                </tr>                
                <tr>
                    <td>
                        <input type="submit">
                    </td>
                </tr>
        </form>
    </body>
</html>
