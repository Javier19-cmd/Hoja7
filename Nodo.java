/**
 * @author Javier Sebastián Valle Balsells, carnet 20159 
 * 
 * 
 * Clase Nodo, será utilizada para el Árbol Binario.
 * 
 * 
 * Referencia: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

public class Nodo {
    
    private String word;    // The data in this node.
    private Nodo left;   // Pointer to the left subtree.
    private Nodo right;  // Pointer to the right subtree.

    public Nodo(String s){
        word = s;
        left = null;
        right = null;
    }

    //Método para poder añadir los valores de las ramas del árbol.
    public void add(String value) {

        if (left == null) { 
            //Si en caso la rama izquierda está vacía, entonces se introduce el valor del String en esa rama.    
            left = new Nodo(value);
        } else if( right == null){
            //Si en caso la rama derecha está vacía, entonces se introduce el valor del String en esa rama.
            right = new Nodo(value);            
        } else {
            //En caso de que los nodos de la izquierda son menos que los de la derecha, entonces se empiezan a añadir valores a la izquierda.
            if(countNodes(left) <= countNodes(right)){               
                left.add(value);
            } else {
                //En caso de que los nodos de la derecha son menos que los de la izquierda, entonces se empiezan a añadir valores a la derecha.
                right.add(value);

            }   
        }
    }

    //Cuenta los nodos del árbol binario hacia donde la raíz apunta.
    public static int countNodes( Nodo root ) {
        if ( root == null ){
            //Retorna cero si el árbol está vacío.
            return 0;  

                }else {

            // Se hace un conteo de los nodos en caso de que el árbol tenga contenido.
            int count = 1;   

            //Cuenta el número de nodos en el subárbol izquierdo.
            count += countNodes(root.left);

            //Cuenta el número de nodos del subárbol izquierdo.
            count += countNodes(root.right); 

            return count;  //Regresa el total de las raíces.
        }
    }

    //Obteniendo el nodo/nodos izquierdo/izquierdos.
    public Nodo getLeft(){
        return left;
    }

    //Obteniendo el nodo/nodos derecho/derechos.
    public Nodo getRight(){
        return right;
    }

    //Obtiene la palabra.
    public String getWord(){
        return word;
    }



}