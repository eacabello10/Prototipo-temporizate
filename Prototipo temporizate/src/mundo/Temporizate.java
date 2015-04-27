package mundo;

import estructuraDeDatos.CupiLista;

public class Temporizate 
{
	private CupiLista<Tarea, String> tareas;
	
	public Temporizate()
	{
		tareas = new CupiLista<Tarea, String>();
	}
	
	public CupiLista<Tarea, String> darTareas()
	{
		return tareas;
	}
	
	public void agregarTarea(Tarea tar)
	{
		try {
			tareas.agregar(tar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
