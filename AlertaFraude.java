public class AlertaFraude {
    private String id;
    private String tipoRegla;
    private String severidad;

    public AlertaFraude(String id, String tipoRegla, String severidad) {
        this.id = id;
        this.tipoRegla = tipoRegla;
        this.severidad = severidad;
    }

    public void mostrarAlerta() {
        System.out.println("⚠️ ALERTA DE FRAUDE [" + id + "]: Regla = " + tipoRegla + " | Severidad = " + severidad);
    }
}
