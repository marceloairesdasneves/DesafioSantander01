package bilheteriacinema;

public enum TipoAudio {
    DUBLADO("Dublado"),
    LEGENDADO("Legendado");

    private final String descricao;
    TipoAudio(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return "TipoAudio{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
