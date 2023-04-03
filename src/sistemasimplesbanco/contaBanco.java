
package sistemasimplesbanco;

import javax.swing.JOptionPane;

public class contaBanco {
    // CC = CONTA CORRENTE
    // CP = CONTA POUPANÇA
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("////////////////////");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("////////////////////");
    }
    //métodos
    public void abrirConta(String t){
        this.setTipo(t);
        this.status = true;
        if (t == "CC") {
            this.saldo = 50;
        }else if (t == "CP"){
            this.saldo = 150;
        }
        JOptionPane.showMessageDialog(null, "Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta não pode ser fechada (ainda tem dinheiro)!");            
        }else if (this.getSaldo() < 0 ){
             System.out.println("A conta não pode ser fechada (ainda tem crédito)!");    
        }else{
            this.setStatus(false);
            JOptionPane.showMessageDialog(null, "Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.status == true){
            this.setSaldo(this.getSaldo() +v);
             System.out.println("Depósito realizado com sucesso na conta de: "+this.getDono());    
        }else {
            System.out.println("É impossível depositar em uma conta fechada! ");
           
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v );
                System.out.println("Saque realizado na conta de: "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível de uma conta fechada");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
         v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso por: " + this.getDono());
        } else{
            JOptionPane.showMessageDialog(null, "Impossível pagar uma conta fechada!");
        }
    }
    
    
    //métodos especiais, sempre que criar uma conta, tanto o saldo quando o status vão estar zerados
    public void contaBanco (){
        this.saldo = 0;
        this.status = false;
    }
    
    //get e set dos atributos
    public void setnumConta(int n){
        this.numConta = n;
    }
    public int getnumConta(){
        return this.numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
