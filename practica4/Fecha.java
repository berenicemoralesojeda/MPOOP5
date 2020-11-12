package practica4;


class Fecha{

	private int dia;
	private int mes;
	private int anio;

	public Fecha(){
	}


	/**
	*
	* @param dia Dia de la fecha
	* @param mes Mes de la fecha
	* @param anio Anio de la fecha
	*
	**/

	public Fecha(int dia, int mes, int anio){
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}


	/**
	*
	* @return Dia Método get dia
	*
	**/

	public int getDia(){
		return dia;
	}

	public void setDia(int dia){
		this.dia = dia;
	}


	/**
	*
	* @return Mes Método get mes
	*
	**/

 	public int getMes(){
 		return mes;
 	}

 	public void setMes(int mes){
 		this.mes = mes;
 	}


	/**
	*
	* @return Anio Método get anio
	*
	**/

 	public int getAnio(){
 		return anio;
 	}

 	public void setAnio(int anio){
 		this.anio = anio;
 	}

 	@Override


	/**
	*
	* @return Informacion de fecha
	*
	**/

 	public String toString(){
 		return "Fecha{" + "día = " + dia + ", mes = " + mes + ", anio = " + anio + '}';
 	}
 }