package desafio.dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println("---Extrato conta poupança---");
        super.imprimir();
    }
     
}
