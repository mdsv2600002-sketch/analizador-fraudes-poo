public class Cuenta {
    private String numero;
    private String tipo;
    private double saldo;
    private Cliente titular;

    public Cuenta(String numero, String tipo, double saldo, Cliente titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Cliente getTitular() { return titular; }
}
