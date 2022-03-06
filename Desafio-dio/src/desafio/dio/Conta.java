package desafio.dio;

public abstract class Conta implements Iconta{
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    
    private static final int agencia_padrao = 1;
    private static int sequencial = 1;
    
    public Conta(Cliente cliente){
        this.agencia = Conta.agencia_padrao;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
    }
    
    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    protected void imprimir(){
        System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d ", agencia));
        System.out.println(String.format("Número: %d ", numeroConta));
        System.out.println(String.format("Saldo: %.2f ", saldo));
    
    }
    
    
}
