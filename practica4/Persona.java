package practica4;

public class Persona{

	private String nombre;
	private String apellido;
	private Fecha fNacimiento;


	public Persona(){
	}


	/**
	*
	* @param nombre Nombre de la persona
	* @param apellido Apellido de la persona
	* @param fNacimiento Fecha de nacimientos de la persona
	*
	**/

	public Persona(String nombre, String apellido, Fecha fNacimiento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
	}

	public Persona(String nombre, String apellido, int dia, int mes, int anio){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = new Fecha(dia,mes,anio);
	}


	/**
	*
	* @return Nombre Método get nombre
	*
	**/

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}


	/**
	*
	* @return Apellido Método get apellido
	*
	**/

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}


	/**
	*
	* @return fNacimiento Método get fNacimiento
	*
	**/

	public Fecha fNacimiento(){
		return fNacimiento;
	}

	public void setfNacimiento(Fecha fNacimiento){
		this.fNacimiento = fNacimiento;
	}

	@Override


	/**
	*
	* @return Informacion de la persona
	*
	**/

	public String toString(){
		return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + ", fNacimiento = " + fNacimiento + '}';
	}


}