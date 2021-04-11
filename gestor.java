/** 
 * @author Javier Sebastián Valle Balsells Carnet 20159 
 * 
 * Clase gestor: En esta clase se va a gestionar todo lo relacionado a gestionar el archivo diccionario.text y el otro archivo con un documento en cualquier idioma (inglés, español, fraancés)
 * 
 * 
 * El diccionario contiene asociaciones de palabras en inglés, español y francés. 
 * Estas palabras proceden a pasar a un árbol en donde se guardó el diccionario de forma in-order. 
 * 
 * Por otro lado, debe haber un segundo archivo que contenga un doc con oraciones en cualquier idioma y se debe decidir el idioma de origen y el idioma destino. 
 * Se debe traducir cada palabra al idioma destino. Si en caso hay una palabra que no está en el diccionario, entonces se deja intacta la palabra encerrada en astericos.
 * 
 * 
 * Referencias: 
 * 
 * Apertura de archivo: https://geekytheory.com/como-leer-un-fichero-en-java
 * 
 * In-order insertion del árbol: https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/
 * 
 * 
 * */ 



import java.util.Scanner;
import java.io.*; 
import java.io.BufferedReader;

public class gestor {
    
    //Variables necesarias para poder hacer las llamadas a los métodos.
    static int ele = 0; 
    static Scanner eleccion = new Scanner(System.in);

    public static int menu(){

        System.out.println("Bienvenido al Diccionario inglés-español-francés");
         

         //Llamando métodos.......
         while(ele != 6){
          
          System.out.println("¿Qué desea hacer?");
          System.out.println("1. Ver el diccionario.");
          System.out.println("2. Traducir");
          System.out.println("6. Salir");

            ele = eleccion.nextInt(); //Leyendo lo que el usuario ingresa. 

            try {
              
              if(ele > 2 || ele < 0){
                //Si en caso el usuario elije una opción que no pertenece al menú.
                System.out.println("Esta opción no está en el menú.");
              }else{
                
                //Finalizando el programa, porque no se eligió la opción correcta.
                break;
              
              }
            } catch (Exception e) {
              //Mensaje de error. Esto es si ingresa mal una opción. 

              eleccion.nextLine(); //Ingreso incorrecto.

              System.out.println("Ingrese una opción númerica, pues eligió una opción no numérica.");
            }
         }

          //Llamadas definitivas.
          if(ele == 1){abrirDiccionario();} //Llamando al método de abrirDiccionario, correspondiente a la clase gestor. (Esta clase :Vs)
          if/(ele == 2){abrirTexto();} //Llamando al método de abrirTexto, correspondiente a la clase gestor. (Esta clase :V)

          return ele; //Retorno de la elección.
     }
    

    /*                 AQUÍ ABRO LOS ARCHIVOS Y LOS MANDO A OTROS MÉTODOS              */
     public static String abrirDiccionario(){
        
        String lector = ""; //Esta será la variable que retornará.

        //Try-catch para evitar clavos.
        try {
          
          //Abriendo formalmente el archivo.
          File Diccio = new File("diccionario.txt"); //Variable para buscar el archivo.
          //Scanner palabras = new Scanner(Diccio); //Leyendo el archivo.
          
          /* Encargados de procesar el archivo diccionario.txt */

          FileReader fr = new FileReader(Diccio); 
          BufferedReader buff = new BufferedReader(fr);
          
          lector = buff.readLine(); //Leyendo las líneas del archivo.

          /* Impriendo las líneas del archivo que no estén vacías */
          while((lector = buff.readLine()) != null){

                //Instancia de la clase Nodo.
                //Nodo nodo = new Nodo(lector);

                //Ordenando el diccionario.
                Tree m = new Tree();
                m.insert(lector);
                System.out.println("Rama: ");
                m.inOrder();

          }
          
          fr.close(); 


        } catch (Exception ArchivoNoEncontrado) {
            //Error en caso de que no estén los archivos.
            System.out.println("El archivo no existe en los directorios.");
        }
      
          return lector; 
         }


      /*      Método para abrir el archivo de texto llamado "texto.txt" con las oraciones que posea, en el idioma que sea      */
      public static String abrirTexto(){
        String lector = ""; //Esta será la variable que retornará.

        //Try-catch para abrir el archivo texto.txt
        try {
        
          //Abriendo formalmente el archivo.
          File Text = new File("texto.txt"); //Variable para buscar el archivo.
          //Scanner palabras = new Scanner(Diccio); //Leyendo el archivo.
          
          /* Encargados de procesar el archivo diccionario.txt */

          FileReader fr = new FileReader(Text); 
          BufferedReader buff = new BufferedReader(fr);
          
          lector = buff.readLine(); //Leyendo las líneas del archivo.
          
        } catch (Exception ArchivoNoEncontrado) {
          //TODO: handle exception
        }

        return lector; 
      }
}
