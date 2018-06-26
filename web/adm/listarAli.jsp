<div class="limiter">
    <div class="container-table100">
        <div class="wrap-table100">
            <div class="table">
                <div class="row header">
                    <div class="cell">
                        Identificador
                    </div>
                    <div class="cell">
                        Comida
                    </div>
                </div>
                <c:forEach items="${comidas}" var="comida">
                    <div class="row">
                        <div class="cell" data-title="id">
                            ${comida.id_Comida}
                        </div>
                        <div class="cell" data-title="nome">
                            ${comida.nomeComida}
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>    