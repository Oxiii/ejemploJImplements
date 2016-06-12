package ejerciciojavaherenciaimplements;

public class Estudiante extends Persona {

    private boolean alumnoRegular;

    public Estudiante() {
        super();
        alumnoRegular = false;
    }

    public Estudiante(String rut, String nombre, boolean vacante, boolean alumnoRegular) {
        super(rut, nombre, vacante);
        setAlumnoRegular(alumnoRegular);
    }

    public boolean getAlumnoRegular() {
        return alumnoRegular;
    }

    public void setAlumnoRegular(boolean alumnoRegular) {
        this.alumnoRegular = alumnoRegular;
    }

    public void ImprimirStatusEstudiante() {
        System.out.println(this);
    }

    @Override
    public String SiNo() {
        return getAlumnoRegular()? "Si":"No";
    }

    @Override
    public String toString() {
        return super.rutNombre() + "\n" 
                + "Vacante ?" + super.SiNo() + "\n"
                + "Alumno regular: " + SiNo();
    }
}
