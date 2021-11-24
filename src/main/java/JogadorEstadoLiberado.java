public class JogadorEstadoLiberado {
    private JogadorEstadoLiberado() {};
    private static JogadorEstadoLiberado instance = new JogadorEstadoLiberado();
    public static JogadorEstadoLiberado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Liberado";
    }
}
