// @author Marcelo Neves
import java.time.OffsetDateTime;
import java.util.Scanner;

void main() {
    var baseYear = OffsetDateTime.now().getYear();
    try (var scanner = new Scanner(System.in)) {
        System.out.print("Digite seu nome: ");
        var nome = scanner.nextLine();
        System.out.print("Digite o seu ano de nascimento: ");
        var ano = scanner.nextInt();

        System.out.printf("Olá %s, você tem %d anos.", nome, baseYear - ano);

    }
}

