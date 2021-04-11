/**
 * @author Javier Sebastián Valle Balsells, carnet 20159 
 * 
 * 
 * Clase Nodo, será utilizada para el Árbol Binario.
 * 
 * 
 * Referencia: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

//Imports para poder hacer el diccionario.
import java.util.LinkedList;
import java.util.Queue;

public class Nodo {
    
    //Variables a usar.
    int key;     
    Nodo left, right; 

    //Constructor
    Nodo(int key)
    {
        this.key = key;
        left = null;
        right = null;
    }

    //Creando más variables.
    Nodo root; 
    Nodo temp = root; 

    //Método para insertar elementos de manera transversal de un árbol binario.
    void inorder(Nodo temp){
        
        if(temp == null){
            return; //Return vacío en caso de que la variable temporal esté vacía.
        }

        inorder(temp.left); //Agregando elementos desde la izquierda.
        System.out.println(temp.key + " "); //Imprimiendo los elementos que se van guardando.
        inorder(temp.right); //Agregando elementos desde la derecha. 

    }

    //Insertando elementos al árbol binario.
    void insert(Nodo temp, int key){
        
        //En caso de que la variable temporal esté vacía, se crea una nueva raíz. 
        if(temp == null){
            root = new Nodo(key); //Creando la nueva raíz.
            return;
        }

        /*   Agregando elementos en la cola  */
        Queue<Nodo> q = new LinkedList<Nodo>();
        q.add(temp);

        /* Haciendo el orden por niveles transversales hasta que se encuentren espacios vacíos */
        while(!q.isEmpty()){
            
            temp = q.peek(); 
            q.remove();

            if(temp.left == null){
                //Si en caso la rama de la izquierda está inicialmente vacío, entonces se crea una en ese espacio.
                temp.left = new Nodo(key);
                break; 
            
            }else{ //En caso de que la rama esté ocupada, se crea otra debajo de la misma.
                q.add(temp.left);
            }

            if(temp.right == null){
                //Si en caso la rama de la derecha está inicialmente vacía, entonces se crea una nueva en ese espacio. (Lo mismo que con la rama izquierda :V)
                break; 
            }else{
                //En caso de que la rama esté llena, entonce se crea otra rama adicional. (Igual que con la rama derecha :V)
                q.add(temp.right);
            }
        }
    }
}
