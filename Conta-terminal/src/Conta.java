import java.util.Scanner;
public class Conta {
    int numero;
    String nomeCliente, agencia;
    double saldo;
    Scanner scanner = new Scanner(System.in);

    public void criar(){
        System.out.println("Por favor, digite seu nome! ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o numero da conta! ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o numero da agência! ");
        agencia = scanner.next();
        System.out.println("por favor, digite o valor do seu saldo! ");
        saldo = scanner.nextFloat();
        System.out.println("Olá, "+ nomeCliente + ", obrigado por criar uma conta no nosso banco sua agencia é, " + agencia+ ", conta "+ numero + " e seu saldo R$" + saldo +" já esta disponivel para saque.");

    }
}
