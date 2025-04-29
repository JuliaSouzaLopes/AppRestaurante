package src.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTeste {

    @Test
    void deveNotificarCliente() {
        ITipoPedido tipoPedido = TipoPedidoFactory.obterPedido("CurtaDistancia");
        Pedido pedido = new Pedido (EstadoPedidoRecebido.getInstance(), tipoPedido);
        Cliente cliente = new Cliente ("Julia");
        cliente.fazerPedido(pedido);
        pedido.atualizacao();
        assertEquals("Julia, seu pedido está recebido.", cliente.getUltimaNotificacao);
    }

}