package main.java.liceosorolla;

public class Rectangulo {
	
	private int lado1;
	private int lado2;
	
	
	public Rectangulo(int lado1, int lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	
	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public boolean lados() {
		boolean comprobar = false;
		
		if(lado1 == lado2) {
			comprobar = true;
			
		}
		return comprobar;
	}
	
	public int perimetro() {
		
		int total;
		
		return total = 2*(lado1+lado2);
	}
	
	public int area(){
		int areaTriangulo;
        return areaTriangulo = lado1 * lado2;
    } 
	
	
}
