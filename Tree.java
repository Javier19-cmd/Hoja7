/**
 * @author Javier Sebastián Valle Balsells, carnet 20159
 * 
 * Referencia: https://www.daniweb.com/programming/software-development/threads/450817/binary-tree-using-strings-and-recursion
 * In-order insertion del árbol: https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/
 *  https://www.softwaretestinghelp.com/binary-search-tree-in-java/
 */
public class Tree
{

    public Nodo root; //Instancia de la clase nodo y de la raíz.

    /**
     * Constructor de la clase Nodo, aquí se vuelve la raíz nula, para que no hayan problemas.
     * 
     */
    public Tree(){

        root = null;

    }

    /**
     * @return root , se regresa la raíz para verificar que esté bien asignada.
     */
    public Nodo returnRoot(){
        return root;
    }

    /**
     * @return root == null, para verificar si la raíz está o no vacía.
     */
    public boolean isEmpty(){

        return root == null;

    }

    /**
     * Método encargado de ingresar los valores a las ramas del árbol.
     * 
     * @param value se envía el valor a ingresar.
     */
    public void insert(String value){

        if(isEmpty()){

            //Si en caso la raíz está vacía, entonces se envía el valor a esa posición.

            root = new Nodo(value); 

        }else{

            //Si no, se envía a otra parte que no sea la raíz.

            root.add(value);

        }
        
    }   

    public String buscar(Nodo aux, String str)
    {
        if(aux == null){
            return null;
        }
    }

        /**
         * Se regresa la raíz del árbol.
         * @return root , se regresa la raíz del árbol.
         */
        public Nodo getRoot(){
            return root;
        } 

        /**
         * Método encargado de regresar el árbol de forma in-order.
         */
         public void inOrder() {
          inOrder(root);
    }

        /**
         * Este método se encarga de hacer el ordenamiento in-order del árbol.
         * 
         * @param root se envía como parámetro la raíz.
         */
       public void inOrder(Nodo root) {
         if (root != null) {            

       inOrder(root.getLeft());        // izquierda.
       System.out.println(root.getWord());   // raíz.
       inOrder(root.getRight());       // derecha.
    }

    }
}