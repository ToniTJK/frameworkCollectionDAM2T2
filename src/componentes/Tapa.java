package componentes;

public class Tapa extends Componente {
    public static int totalTapas = 1;
    private Double diametro;

    public Tapa(String descripcion, Tipo material, Double diametro) {
        super(descripcion, material);
        this.diametro = diametro;
    }

    public static void getTotalTapas() {
        int result = totalTapas-1;
        System.out.println("Total de Tapas: " + result);}

    public int getId() {return totalTapas++;}

    public Double getDiametro() {return diametro;}

    public Double getRadio(){
        return diametro/2;
    }

    @Override
    public Double getSuperficie() {
        return getRadio()*getRadio()*Math.PI;
    }

    @Override
    public Double getPerimetro() {
        return 2*Math.PI*getRadio();
    }

    @Override
    public String toString() {
        return "Tapa: " + "\n"+
                "ID: " + getId() + "\n"+
                "Descripción: " + getDescripcion() + "\n"+
                "TipoMaterial: " + getMaterial() + "\n"+
                "Radio: " + getRadio() + "\n"+
                "Superficie: " + getSuperficie() + "\n"+
                "Perimetro: " + getPerimetro() + "\n"+
                //"Total de Tapas: " + getTotalTapas() + "\n"+
                //"Total de Componente: " + getContadorComp() + "\n"+
                "-------------------------";
    }
}
class Main2 {

    public static void main(String[] args) {
        Tapa t1 = new Tapa("hola", Tipo.HOJALATA, 20.0);
        Tapa t2 = new Tapa("ralf", Tipo.ACERO, 10.0);
        Tapa t3 = new Tapa("hola", Tipo.HOJALATA, 20.0);
        Tapa t4 = new Tapa("ralf", Tipo.ACERO, 10.0);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        Tapa.getTotalTapas();
    }
}


