package bilheteriacinema;
// @author Marcelo Neves
import java.math.BigDecimal;

public abstract class Ingresso {
    private BigDecimal valorBase;
    private final String nomeFilme;
    private final TipoAudio audio;

    public Ingresso(BigDecimal valorBase, String nomeFilme, TipoAudio audio) {
        this.valorBase = valorBase;
        this.nomeFilme = nomeFilme;
        this.audio = audio;
    }
    public BigDecimal getValorBase() {
        return valorBase;
    }
    public String getNomeFilme() {
        return nomeFilme;
    }
    public TipoAudio getAudio() {
        return audio;
    }
    public abstract BigDecimal calcularValorReal();
}
