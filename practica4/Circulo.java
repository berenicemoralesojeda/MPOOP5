package practica4;

public class Circulo{

	static double PI = Math.PI;
   	private float radio;

   	public Circulo(){
   	}


	/**
	*
	* @param radio Radio del circulo
	*
	**/

   	public Circulo(float radio){
   		
   		this.radio = radio;
   	}


	/**
	*
	* @return Radio Método get radio
	*
	**/
   
   	public float getRadio(){
   		
   		return radio;
  	}

	public void setRadio(float radio){
		this.radio = radio;
	}

	@Override


	/**
	*
	* @return Radio del circulo
	*
	**/

	public String toString(){
		return "Circulo{" + "radio" + radio + '}';
	}

	/**
	*
	* @return el perimetro con el radio de atributo
	*
	**/

	public float perimetro(){
		return (float) (2 * PI * radio);
	}

	/**
	*
	* @return el area con el radio de atributo
	*
	**/

	public float area(){
		return (float) (PI * radio * radio);
	}

}