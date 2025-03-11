import java.util.Scanner;

public class Main {

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