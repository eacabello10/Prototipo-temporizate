package estructuraDeDatos;

import estructuraDeDatos.LinkedListIN;

public class CupiLista<T extends IBinderID<K>, K> implements LinkedListIN<T>{

	private NodoLista primero;
	private int tamanio;

	/**
	 * Inicializa la lista, con los atributos en null.
	 */
	public CupiLista (){
		primero = null;
		tamanio = 0;
	}

	/**
	 * Agrega un elemento a la lista ordenada de objetos.
	 * @param T elemento,el elemento a agregar a la lista.
	 */
	public void agregar(T ele) throws Exception{
		if(primero == null){
			primero = new NodoLista(ele, null, ele.darID());
			tamanio++;
		}else if(primero != null){
			boolean anadido = false;
			if(primero.rSiguiente() == null)
			{
				primero.anadirSiguiente(ele);
				anadido = true;
				tamanio++;
			}
			else
			{
				NodoLista actual = primero.rSiguiente();
				while(actual != null && !anadido)
				{
					if(actual.rSiguiente() == null)
					{
						actual.anadirSiguiente(ele);
						anadido = true;
						tamanio++;
					}
					actual = actual.rSiguiente();
				}
				
			}
		}
	}

	/**
	 * Busca si existe un elemento igual al que entra por par�metro.
	 * @param T elemento, elemento a buscar.
	 * @return retorna un objeto tipo T si se se encontr� coincidencia, null de lo contrario.
	 */
	public T buscarElemento(T e) {
		T r = null;
		NodoLista actual = primero;
		while(actual.compareTo(e) <= 0){
			if(actual.compareTo(e) == 0){
				r = (T) actual.rThis();
			}
			actual = actual.rSiguiente();			
		}
		return r;
	}
	
	public T buscarPorID(K id)
	{
		T r = null;
		NodoLista actual = primero;
		while(!actual.darID().equals(id))
		{
			actual = actual.rSiguiente();
		}
		r = (T) actual.rThis();
		return r;
	}

	/**
	 * Elimina un elemento de la lista.
	 * @param T elemento, el elemento a eliminar de la lista.
	 * @return T, se retorna el elemento eliminado, null si no se ecncontr� o si no se elimin�.
	 */
	public T eliminar(T e) {
		T r = null;
		NodoLista act = primero;
		if(primero.compareTo(e)==0){
			primero = primero.rSiguiente();
		}else{
			while(act.compareTo(e) <= 0){
				if(act.rSiguiente().compareTo(e) == 0){
						r = (T) act.rSiguiente().rThis();
						act.reemplazarSiguiente(act.rSiguiente().rSiguiente());
						tamanio--;
				}else{
					act = act.rSiguiente();
				}
			}
		}
		return r;
	}

	/**
	 * Devuelve un boolean dependiendo si la lista est� vac�a o no.
	 * @return Boolean, true si la lista est� vac�a, false de lo contrario.
	 */
	public boolean isEmpty() {
		return primero==null;
	}

	/**
	 * Devuelve la cantidad de elementos en la lista.
	 * @return int, la cantidad de elementos en la lista.
	 */
	public int length() {
		return tamanio;
	}

	/**
	 * Devuelve la lista de objetos en un array.
	 * @return Array Object, Array de objetos dentro de la lista.
	 */
	public Object[] toArray() {
		Object[] o = new Object[tamanio];
		NodoLista a = primero;
		int c = 0;
		while(a.rSiguiente()!=null){
			o[c] = a;
			a=a.rSiguiente();
			c++;
		}
		return o;
	}
	
	public T[] darElementos()
	{
		T[] a = (T[]) new Object[tamanio];
		int contador = 0;
		NodoLista actual = primero;
		while(actual != null)
		{
			if(actual.rThis() != null)
			{
				a[contador] = (T) actual.rThis();
				contador++;
			}
			actual = actual.rSiguiente();
		}
		return a;
	}

}
