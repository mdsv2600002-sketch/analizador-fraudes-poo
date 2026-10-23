public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("CLI-01", "Diego Chavez", "bajo");
        Cuenta cuenta = new Cuenta("ACC-101", "Debito", 25000, cliente);
        Comercio comercio = new Comercio("MER-880", "CryptoExchange Inc", "HighRisk");
        
        DireccionIP ip = new DireccionIP("185.220.101.5", "RU", true);
        Dispositivo dispositivo = new Dispositivo("00:1B:44:11:3a:B7", "Android 13", ip);

        Transaccion tx = new Transaccion("TX-9982", 125000, cuenta, comercio, dispositivo);
        
        tx.evaluarRiesgo();
        tx.mostrarDetalle();
    }
}
