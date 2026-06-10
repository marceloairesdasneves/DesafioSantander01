// @author Marcelo Neves

import java.util.Scanner;

void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Quanto e 2 + 2 ?");
    var result = scanner.nextInt();
    var wrong = result != 4;
    if (wrong) {
        System.out.println("Resposta errada, tente novamente!");
    } else {
        System.out.println("Resposta correta, parabens!");
    }
}
