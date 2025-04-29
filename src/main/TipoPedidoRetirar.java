package src.main;

public class TipoPedidoRetirar implements ITipoPedido {

    public String getTipoPedido(){
        return "Retirar no restaurante";
    }

    public float getFrete(){
        return 0.0;
    }

}