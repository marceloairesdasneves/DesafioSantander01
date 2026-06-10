// @author Marcelo Neves

import java.util.Scanner;

void main() {
    System.out.println("Hello my first Java Class!");
    try (Scanner scanner = new Scanner(System.in)) {
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();

        var resultado = number1 + number2;
        System.out.println("The result of the sum is: " + resultado);

    } catch (Exception e) {
        System.out.println("An error occurred: ");
    }
}

public static int sum(int number1, int number2) {
    return number1 + number2;
}
