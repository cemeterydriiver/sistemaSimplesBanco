
package sistemasimplesbanco;

public class SistemaSimplesBanco {

    public static void main(String[] args) {
        // CC = CONTA CORRENTE
        // CP = CONTA POUPANÇA
        
       //Conta corrente da pessoa 1:
       contaBanco p1 = new contaBanco();
       p1.setNumConta(11111);
       p1.setDono("Javackson");
       p1.abrirConta("CC");
       
       //Conta poupança da pessoa 2:
       contaBanco p2 = new contaBanco();
       p2.setNumConta(2222);
       p2.setDono("Javana");
       p2.abrirConta("CP");
       
       //Fazer depósitos:
       p1.depositar(100);
       p2.depositar(500);
       
       //Fazer saques:
       p2.sacar(250);
      
       //Fechar conta;
       p1.fecharConta();
       
       //Estados atuais das contas:
       p1.estadoAtual();
       p2.estadoAtual();
       
      
    }
    
}
