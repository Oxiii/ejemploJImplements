package ejerciciojavaherenciaimplements;

public class Proyecto {

    private String nombreProyecto;

    public Proyecto() {
        nombreProyecto = new String("Sin proyecto");
    }

    public Proyecto(String nombreProyecto) {
        setNombreProyecto(nombreProyecto);
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

}
