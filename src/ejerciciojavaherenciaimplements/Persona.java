package ejerciciojavaherenciaimplements;

public abstract class Persona implements IOperable {

    private String rut;
    private String nombre;
    private boolean vacante;

    public Persona() {
        rut = new String("Sin rut");
        nombre = new String("Sin nombre");
        vacante = false;
    }

    public Persona(String rut, String nombre, boolean vacante) {
        setRut(rut);
        setNombre(nombre);
        setVacante(vacante);
    }

    //devuelve el rut
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getVacante() {
        return vacante;
    }

    public void setVacante(boolean vacante) {
        this.vacante = vacante;
    }

    public void ImprimirStatus() {
        System.out.println("-------------");
        System.out.println(rutNombre());
        System.out.println(SiNo());
        System.out.println("-------------");
    }

    public String SiNo() {
        return getVacante() ? "Si":"No";
    }

    public String rutNombre() {
        return "Rut: " + getRut() + "\n"
                + "Nombre: " + getNombre();
    }

}
