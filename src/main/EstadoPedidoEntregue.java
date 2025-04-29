package src.main;
public class EstadoPedidoEntregue extends EstadoPedido {

    private EstadoPedidoEntregue() {};
    private static EstadoPedidoEntregue instance = new EstadoPedidoEntregue();
    public static EstadoPedidoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "entregue.";
    }

}