package mundo;

import java.util.Date;

import estructuraDeDatos.IBinderID;

public class Tarea implements IBinderID<String>
{
	private String nombre;
	
	private String materia;
	
	private Date fechaEntrega;
	
	private String descripción;
	
	private int prioridad;

	public Tarea(String nNombre, String nMateria, Date nFechaEntrega,String nDescripción, int nPrioridad) 
	{
		nombre = nNombre;
		materia = nMateria;
		fechaEntrega = nFechaEntrega;
		descripción = nDescripción;
		prioridad = nPrioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String darID() {
		return nombre;
	}
	
	
}
