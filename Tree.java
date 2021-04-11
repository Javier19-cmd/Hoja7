/**
 * @author Javier Sebastián Valle Balsells, carnet 20159
 * 
 * Referencia: https://www.daniweb.com/programming/software-development/threads/450817/binary-tree-using-strings-and-recursion
 * 
 */
public class Tree <E>{

    public Nodo root; //Instancia de la clase nodo.

    //Constructor.
    public Tree(){

        root = null;

    }

    //Regersando la raíz.
    public Nodo returnRoot(){
        return root;
    }

    //Verificando si el árbol está vacío o no.
    public boolean isEmpty(){

        return root == null;

    }

    //Insertando los valores al árbol.
    public void insert(String value){

        if(isEmpty()){

            root = new Nodo(value);

        }else{

            root.add(value);

        }
    }
        //Obteniendo la raíz del árbol.
        public Nodo getRoot(){
            return root;
        } 

        //Regresando el árbol de la forma in-order.
         public void inOrder() {
          inOrder(root);
    }

        // Realizando el in-order.
       public void inOrder(Nodo root) {
         if (root != null) {            

       inOrder(root.getLeft());        // izquierda.
       System.out.println(root.getWord());   // raíz.
       inOrder(root.getRight());       // derecha.
    }

    }
}