package estructuraDeDatos;


public class NodoLista <T extends IBinderID<K>, K> implements IBinderID<K>{

	private T elemento;

	private NodoLista sig;
	
	private K id;

	public NodoLista (T object, NodoLista nSig, K nID){
		elemento = object;
		sig = nSig;
		id = nID;
	}

	/**
	 * M�todo que compara un atributo del elemento del nodo con el elemento dado por paramentro
	 * @param t elemento a comparar
	 * @return 1 si el elemento del nodo es mayor, 0 si son iguales y -1 si el elemento del nodo es menor
	 */
	public int compareTo(T t)
	{
		char cadenaElementoNodo[] = elemento.toString().toCharArray();
		char cadenaElelemtoComp1[] = t.toString().toCharArray();
		if(elemento.equals(t)){
			return 0;
		}else{
			int totalC = 0;
			int totalCadenaElelemtoComp1 = 0;
			for (int i = 0; i < cadenaElementoNodo.length; i++) {
				totalC += (int)cadenaElementoNodo[i];
			}
			for (int i = 0; i < cadenaElelemtoComp1.length; i++) {
				totalCadenaElelemtoComp1 += (int)cadenaElelemtoComp1[i];
			}
			if(totalC<totalCadenaElelemtoComp1){
				return 1;
			}else{
				return-1;
			}
		}
	}

	public void desconectarSiguiente() {
		sig = null;
	}

	public NodoLista rSiguiente() {
		return sig;
	}

	public T rThis() {
		return elemento;
	}

	public void cambiarSiguiente(T e){
		NodoLista temp = sig;
		sig = new NodoLista(e, temp, e.darID());
	}
	
	public void anadirSiguiente(T e){
		sig = new NodoLista(e, null, e.darID());
	}
	public void reemplazarSiguiente(NodoLista a){
		sig = a;
	}
	
	public K darID()
	{
		return id;
	}
}
