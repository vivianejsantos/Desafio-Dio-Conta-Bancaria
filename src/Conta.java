public abstract class Conta implements Iconta{

    private static final String AGENCIA = "0001";
    private static int NUMEROCONTA = 1;


    protected double saldo;
    protected int numero;
    protected Cliente cliente;

    //construtor


    public Conta( Cliente cliente) {
        this.cliente= cliente;
        this.saldo = saldo;
        this.numero = NUMEROCONTA++;
    }


    @Override
    public String toString() {
        return "Conta{" +
                numero +  "Saldo"+ saldo +
                '}';
    }




    //métodos
    @Override
    public void sacar(int valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(int valor) {
        saldo +=valor;
    }

    @Override
    public void transferir(int valor) {

    }
    public void informacoesExtrato() {
        System.out.printf("Titular %s\n",cliente.getNome());
        System.out.printf("Numero da agência: %s\n", this.AGENCIA);
        System.out.printf("Numero da Conta: 000%d\n", this.numero);
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
        System.out.println();

    }
}
