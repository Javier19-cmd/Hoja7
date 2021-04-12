/**
 * @author Javier Sebastián Valle Balsells 
 * 
 * Clase Asocacion: Esta clase es la encargada de poder realizar las oraciones que se ingresarán al archvio texto.txt.
 * 
 * Referencia: https://github.com/sliuu/post_script/blob/master/structure5/Association.java
 * 
 */

 import java.util.Map; //Importando la clase Mapa.

public class Asociacion <K, V> implements Map.Entry<K, V>
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

    }

    /**
     * 
     * Se contruye un par a raíz de una llave; el valor está nulo.
     * 
     * @pre la llave está conteniendo un objeto.
     * @post se contruye un par de llave-valor. El valor está vacío.
     * @param key es una llave A que contiene un valor no nulo.
     */
    public Asociacion(K key){

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

    }

    /**
     * Hace un fetch de un valor a partir de una asociación. Esto puede retornar null.
     * 
     * @post retorna un valor a partir de una asociación.
     * @return retorno del valor de una asociación.
     * 
     * 
     */

    public V getValue(){

    }

    /**
     * Hay un set del valor de un par de llave-valor.
     * @post set de la asociación de valor a valor.
     * @param value se envía como parámetro el nuevo valor.
     * 
     */

    public V setValue(V value){

    }

    /**
     * Forma estándar de la representación de un String. 
     * @post se retorna el valor representado de un string.
     * @return el string representando al par llave valor.
     * 
     */

    public String toString()
    {

    }

}