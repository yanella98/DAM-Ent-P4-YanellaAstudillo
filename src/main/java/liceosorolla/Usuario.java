package main.java.liceosorolla;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private int identificador;
	
	
	public Usuario(String nombre, String apellidos, LocalDate fechaNacimiento, int identificador) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String toString() {
		return "nombre " + nombre + ", apellidos " + apellidos + ", fechaNacimiento " + fechaNacimiento
				+ ", identificador " + identificador;
	}
	
	public boolean mayoriaEdad() {
		boolean edad = true;
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNacimiento, ahora);
		edad = 18<periodo.getYears();
		return edad;
	}
	
	public String nombreMayusculas() {
		
		return this.nombre.toUpperCase()+" "+this.apellidos.toUpperCase();
	}
	
	public String nombreMinisculas() {
		return this.nombre.toLowerCase()+" "+this.apellidos.toLowerCase();
	}
}
