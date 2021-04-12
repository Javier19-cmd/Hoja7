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
    
    private String word;    //La información está en el nodo.
    private Nodo left;   //Puntero del subárbol izquierdo.
    private Nodo right;  //Puntero del subárbol derecho.

    /**
     * Se iguala la variable word a s para así añadir el valor de la/las palabras a añadir al diccionario.
     * 
     * Los nodos left y right se inicializan como nulos, pues el árbol está vacío inicialmente.
     * 
     * @param s se envía como parámetro el valor de la palabra que se desea añadir.
     */

    public Nodo(String s){
        word = s;
        left = null;
        right = null;
    }


    /**
     * Este método es usado para poder añadir los valores a las ramas del árbol
     * 
     * @param value se envía como parámetro el valor de las ramas.
     */

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

    /**
     * Se cuenta la cantidad de nodos hacia donde la raíz apunta.
     * 
     * @param root el valor de la raíz.
     * @return el conteo total de nodos que pertenecen al árbol.
     */
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

    /**
     * 
     * @post se regresa el valor del nodo derecho.
     * @return el valor del nodo/s derecho.
     */
    public Nodo getRight(){
        return right;
    }

    /**
     * @post se regresa la palabra deseada.
     * @return palabra que se desea obtener.
     */
    public String getWord(){
        return word;
    }



}