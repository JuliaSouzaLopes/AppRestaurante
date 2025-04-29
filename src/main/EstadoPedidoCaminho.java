package src.main;
public class EstadoPedidoCaminho extends EstadoPedido {

    private EstadoPedidoCaminho() {};
    private static EstadoPedidoCaminho instance = new EstadoPedidoCaminho();
    public static EstadoPedidoCaminho getInstance() {
        return instance;
    }

    public String getEstado() {
        return "a caminho.";
    }


    public boolean entregar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        return true;
    }

}