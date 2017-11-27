<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quejate</title>
    </head>

    <body>
        <form id="user" method="post">
            Nombre del producto<br/>
            <input type="text" name="product" required/><br/>
            Asunto<br/>
            <input type="text" name="asunto" required/><br/>
            Observacion<br/>
            <textarea rows="4" cols="50" name="comment">Comentario</textarea><br/>
            Imagen de la falla<br/>
            <input type="file" name="adjunto"/><br/>
            Telefono:<br/>
            <input type="tel" name="usrtel" required><br/>
            Correo:<br/>
            <input type="email" name="email" required><br/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
