public class Dispositivo {
    private String mac;
    private String so;
    private DireccionIP direccionIP;

    public Dispositivo(String mac, String so, DireccionIP direccionIP) {
        this.mac = mac;
        this.so = so;
        this.direccionIP = direccionIP;
    }

    public String getMac() { return mac; }
    public String getSo() { return so; }
    public DireccionIP getDireccionIP() { return direccionIP; }
}
