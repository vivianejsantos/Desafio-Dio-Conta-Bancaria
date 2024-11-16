//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    Cliente c = new Cliente("viviane");

    c.setNome("Viviane");

    Conta cc =new ContaCorrente(c);

    cc.imprimirExtrato();
    }
}