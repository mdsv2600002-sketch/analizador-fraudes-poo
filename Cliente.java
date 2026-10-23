public class Cliente {
    private String id;
    private String nombre;
    private String nivelRiesgo;

    public Cliente(String id, String nombre, String nivelRiesgo) {
        this.id = id;
        this.nombre = nombre;
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNivelRiesgo() { return nivelRiesgo; }
}
