package estructuraDeDatos;


/**
 * Interface para estructuras de datos lineales.
 */

public interface LinkedListIN <T>{

	/**
	 * Agrega un elemento a la lista ordenada de objetos.
	 * @param T elemento,el elemento a agregar a la lista.
	 */
	public void agregar(T elemento)throws Exception;

	/**
	 * Elimina un elemento de la lista.
	 * @param T elemento, el elemento a eliminar de la lista.
	 * @return T, Devuelve el elemento eliminado, null si no se encontr?.
	 */
	public T eliminar(T elemento);

	/**
	 * Busca si existe un elemento igual al que entra por par?metro.
	 * @param T elemento, elemento a buscar.
	 * @return retorna un objeto tipo T si se se encontr? coincidencia, null de lo contrario.
	 */
	public T buscarElemento (T e);
	
	/**
	 * Devuelve un boolean dependiendo si la lista est? vac?a o no.
	 * @return Boolean, true si la lista est? vac?a, false de lo contrario.
	 */
	public boolean isEmpty();
	
	/**
	 * Devuelve la cantidad de elementos en la lista.
	 * @return int, la cantidad de elementos en la lista.
	 */
	public int length();
	
	/**
	 * Devuelve la lista de objetos en un array.
	 * @return Array Object, Array de objetos dentro de la lista.
	 */
	public Object[] toArray();

}
