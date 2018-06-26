<!doctype html>
<html lang=''>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
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
                                <li><a onclick="loadDoc('adm/adicionar')"><span>Adicionar cozinha</span></a></li>
                                <li><a onclick="loadDoc('adm/editar')"><span>Editar cozinha</span></a></li>
                                <li><a onclick="loadDoc('adm/listarCoz')"><span>Listar cozinhas</span></a></li>
                                <li><a onclick="loadDoc('adm/listarAli')"><span>Listar comidas</span></a></li>
                                <li class='last'><a onclick="loadDoc('adm/apagar')"><span>Apagar cozinha</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class='active has-sub'><a href='#'><span>Cozinha</span></a>
                    <ul>
                        <li class='has-sub'><a href='#'><span>Administrar Alimento</span></a>
                            <ul>
                                <li><a onclick="loadDoc('coz/adicionar')"><span>Adicionar alimento</span></a></li>
                                <li><a onclick="loadDoc('coz/editar')"><span>Editar alimento</span></a></li>
                                <li><a onclick="loadDoc('coz/listar')"><span>Listar alimento</span></a></li>
                                <li class='last'><a onclick="loadDoc('coz/apagar')"><span>Apagar alimento</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class='has-sub'><a href='#'><span>Atendimento</span></a>
                    <ul>
                        <li><a onclick="loadDoc('att/adicionar')"><span>Adicionar pedido</span></a></li>
                        <li><a onclick="loadDoc('att/editar')"><span>Editar pedido</span></a></li>
                        <li><a onclick="loadDoc('att/listar')"><span>Listar pedido</span></a></li>
                        <li class='last'><a onclick="loadDoc('att/apagar')"><span>Apagar pedido</span></a></li>
                    </ul>
                </li>
                <li class='last'><a href='#'><span>Contato</span></a></li>
            </ul>
        </div>

        <div id="frameConteudo">
        </div>
        <div id="variavel">
        </div>

        <script>
            function loadDoc(x) {
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        document.getElementById("frameConteudo").innerHTML = this.responseText;
                        document.getElementById("variavel").innerHTML = x;
                    }
                };
                xhttp.open("GET", "./" + x + ".jsp", true);
                xhttp.send();
            }
        </script>

    </body>

</html>