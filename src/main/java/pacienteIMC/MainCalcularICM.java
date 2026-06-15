package pacienteIMC;

// @author Marcelo Neves

import java.util.Scanner;

public class MainCalcularICM {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Bem vindo vamos calcular o seu IMC");

            //entrada de dados
            System.out.println("Digite a altura do paciente: ");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do paciente: ");
            double peso = scanner.nextDouble();


            double calcularIMC = peso / Math.pow(altura, 2);

            System.out.println("O IMC do paciente é: " + calcularIMC);

        }


    }
}
