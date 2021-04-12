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

    public Asociacion(K key){

    }

    public boolean equals(Object other)
    {

    }

    public int hashCode()
    {

    }

    public V getValue(){

    }

    public V setValue(V value){

    }

    public String toString()
    {
        
    }

}