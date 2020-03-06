package main.java.liceosorolla;

public class Numero {
	private int numero1;
	private int numero2;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public Numero(int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public int suma() {
		return this.numero1+this.numero2;
	}
	
	public int resta() {
		return this.numero1-this.numero2;
	}
	
	public int multiplicar() {
		return this.numero1*this.numero2;
	}
	
	public int dividir() {
		return this.numero1/this.numero2;
	}
	
	public int potencia() {
		return (int) (Math.pow(numero1, numero2));
	}
	
	public boolean multiplo() {
		boolean resultado = false;
		if(this.numero1 >=this.numero2) {
			if(this.numero1 %this.numero2==0) {
				resultado = true;
			}
		}
		else {
			if(this.numero2% this.numero1==0) {
				resultado = true;
			}
		}
		return resultado;
	}
}
