/**
 * @author Javier Sebastián Valle Balsells, carnet 20159 
 * 
 * 
 * Clase Nodo, será utilizada para el Árbol Binario.
 * 
 * 
 * Referencia: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

public class Nodo
{
    
    private String dato;
    private NodoCadena izquierda, derecha;

    public Nodo(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }

    public NodoCadena getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoCadena izquierda) {
        this.izquierda = izquierda;
    }

    public NodoCadena getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoCadena derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }

    

}