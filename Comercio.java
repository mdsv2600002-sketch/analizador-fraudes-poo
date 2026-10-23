public class Comercio {
    private String id;
    private String nombre;
    private String categoriaMcc;

    public Comercio(String id, String nombre, String categoriaMcc) {
        this.id = id;
        this.nombre = nombre;
        this.categoriaMcc = categoriaMcc;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoriaMcc() { return categoriaMcc; }
}
