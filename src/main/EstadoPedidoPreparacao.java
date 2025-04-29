package src.main;
public class EstadoPedidoPreparacao extends EstadoPedido {

    private EstadoPedidoPreparacao() {};
    private static EstadoPedidoPreparacao instance = new EstadoPedidoPreparacao();
    public static EstadoPedidoPreparacao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "em preparação.";
    }

    public boolean encaminhar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCaminho.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        return true;
    }

}