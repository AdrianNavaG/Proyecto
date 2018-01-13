package Jawer;

public class Animal {

	private String especie;
	private float peso;
	private String tamanio;
	
	
	

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void comer(String nombre) 
	{
		System.out.println(nombre+" comiendo...");
	}
	
	public void correr(String nombre)
	{
		System.out.println(nombre+" corriendo...");
	}
}
	