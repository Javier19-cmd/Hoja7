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
 * 
 * 
 * */ 



import java.util.Scanner;
import java.io.*; 
import java.io.BufferedReader;
import java.util.ArrayList;

public class gestor {
    
  /**
   * Creación de variables que se utilizarán para poder hacer las elecciones dentro del menú de inicio.
   * 
   */
    static int ele = 0; 
    static Scanner eleccion = new Scanner(System.in);

    /**
     * Este método se utilizará para poder enseñarle al usuario las opciones que tiene para poder usar el diccionario.
     * 
     * @return de la elección realizada.
     */
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
          if(ele == 1){abrirDiccionario(); menu();} //Llamando al método de abrirDiccionario, correspondiente a la clase gestor. (Esta clase :Vs)
          if(ele == 2){abrirTexto(); menu();} //Llamando al método de abrirTexto, correspondiente a la clase gestor. (Esta clase :V)

          return ele; //Retorno de la elección.
     }
    

    /**
     * Este método es usado para poder abrir el diccionario y poder enviar a la clase Tree las palabras con su traducción de inglés-español-francés.
     * 
     * @return lector, esta variable retorna los valores que se están ingresando desde el archivo de texto.
     */

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
                //Tree m = new Tree();
                //m.insert(lector);
                
                Tree ar = new Tree();
                ar.insertar(lector);
                System.out.println("Rama: ");
                ar.inorden();
                //m.inOrder();

          }
          
          fr.close(); 


        } catch (Exception ArchivoNoEncontrado) {
            //Error en caso de que no estén los archivos.
            System.out.println("El archivo no existe en los directorios.");
        }
      
          return lector; //Retornando los valores de lector. 
         }

      /**
       * 
       * Este método abre un archivo .txt llamado texto.txt el cual contiene oraciones que se originan de un idioma y que deben estar traducidas a otro idioma (puede ser inglés-español-francés)
       * 
       * 
       * @return texto, el cual contendrá el string de las oraciones originaridas de un archivo con extención .txt llamado texto.txt.
       */
      public static String abrirTexto(){
        String texto = ""; //Esta será la variable que retornará.

        ArrayList dato = new ArrayList();

        Tree ar = new Tree();

        abrirDiccionario();



        //Try-catch para abrir el archivo texto.txt
        try {
        
          //Abriendo formalmente el archivo.
          File Text = new File("texto.txt"); //Variable para buscar el archivo.
          
          FileReader fr = new FileReader(Text);  //Leyendo el archvio.
          
          BufferedReader br = new BufferedReader(fr); //Procesando el archivo.

          texto = br.readLine(); //Leyendo las líneas del archivo.

          String[] arrSplit = texto.split(" ");

          for(int i = 0; i < arrSplit.length; i++)
          {
            //System.out.println(arrSplit[i]);

            ar.existe(arrSplit[i]);
          
            System.out.println(ar.existe(arrSplit[i]));
          }
          
          /* Encargados de procesar el archivo texto.txt */

          

        } catch (Exception ArchivoNoEncontrado) {
          System.out.println("Archivo no encontrado entre los ficheros.");
        }

        return texto; //Retornando los valores de texto.
      }
}
