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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Teclee la Matrícula del estudiante que desea buscar: ");
        String estudiantebuscado = scanner.nextLine();
        int estaen = -1;
        for (int x = 0; x <= estudiantes.length-1; x++) {
            if (estudiantes[x] == null) { 
                continue; 
            }
            if (estudiantes[x].matricula.equals(estudiantebuscado)) { // .equals sirve como funcion de comparacion en un string
                estaen = x;
                break;
            }
        }
        if (estaen > -1) {
            System.out.println("--------------------------------------------");
            System.out.println("Nombre: " + estudiantes[estaen].nombre);
            System.out.println("Edad: " + estudiantes[estaen].edad);
            System.out.println("Matricula: " + estudiantes[estaen].matricula);
            System.out.println("Carrera: " + estudiantes[estaen].carrera);
            System.out.println("--------------------------------------------");
        }
        else {
            System.out.println("No se encontro el estudiante");
        }

    }
  
   static void deleteStudent() {
        if (numEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
        String matricula = scanner.nextLine();
    
        int index = -1;
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].matricula.equals(matricula)) {
                index = i;
                break;
            }
        }
    
        if (index == -1) {
            System.out.println("No se encontró un estudiante con esa matrícula.");
            return;
        }
    
        // Desplazar los elementos para evitar huecos en la lista
        for (int i = index; i < numEstudiantes - 1; i++) {
            estudiantes[i] = estudiantes[i + 1];
        }
    
        // Eliminar la última referencia y actualizar el contador
        estudiantes[numEstudiantes - 1] = null;
        numEstudiantes--;
    
        System.out.println("Estudiante eliminado con éxito.");

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
