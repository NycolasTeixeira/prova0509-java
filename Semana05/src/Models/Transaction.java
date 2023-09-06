
package Models;

import java.util.Date;


public class Transaction {
    
public Conta contaId;
public Date data;
public String tipoTrans;
public double valor;

    public Transaction(Conta contaId, Date data, String tipoTrans, double valor) {
        this.contaId = contaId;
        this.data = data;
        this.tipoTrans = tipoTrans;
        this.valor = valor;
    }

   public Conta getId(){
       return this.getId();
   }

    public Date getData() {
        return new Date();
    }

    public String getTipoTrans() {
        return tipoTrans;
    }

    public double getValor() {
        return valor;
    }




}
