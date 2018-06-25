<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <p>Adicionar cozinha</p>
        <form method="POST" action="../FrontController?action=GravarCozinha">
            <p>
                Identificador da cozinha: <input type="text" name="id_Cozinha" size="50">
            </p>
            <p>
                Nome da Cozinha: <input type="text" name="nomeCozinha" size="20">
            </p>
            <p>
                <input type="submit" value="Submit" target="frame">
            </p>
        </form>
    </body>
</html>