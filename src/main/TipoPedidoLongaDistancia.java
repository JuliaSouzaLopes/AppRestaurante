package src.main;

public class TipoPedidoLongaDistancia implements ITipoPedido {

    public String getTipoPedido(){
        return "Entrega a longa distância";
    }

    public float getFrete(){
        return 10.0;
    }

}