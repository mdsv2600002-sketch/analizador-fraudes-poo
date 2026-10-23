public class DireccionIP {
    private String ip;
    private String pais;
    private boolean esVpn;

    public DireccionIP(String ip, String pais, boolean esVpn) {
        this.ip = ip;
        this.pais = pais;
        this.esVpn = esVpn;
    }

    public String getIp() { return ip; }
    public String getPais() { return pais; }
    public boolean isEsVpn() { return esVpn; }
}
