package bilheteriacinema;
// @author Marcelo Neves
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Familia extends Ingresso {
    private int quantidadePessoas;
    private static final int MINIMO_DESCONTO = 4;
    private static final BigDecimal PERCENTUAL_DESCONTO = new BigDecimal("0.05");

    public Familia(BigDecimal valorBase, String nomeFilme, TipoAudio audio, int quantidadePessoas) {
        super(valorBase, nomeFilme, audio);
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public BigDecimal calcularValorReal() {
        BigDecimal totalBruto = getValorBase().multiply(new BigDecimal(String.valueOf(quantidadePessoas)));

        if (quantidadePessoas >= MINIMO_DESCONTO) {
            BigDecimal desconto = totalBruto.multiply(PERCENTUAL_DESCONTO);
            return totalBruto.subtract(desconto).setScale(2, RoundingMode.HALF_UP);
        } else {
            return totalBruto.setScale(2, RoundingMode.HALF_UP);
        }
    }
}
