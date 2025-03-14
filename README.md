# Gestor de Estudiantes

Este proyecto es un programa en Java que permite gestionar un listado de estudiantes. Ofrece opciones para agregar, mostrar, buscar y eliminar estudiantes mediante un menú interactivo en la consola.

## Características
- Agregar estudiantes con nombre, edad, matrícula y carrera.
- Mostrar la lista de estudiantes registrados.
- Buscar estudiantes por matrícula.
- Eliminar estudiantes del registro.
- Menú interactivo para navegar entre las opciones.

## Requisitos
- Java Development Kit (JDK) 8 o superior.
- Un entorno de desarrollo como IntelliJ IDEA, Eclipse o VS Code.

## Uso
1. Clona este repositorio en tu máquina local:
   ```sh
   git clone https://github.com/tu-usuario/gestor-estudiantes.git
   ```
2. Compila el código fuente con:
   ```sh
   javac Main.java
   ```
3. Ejecuta el programa:
   ```sh
   java Main
   ```
4. Sigue las instrucciones del menú para gestionar estudiantes.
   
## Capturas de Pantalla

A continuación, se presentan algunas capturas de pantalla del programa en ejecución:

Menú principal:<br><br>
<img src="Assets P2/menu.jpg" alt="" width="300">  

Agregando un estudiante: <br> <br>
<img src="Assets P2/agregar 2.jpg" alt="100" width="300"> 
<img src="Assets P2/agregar.jpg" alt="" width="350"> 

Listado de estudiantes: <br> <br>
<img src="Assets P2/mostrar.jpg" alt="" width="350"> 


Buscar un estudiante: <br> <br>
<img src="Assets P2/buscar.jpg" alt="" width="450"> 

Eliminar un estudiante: <br> <br>
<img src="Assets P2/eliminar.jpg" alt="" width="650"> 

Listado de estudiantes después de eliminar un alumno: <br> <br>
<img src="Assets P2/mostrar2.jpg" alt="" width="350"> 

Buscar un estudiante eliminado: <br> <br>
<img src="Assets P2/buscar2.jpg" alt="" width="550"> 

Salir: <br> <br>
<img src="Assets P2/salir.jpg" alt="" width="350"> 

## Código Principal
El código principal del programa se encuentra en `Main.java`, que contiene la lógica para manejar la gestión de estudiantes.

```java
public class Main {
    public static void main(String[] args) {
        menu();
    }
}
```

## Clases
- `Main`: Contiene el método principal y el flujo del programa.
- `Estudiante`: Representa la estructura de un estudiante con sus atributos.

## Autores
Desarrollado por 

Carranza Mercado Jesus Eduardo  
Gonzalez Pérez Monserrat  
Pérez Méndez Nancy Esmeralda  
Valencia Hernandez Kevin Guadalupe  
Zamudio Lopez Leonardo

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente.


