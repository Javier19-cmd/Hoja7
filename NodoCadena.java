/**
 * 
 * 
 * Nombre: Javier Sebastián Valle Balsells
 * Carnet: 20159
 * Sección 10
 * 
 * Clase NodoCadena: esta clase es el nodo de la clase Tree, la cual está encargada de hacer las traducciones.
 * 
 * 
 */

class NodoCadena {
   
    /**
     * Sección de variablese y objetos.
     * 
     */
   
    private String dato;
    private NodoCadena izquierda, derecha;

    /**
     * Constructor de la clase NodoCadnea. Aquí se hacen las igualaciones corespondientes y además se recibe la variable a procesar.
     * 
     * @param dato variable a procesar.
     */
    public NodoCadena(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    /**
     * 
     * Getter del dato que se manda a solicitar cuando sea necesario.
     * 
     * @return dato que se solicita.
     */

    public String getDato() {
        return dato;
    }

    /**
     * Getter de la parte izquierda del árbol creado.
     * 
     * @return de la parte izquierda del árbol.
     */

    public NodoCadena getIzquierda() {
        return izquierda;
    }

    /**
     * Setter de la parte izquierda del árbol.
     * 
     * @param izquierda se envía como parámetro un objeto de tipo NodoCadena que será la parte izquierda del árbol.
     */

    public void setIzquierda(NodoCadena izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * Getter de la parte derecha del árbol.
     * 
     * @return se retorna como objeto la parte derecha del árbol.
     */

    public NodoCadena getDerecha() {
        return derecha;
    }

    /**
     * 
     * Setter de la parte derecha del árbol. 
     * 
     * @param derecha se retorna como objeto de tipo NodoCadena el lado derecho del árbol.
     */

    public void setDerecha(NodoCadena derecha) {
        this.derecha = derecha;
    }

    /**
     * 
     * 
     * 
     * Método para imprimir los datos solicitados.
     * 
     * 
     */

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}