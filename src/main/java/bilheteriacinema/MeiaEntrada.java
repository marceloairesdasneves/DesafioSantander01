package bilheteriacinema;
// @author Marcelo Neves
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MeiaEntrada extends Ingresso {
    @Override
    public BigDecimal calcularValorReal() {
        return getValorBase().divide(new BigDecimal("2"), 2, RoundingMode.HALF_UP);

    }
    public MeiaEntrada(BigDecimal valorBase, String nomeFilme, TipoAudio audio) {
        super(valorBase, nomeFilme, audio);
    }


}
