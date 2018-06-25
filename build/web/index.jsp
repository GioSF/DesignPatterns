<!doctype html>
<html lang=''>
    <head>
        <meta charset='utf-8'>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/styles.css">
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="js/script.js"></script>
        <title>DeliveryPatterns</title>

    </head>
    <body>

        <div id='cssmenu'>
            <ul>
                <li><a href='#'><span>DeliveryPatterns</span></a></li>
                <li class='active has-sub'><a href='#'><span>Administração</span></a>
                    <ul>
                        <li class='has-sub'><a href='#'><span>Administrar Cozinhas</span></a>
                            <ul>
                                <li><a onclick="loadDoc('adicionar')"><span>Adicionar cozinha</span></a></li>
                                <li><a href="./adm/editar.jsp"><span>Editar cozinha</span></a></li>
                                <li><a href="./adm/listarCozinhas.jsp"><span>Listar cozinhas</span></a></li>
                                <li><a href="./adm/listarComidas"><span>Listar comidas</span></a></li>
                                <li class='last'><a href="./adm/apagar.jsp"><span>Apagar cozinha</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Cozinha</span></a>
                    <ul>
                        <li class='has-sub'><a href='#'><span>Administrar Comidas</span></a>
                            <ul>
                                <li><a href='#'><span>Adicionar comida</span></a></li>
                                <li><a href='#'><span>Editar comida</span></a></li>
                                <li><a href='#'><span>Listar comida</span></a></li>
                                <li class='last'><a href='#'><span>Apagar comida</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class='has-sub'><a href='#'><span>Atendimento</span></a>
                    <ul>
                        <li><a href='#'><span>Adicionar pedido</span></a></li>
                        <li><a href='#'><span>Editar pedido</span></a></li>
                        <li><a href='#'><span>Listar pedido</span></a></li>
                        <li class='last'><a href='#'><span>Apagar pedido</span></a></li>
                    </ul>
                </li>
                <li class='last'><a href='#'><span>Contact</span></a></li>
            </ul>
        </div>

        <div id="frameConteudo">
        </div>

        <script>
            function loadDoc(x) {
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        document.getElementById("frameConteudo").innerHTML = this.responseText;
                    }
                };
                xhttp.open("GET", "./adm/adicionar.jsp", true);
                xhttp.send();
            }
        </script>

    </body>

</html>