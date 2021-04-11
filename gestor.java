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
          System.out.println("1. Ver las palabras disponibles.");
          System.out.println("0. Salir");

            ele = eleccion.nextInt(); //Leyendo lo que el usuario ingresa. 

            try {
              
              if(ele > 1 || ele < 0){
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
          if(ele == 1){abrirDiccionario();} //Llamando al método de abrirDiccionario, correspondiente a la clase gestor.

          return ele; //Retorno de la elección.
     }
    

    /*                 AQUÍ ABRO LOS ARCHIVOS Y LOS MANDO A OTROS MÉTODOS              */
     public static void abrirDiccionario(){
        
        //Try-catch para evitar clavos.
        try {
          
          //Abriendo formalmente el archivo.
          File Diccio = new File("diccionario.txt"); //Variable para buscar el archivo.
          //Scanner palabras = new Scanner(Diccio); //Leyendo el archivo.
          FileReader fr = new FileReader(Diccio); 
          BufferedReader buff = new BufferedReader(fr);
          
          String lector = buff.readLine(); 


          while((lector = buff.readLine()) != null){

            System.out.println(lector);

          }
          
          fr.close();          

          /*
          //Imprimiendo para probar que se esté abriendo y leyendo.
          if(palabras.hasNextLine()){
                //Imprimiendo el contenido del archivo.
                System.out.println(palabras);

          }else{
            //Mensaje de error.
            System.out.println("El archivo no tiene nada dentro.");
          }*/


        } catch (Exception ArchivoNoEncontrado) {
            //Error en caso de que no estén los archivos.
            System.out.println("El archivo no existe en los directorios.");
        }
      }
}
