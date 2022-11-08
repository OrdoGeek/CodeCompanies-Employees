package modelos;

import java.util.ArrayList;

public abstract class Empleado{
	
	/*
	 * Instance Variables
	 */
	
	String documento;
	String nombre;
	String sueldoHora;
	String empresa;
	
	/*
	 * Constructors
	 */
	public Empleado(String documento, String nombre, String sueldoHora, String empresa){
		this.documento = documento;
		this.nombre = nombre;
		this.sueldoHora = sueldoHora;
		this.empresa = empresa;
	}
	
	public Empleado(){
		
	}
	
	/**
	 * Getters and setters
	 * @return
	 */

	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getSueldoHora() {
		return sueldoHora;
	}
	public void setSueldoHora(String sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
