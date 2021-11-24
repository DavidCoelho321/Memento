public class JogadorEstadoBanido {
    private JogadorEstadoBanido() {};
    private static JogadorEstadoBanido instance = new JogadorEstadoBanido();
    public static JogadorEstadoBanido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Banido";
    }
}
