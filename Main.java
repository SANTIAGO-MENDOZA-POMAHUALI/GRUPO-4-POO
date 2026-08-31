// Main.java — prueba de la clase Estudiante
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ana García", 1001, 16.5);
        Estudiante e2 = new Estudiante("Luis Torres", 1002, 14.0);
        Estudiante e3 = new Estudiante("Rosa Díaz", 1003, 18.0);

        Estudiante e4 = new Estudiante("Oscar Urrelo", 1004, 20.0);
        Estudiante e5 = new Estudiante("Melody Zarate", 1005, 19.0);
        Estudiante e6 = new Estudiante("Jorge Ramírez", 1006, 15.0);

        Estudiante e7 = new Estudiante("Ana Robles", 1007, 16.5);
        Estudiante e8 = new Estudiante("Paola García", 1008, 15.5);
        Estudiante e9 = new Estudiante("Juan Perez", 1009, 17.5);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
        e4.mostrarInfo();
        e5.mostrarInfo();
        e6.mostrarInfo();
        e7.mostrarInfo();
        e8.mostrarInfo();
        e9.mostrarInfo();

        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());
    }
}