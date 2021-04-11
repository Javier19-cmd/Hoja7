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
    
    private String word;    // The data in this node.
    private Nodo left;   // Pointer to the left subtree.
    private Nodo right;  // Pointer to the right subtree.

    public Nodo(String s){
        word = s;
        left = null;
        right = null;
    }


    public void add(String value) {

        if (left == null) {     
            left = new Nodo(value);     
        } else if( right == null){      
            right = new Nodo(value);            
        } else {        
            if(countNodes(left) <= countNodes(right)){               
                left.add(value);                
            } else {        
                right.add(value);

            }   
        }
    }

    //Count the nodes in the binary tree to which root points, and
    public static int countNodes( Nodo root ) {
        if ( root == null ){

            // The tree is empty.  It contains no nodes.
            return 0;  

                }else {

            // Start by counting the root.
            int count = 1;   


            // Add the number of nodes in the left subtree.
            count += countNodes(root.left);

            // Add the number of nodes in the right subtree.
            count += countNodes(root.right); 

            return count;  // Return the total.
        }
    }

        public Nodo getLeft(){
        return left;
    }

    public Nodo getRight(){
        return right;
    }

    public String getWord(){
        return word;
    }



}