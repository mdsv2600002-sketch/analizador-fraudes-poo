public class Transaccion {
    private String id;
    private double monto;
    private double scoreFraude;
    private String estado;
    private Cuenta cuentaOrigen;
    private Comercio comercioDestino;
    private Dispositivo dispositivo;
    private AlertaFraude alerta;

    public Transaccion(String id, double monto, Cuenta cuentaOrigen, Comercio comercioDestino, Dispositivo dispositivo) {
        this.id = id;
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.comercioDestino = comercioDestino;
        this.dispositivo = dispositivo;
        this.scoreFraude = 0.0;
        this.estado = "PROCESANDO";
    }

    public void evaluarRiesgo() {
        if (dispositivo.getDireccionIP().isEsVpn() || "HighRisk".equalsIgnoreCase(comercioDestino.getCategoriaMcc())) {
            this.scoreFraude = 0.94;
            this.estado = "BLOQUEADA";
            this.alerta = new AlertaFraude("ALT-501", "IP_Sospechosa_VPN", "Alta");
        } else {
            this.scoreFraude = 0.05;
            this.estado = "APROBADA";
        }
    }

    public void mostrarDetalle() {
        System.out.println("==================================================");
        System.out.println("Transacción ID: " + id);
        System.out.println("Cliente: " + cuentaOrigen.getTitular().getNombre());
        System.out.println("Monto: $" + monto);
        System.out.println("Score Fraude: " + scoreFraude);
        System.out.println("Estado: " + estado);
        if (alerta != null) {
            alerta.mostrarAlerta();
        }
        System.out.println("==================================================");
    }
}
