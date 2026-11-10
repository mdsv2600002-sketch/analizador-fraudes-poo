import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AnalizadorFraudesDemo {

    // 1. API java.util.regex para validación de patrones de IP v4
    private static final Pattern PATRON_IP = Pattern.compile(
        "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.){3}(25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)$"
    );

    public static boolean validarIP(String ip) {
        return ip != null && PATRON_IP.matcher(ip).matches();
    }

    public static void main(String[] args) {
        System.out.println("=== SISTEMA ANALIZADOR DE FRAUDES FINANCIEROS ===");

        // Validación de IP usando Expresiones Regulares (java.util.regex)
        String ipEvaluada = "192.168.1.45";
        boolean esIpValida = validarIP(ipEvaluada);
        System.out.println("Validación de IP (" + ipEvaluada + "): " + (esIpValida ? "VÁLIDA" : "INVÁLIDA"));

        // 2. Uso de java.time API para estampar la marca temporal exacta de la transacción
        LocalDateTime fechaTransaccion = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha y hora del análisis: " + fechaTransaccion.format(formato));

        // Simulación de historial de montos de transacciones
        List<Double> historialMontos = List.of(150.0, 4500.0, 89.0, 12000.0, 300.0, 25000.0);

        // 3. Uso de java.util.stream API para filtrar transacciones de alto riesgo (>= $4,000)
        double umbralRiesgo = 4000.0;
        List<Double> transaccionesSospechosas = historialMontos.stream()
                .filter(monto -> monto >= umbralRiesgo)
                .collect(Collectors.toList());

        System.out.println("\n[ALERTA DE SEGURIDAD DETECTADA]");
        System.out.println("Transacciones que superan el umbral ($" + umbralRiesgo + "):");
        transaccionesSospechosas.forEach(monto -> System.out.println(" - Alerta por monto elevado: $" + monto));
    }
}
