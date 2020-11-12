package practica4;

public class Practica4{

	public static void main(String[] args){

		Circulo cir1 = new Circulo();
		//cir1.radio =4.5f;
		cir1.setRadio(3.4f);
		System.out.println("radio cir1 = " + cir1.getRadio());

		Circulo cir2 = new Circulo(6.0f);
		System.out.println("radio cir2 = " + cir2.getRadio());
		cir2.setRadio(9.0f);
		System.out.println("radio cir2 = " + cir2.getRadio());
		cir2.setRadio(77.0f);
		System.out.println("radio cir2 = " + cir2.getRadio());

		System.out.println("perimetro cir1 = " + cir1.perimetro());

		System.out.println("Info de Circulo 1 " + cir1.toString());

		System.out.println("****************************1*****************************+");


		Persona amiga = new Persona();
		System.out.println("Info amiga " + amiga.toString());
		amiga.setNombre("Denisse");
		amiga.setApellido("Basurto");
		amiga.setfNacimiento(new Fecha(29,2,2000));

		System.out.println("Info Amiga " + amiga.toString());
		System.out.println("Info Amiga " + amiga);

		System.out.println("****************************2*****************************+");


		Persona persona = new Persona("Leticia", "Sandra",06,02,1976);

		System.out.println("Info persona " + persona);

		System.out.println("****************************3*****************************+");


		Triangulo triangulo = new Triangulo(12,8);
		System.out.println("Info Triangulo =" + triangulo);

	}
}