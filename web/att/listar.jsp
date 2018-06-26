<div class="limiter">
    <div class="container-table100">
        <div class="wrap-table100">
            <div class="table">
                <div class="row header">
                    <div class="cell">
                        Identificador
                    </div>
                    <div class="cell">
                        Pedido
                    </div>
                </div>
                <c:forEach items="${pedidos}" var="pedido">
                    <div class="row">
                        <div class="cell" data-title="id">
                            ${pedido.id_Pedido}
                        </div>
                        <div class="cell" data-title="nome">
                            ${pedido.nomePedido}
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>    
