import java.util.Scanner;

public class Main {

    static Estudiante[] estudiantes = new Estudiante[100];
    static int numEstudiantes = 0;

    static void menu() {
        System.out.println("Gestor de estudiantes");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Buscar estudiante");
        System.out.println("4. Eliminar estudiante");
        System.out.println("5. Salir");
    }

    static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, matricula, carrera);
        estudiantes[numEstudiantes] = nuevoEstudiante;
        numEstudiantes++;

        System.out.println("Estudiante registrado con éxito.");
    }

    static void showStudents() {

    }

    static void searchStudent() {

    }

    static void deleteStudent() {

    }

    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option != 5) {
            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            menu();
            option = scanner.nextInt();
        }
    }
}

class Estudiante {
    String nombre;
    int edad;
    String matricula;
    String carrera;

    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
    }
}
