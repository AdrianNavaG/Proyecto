package Jawer;

public class Principal {

	public static void main(String[] args) {
		
		
		 Perro perro = new Perro();
		 
		 perro.correr("perro");
		 perro.comer("perro");
		perro.ladrar();
		
		
		Gato gato = new Gato();
		
		gato.comer("gato");
		gato.correr("gato");
		gato.rasguñar();
		
		Animal catdog = new Perro();
		
		catdog.correr("Perro");
		catdog = new Gato();
		
		catdog.correr("Gato");

	}

}
