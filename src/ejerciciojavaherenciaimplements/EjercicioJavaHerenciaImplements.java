package ejerciciojavaherenciaimplements;

public class EjercicioJavaHerenciaImplements {
    public static void main(String[] args) {
        Proyecto pro = new Proyecto("educar");
        Profesor p = new Profesor("fijo", pro,"18946948-9","Juan",true);
        p.rutNombre();
        p.ImprimirStatus();
        p.toString();
    }
    
}
