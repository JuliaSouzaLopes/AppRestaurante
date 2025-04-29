package src.main;

public class TipoPedidoFactory {

    public static ITipoPedido obterPedido(String pedido) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("TipoPedido" + pedido);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Tipo inválido");
        }
        return (ITipoPedido) objeto;
    }
    
    
}