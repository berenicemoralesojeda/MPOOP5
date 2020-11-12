package practica4;

public class Triangulo{

	private float cateto1;
	private float cateto2;
	private float angulo1;
	private float angulo2;
	private float hipotenusa;

	public Triangulo(){
	}


	/**
	*
	* @param cateto1 cateto A de tipo real
	* @param cateto2 cateto B de tipo real
	*
	**/

	public Triangulo(float cateto1, float cateto2){

		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		hipotenusa();
		angulos();
	}


	/**
	*
	* @return cateto1 Método get cateto 1
	*
	**/

	public float getCateto1(){
		return cateto1;
	}

	public void setCateto1(float cateto1){
		this.cateto1 = cateto1;
	}


	/**
	*
	* @return cateto2 Método get cateto 2
	*
	**/

	public float getCateto2(){
		return cateto2;
	}

	public void setCateto2(float cateto2){
		this.cateto2 = cateto2;
	}


	/**
	*
	* @return cangulo1 Método get angulo 1
	*
	**/

	public float getAngulo1(){
		return angulo1;
	}

	public void setAngulo1(float angulo1){
		this.angulo1 = angulo1;
	}


	/**
	*
	* @return cangulo2 Método get angulo 2
	*
	**/

	public float getAngulo2(){
		return angulo2;
	}

	public void setAngulo2(float angulo2){
		this.angulo2 = angulo2;
	}


	/**
	*
	* @return hipotenusa Método get hipotenusa
	*
	**/

	public float getHipotenusa(){
		return hipotenusa;
	}

	public void setHipotenusa(float hipotenusa){
		this.hipotenusa = hipotenusa;
	}


	@Override


	/**
	*
	* @return Informacion del triangulo
	*
	**/

	public String toString(){
		return "Triangulo{" + "cateto1 = " + cateto1 + ", cateto2 = " + cateto2 + ", angulo1 = " + angulo1 + ", angulo2 = " + angulo2 + ", hipotenusa = " + hipotenusa + '}';
	}

	private void hipotenusa(){

		this.hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
	}

	private void angulos(){

		this.angulo1 = (float) Math.toDegrees(Math.atan(cateto2/cateto1));

		this.angulo2 = 180 - 90 - angulo1;
	}


	/**
	*
	* @return Area del circulo
	*
	**/

	public float area(){
		return cateto1 = cateto2 / 2;
	}


	/**
	*
	* @return Perimetro del circulo
	*
	**/

	public float perimetro(){
		return cateto1 + cateto2 + hipotenusa;
	}

}