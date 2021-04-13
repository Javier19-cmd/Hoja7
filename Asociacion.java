/**
 * @author Javier Sebastián Valle Balsells 
 * 
 * Clase Asocacion: Esta clase es la encargada de poder realizar las oraciones que se ingresarán al archvio texto.txt.
 * 
 * Referencia: https://github.com/sliuu/post_script/blob/master/structure5/Association.java
 * 
 */

 import java.util.Map; //Importando la clase Mapa.


public class Asociacion <K, V> 
{
    /**
     * 
     * Creando una llave inmutable, la cual será un objeto arbitrario.
     * 
     */
    protected K theKey; //Llave contenedora del par llave-valor.

    /**
     * 
     * Creando un valor inmutable, el cual será un valor arbitrario.
     * 
     */

    protected V theValue; //Valor contenedor del par llave-valor.

    /**
     *
     * Creando una contrucción de un par conformado de llave y valor.
     *  
     * @pre la llave no es nula o no está vacía.
     * @post ya se contruyó el par llave-valor.
     * 
     * @param key A, la cual no está vacía o nula.
     * @param value A, el cual es un posible objeto vacío.
     * 
     * 
     */
    public Asociacion(K key, V value)
    {

        theKey = key; //Igualando el objeto theKey a su valor key que recibe el método.
        theValue = value; //Igualando el objeto theValue a su valor value que recibe el método. 
    }

    /**
     * 
     * Se contruye un par a raíz de una llave; el valor está nulo.
     * 
     * @pre la llave está conteniendo un objeto.
     * @post se contruye un par de llave-valor. El valor está vacío.
     * @param key es una llave A que contiene un valor no nulo.
     */
    public Asociacion(K key)
    {
        this(key, null); //Asignando a la llave el valor nulo.
    }

    /**
     * Forma estándar de comparar una función. Esta comparación se basa solamente en llaves.
     * @pre el parámetro other es una Asociación no nula.
     * @post se retorna verdadero en caso de que las llaves sean iguales.
     * @param other , el cual es otro tipo de asociación. 
     * @return verdadero si las llaves son iguales. 
     * 
     */
    public boolean equals(Object other)
    {
        Asociacion otherAssoc = (Asociacion)other; //Haciendo un casting.
        return getKey().equals(otherAssoc.getKey()); //Retornando el valor de la llave.
    }

    /**
     * Forma estándar de una función hashcode.
     * @post retorna una asociación de hashcode con sus asociaciones.
     * @return un hascode para las asociaciones.
     * @see Hashtable.
     * 
     * 
     */
    public int hashCode()
    {
        return getKey().hashCode(); //Retornando el valor del hashcode.
    }

    /**
     * Hace un fetch de un valor a partir de una asociación. Esto puede retornar null.
     * 
     * @post retorna un valor a partir de una asociación.
     * @return retorno del valor de una asociación.
     * 
     * 
     */

    public V getValue()
    {
        return theValue; //Retornando el valor del objeto value.
    }

    /**
     * Este método retorna el valor del objeto llave.
     * 
     * @return theKey que es el valor del objeto key.
     */

    public K theKey(){
        return theKey; //Retorno de la llave.
    }

    /**
     * Este método retorna objeto con la llave ya asignada.
     * 
     * @return theKey , retornando la llave ya asignada.
     */

    public K getKey() {
        return theKey;
    } 

    /**
     * Hay un set del valor de un par de llave-valor.
     * @post set de la asociación de valor a valor.
     * @param value se envía como parámetro el nuevo valor.
     * 
     */

    public V setValue(V value)
    {
        V oldValue = theValue; //Asignando el valor antiguo al objeto theValue.
        theValue = value; //Asigando el valor de theValue al objeto value.

        return oldValue; //Retornando el valor antiguo.
    }

    /**
     * Forma estándar de la representación de un String. 
     * @post se retorna el valor representado de un string.
     * @return el string representando al par llave valor.
     * 
     */

    public String toString()
    {
        StringBuffer s = new StringBuffer(); //Creando una variable de tipo Buffer.

        s.append("<Asociación: "+getKey()+"="+">"); //Haciendo el append de las llaves.
        
        return s.toString(); //Retorno de la variable en la forma de string.
    }


}