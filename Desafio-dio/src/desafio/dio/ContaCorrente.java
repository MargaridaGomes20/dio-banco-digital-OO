package desafio.dio;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println("---Extrato conta corrente---");
        super.imprimir();
    } 
}
