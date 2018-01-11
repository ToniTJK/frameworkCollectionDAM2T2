package componentes;

public abstract class Componente {
    public static int totalComponentes = 0;
    private int id;
    private String descripcion;
    private Tipo material;

    public Componente(String descripcion, Tipo material) {
        this.id = totalComponentes++;
        this.descripcion = descripcion;
        this.material = material;
    }

    // GETTER & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getMaterial() {
        return material;
    }

    public void setMaterial(Tipo material) {
        this.material = material;
    }

    //Methods

    public static void getContadorComp(){System.out.println("Total de Componente: " + totalComponentes);}

    public abstract Double getSuperficie();

    public abstract Double getPerimetro();

    @Override
    public String toString() {
        return "Componente{" +
                "id=" + totalComponentes +
                ", descripcion='" + descripcion + '\'' +
                ", material=" + material +
                '}';
    }
}
