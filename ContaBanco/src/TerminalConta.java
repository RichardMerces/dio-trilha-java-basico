import java.text.MessageFormat;
import java.util.Scanner;
public class TerminalConta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo disponível:");
        float saldo = sc.nextFloat();
        String saldoFormatado = String.format("%.2f", saldo);

        var messagem = MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo R${3} já está disponível para saque.",nomeCliente, agencia, conta, saldoFormatado);

        System.out.println(messagem);
    }
}
