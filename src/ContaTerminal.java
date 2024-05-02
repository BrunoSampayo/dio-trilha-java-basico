import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de abertura de contas");

        System.out.println("Entre com o nome do cliente");
        nomeCliente = sc.nextLine();

        System.out.println("Entre com a agencia do Cliente");
        agencia = sc.nextLine();

        System.out.println("Entre com numero da Conta do Cliente");
        numeroConta = sc.nextInt();

        System.out.println("Entre com o saldo do Cliente");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar conta em nosso banco, sua agência é " + agencia
                + ", conta nº " + numeroConta + " e seu saldo " + saldo + " já esta disponivel para saque.");

    }

}
