package main.java.liceosorolla;

public class Animal {
	private String especie;
	private String raza;
	private int peso;
	private int edad;
	private String colorDePelo;
	
	public Animal(String especie, String raza, int peso, int edad, String colorDePelo) {
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.colorDePelo = colorDePelo;
	}
	
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getColorDePelo() {
		return colorDePelo;
	}
}
