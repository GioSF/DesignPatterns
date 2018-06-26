<div class="limiter">
    <div class="container-table100">
        <div class="wrap-table100">
            <div class="table">
                <div class="row header">
                    <div class="cell">
                        Identificador
                    </div>
                    <div class="cell">
                        Alimento
                    </div>
                </div>
                <c:forEach items="${alimentos}" var="alimento">
                    <div class="row">
                        <div class="cell" data-title="id">
                            ${alimento.id_Alimento}
                        </div>
                        <div class="cell" data-title="nome">
                            ${alimento.nomeAlimento}
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>    