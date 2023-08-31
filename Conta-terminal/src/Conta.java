import java.util.Scanner;
public class Conta {
    int numero, senha;
    String nome, agencia;
    double saldo = 100;
    Scanner scanner = new Scanner(System.in);

    public void criar(){
        System.out.println("digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite o numero da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite o numero da agência: ");
        agencia = scanner.next();
        System.out.println("Crie uma senha : ");
        senha = scanner.nextInt();
        System.out.println("Conta criada com sucesso! ");

    }
    public void consultarExtrato(){
        System.out.println("Nome : "+ nome + " Numero: " + numero+ " Agência: "+ agencia);
        System.out.println("Saldo :"+saldo);
    }
}
