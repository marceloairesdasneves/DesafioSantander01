package contabancaria;
// @author Marcelo Neves
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;

        Scanner input = new Scanner(System.in);
        OperacaoBancaria operacaoBancaria = new OperacaoBancaria();

        entradaDadosCliente(input, operacaoBancaria);
        System.out.println("\nCliente: " + operacaoBancaria.getNome());

        System.out.println("-----------------------");
        System.out.println("\nBem vindo ao banco JAVA");
        System.out.println("-----------------------");
        menu(op);
        do {
            System.out.print("Digite o numero da operação desejada: ");
            op = input.nextInt();
            System.out.println("----------------------------------------------");

            switch (op) {
                case 1 -> operacaoBancaria.consultarSaldo(); //1 - Consultar saldo
                case 2 -> operacaoBancaria.consultarChequeEspecial(); //2 - Consultar Limite do cheque especial
                case 3 -> operacaoBancaria.depositarDinheiro(input); //3 - Depositar dinheiro
                case 4 -> operacaoBancaria.sacarDinheiro(input); //4 - Sacar dinheiro
                case 5 -> operacaoBancaria.pagarBoleto(input); //5 - Pagar boleto
                case 6 -> {
                    System.out.println("Seu saldo: " + operacaoBancaria.consultarSaldo());
                    System.out.println("Ate logo. Obrigado por usar o banco JAVA, volte sempre!");
                }
                default -> System.out.println("Opção inválida, tente novamente!");
            }
        } while (op != 6);
    }

    public static void entradaDadosCliente(Scanner input, OperacaoBancaria operacaoBancaria){
        System.out.print("\nDigite o nome do cliente: ");
        operacaoBancaria.setNome(input.nextLine());
        System.out.print("O cliente esta usando o cheque especial? (S/N): ");
        operacaoBancaria.setIsUsandoChequeEspecial(input.nextLine());
    }

    public static void menu(int op){
        System.out.println("\n1 - Consultar saldo");
        System.out.println("2 - Consultar Limite do cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar boleto");
        System.out.println("6 - Sair");
        System.out.println("----------------------------------------------");
    }


}