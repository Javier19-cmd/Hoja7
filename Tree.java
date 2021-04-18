/**
 * @author Javier Sebastián Valle Balsells, carnet 20159
 * 
 * Referencia: https://parzibyte.me/blog/2020/05/08/arbol-binario-java/
 */
import java.util.ArrayList;

public class Tree 
{

    private NodoCadena raiz;

    public Tree() {
        //
    }

    /**
     * 
     * Método para validar si la palabra que se está enviando existe o no en el diccionario.
     * @param busqueda este es un String que recibe el método para validar su existencia en el diccionario.
     * @return retorna la palabra con su raíz.
     * 
     * 
    */
    public String existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    /**
     * Método para hacer las validaciones de cada palabra que se envía.
     * 
     * @param n este parámetro es el nodo del árbol.
     * @param busqueda palabra que recibe para validar su existencia en el diccionario.
     * @return retorno para ver si existe o no.
     */
    private String existe(NodoCadena n, String busqueda) {
        if (n == null) {
            return "El nodo está vacío";
        }
        if (n.getDato().equals(busqueda)) {
            return n.getDato();
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            n.imprimirDato();
            return existe(n.getIzquierda(), busqueda);
        } else {
            n.imprimirDato();
            return existe(n.getDerecha(), busqueda);
        }

    }

    /**
     * Este método es el que recibe la palabra que se ingresará en el diccionario.
     * 
     * @param dato palabra que recibe el árbol para poder ser ingresada en el diccionario.
     */
    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new NodoCadena(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }
    /**
     * Este método es el encargado de hacer la inserción de las palabras del archivo diccionario.txt y las ingresa al árbol.
     * 
     * @param padre esta variable es de tipo NodoCadena y será la encargada de darle la llave a las palabras.
     * @param dato esta variable es la que recibe las palabras del archivo diccionario.txt.
     */
    private void insertar(NodoCadena padre, String dato) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoCadena(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoCadena(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }
    /**
     * Este método es el encargado de hacer la impresión inorden de los datos insertados en el árbol.
     * @param n se recibe como parámetro el NodoCadena para poder hacer la organización.
     */
    private void inorden(NodoCadena n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    public void inorden() {
        this.inorden(this.raiz);
    }
}