package ejerciciojavaherenciaimplements;

public class Profesor extends Persona {

    private String tipoContrato;
    private Proyecto proyecto;

    public Profesor() {
        super();
        proyecto = new Proyecto();
    }

    public Profesor(String tipoContrato, Proyecto proyecto) {
        setTipoContrato(tipoContrato);
        setProyecto(proyecto);
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void ImprimirStatusProfesor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.rutNombre() + "\n"
                + "Contrato: " + getTipoContrato() + "\n"
                + "Proyecto: " + getProyecto();
    }
}
