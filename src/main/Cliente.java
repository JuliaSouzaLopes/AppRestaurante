package src.main;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void fazerPedido(Pedido pedido) {
        pedido.addObserver(this);
    }

    public void update(Observable pedido, Object arg1) {
        this.ultimaNotificacao = this.nome + ", seu pedido está " + pedido.getNomeEstado();
    }

}