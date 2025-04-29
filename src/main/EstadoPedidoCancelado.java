package src.main;
public class EstadoPedidoCancelado extends EstadoPedido {

    private EstadoPedidoCancelado() {};
    private static EstadoPedidoCancelado instance = new EstadoPedidoCancelado();
    public static EstadoPedidoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "cancelado.";
    }

}
