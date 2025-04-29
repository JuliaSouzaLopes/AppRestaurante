package src.main;

import java.util.Observable;
import java.util.Observer;

public class Pedido implements Observable {

    private EstadoPedido estado;
    private ITipoPedido tipoPedido;

    

    public Pedido(EstadoPedido estado, ITipoPedido tipoPedido) {
         this.estado = estado;
         this.tipoPedido = tipoPedido;
     }

     public void setEstado(EstadoPedido estado) {
        this.estado = estado;
     }

     public boolean receber(){
        return estado.receber(this);
     }

     public boolean preparar(){
        return estado.preparar(this);
     }

     public boolean encaminhar(){
        return estado.encaminhar(this);
     }

     public boolean entregar(){
        return estado.entregar(this);
     }

     public boolean cancelar(){
        return estado.cancelar(this);
     }

     public String getNomeEstado(){
        return estado.getEstado();
     }

     public EstadoPedido getEstado(){
        return estado;
     }

    public void atualizacao() {
         setChanged();
         notifyObservers();
     }

}