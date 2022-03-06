package desafio.dio;

/**
 * @author Margarida Gomes
 */
public class Main {

    public static void main(String[] args) {
        
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        
        Conta corrente = new ContaCorrente(maria);
        Conta poupanca = new ContaPoupanca(maria);
            
        
        corrente.imprimir();
        poupanca.imprimir();
        
        corrente.depositar(250);
        corrente.transferir(200, poupanca);
        
        corrente.imprimir();
        poupanca.imprimir();
        
        
  
    }
    
}
