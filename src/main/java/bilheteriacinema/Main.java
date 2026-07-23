package bilheteriacinema;
// @author Marcelo Neves

import java.math.BigDecimal;
import java.text.Format;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args){
        Format formatoMoeda = new java.text.DecimalFormat("#,##0.00");
        // Criação de ingressos
        Ingresso ingresso1 = new MeiaEntrada(new BigDecimal("20.00"), "Filme A", TipoAudio.DUBLADO);
        Ingresso ingresso2 = new Familia(new BigDecimal("80.00"), "Filme B", TipoAudio.LEGENDADO, 5);

        // Cálculo do valor real dos ingressos
        out.println("Valor real do ingresso 1: R$ " + formatoMoeda.format(ingresso1.calcularValorReal()));
        out.println("Valor real do ingresso 2: R$ " + formatoMoeda.format(ingresso2.calcularValorReal()));




    }
}
