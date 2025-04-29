package src.main;

public class EstadoPedidoRecebido extends EstadoPedido {

    private EstadoPedidoRecebido() {};
    private static EstadoPedidoRecebido instance = new EstadoPedidoRecebido());
    public static EstadoPedidoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "recebido.";
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoPreparacao.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        return true;
    }

}