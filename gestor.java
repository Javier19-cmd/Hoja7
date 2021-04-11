import java.util.Scanner;
import java.io.*; 
import java.util.FileReader; 
import java.io.BufferedReader;

public class gestor {
     
    //Menú para el usuario.
    public static void menu(){

        //Imprimiendo el menú al usuario.
        System.out.println("Bienvenido al Diccionario inglés-español-francés");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Ver las palabras almacenadas.");
    }
    
    
    /*                 AQUÍ ABRO LOS ARCHIVOS Y LOS MANDO A OTROS MÉTODOS              */
     public static void abrirDiccionario(){
        
        //Try-catch para evitar clavos.
        try {
          
          //Abriendo formalmente el archivo.
          File Diccio = new File("diccionario.txt"); //Variable para buscar el archivo.
          Scanner palabras = new Scanner(Diccio); //Leyendo el archivo.

          //Imprimiendo para probar que se esté abriendo y leyendo.
          while(palabras.hasNextLine()){
                System.out.println(palabras);
          }

        } catch (Exception ArchivoNoEncontrado) {
            //Error en caso de que no estén los archivos.
            System.out.println("El archivo no existe en los directorios.");
        }
      }
}
