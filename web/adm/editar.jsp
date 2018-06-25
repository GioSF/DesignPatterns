<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <p>Editar cliente</p>
        <form method="POST" action="../FrontController?action=EditarCozinha">
            <p>
                Identificador da cozinha: <input type="text" name="id_Cozinha" size="50">
            </p>
            <p>
                Nome da cozinha: <input type="text" name="nomeCozinha" size="20">
            </p>
            <p>
                <input type="submit" value="Submit" target="frame">
            </p>
        </form>
    </body>
</html>