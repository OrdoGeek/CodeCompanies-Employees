package modelos;

import java.util.ArrayList;

public class Empresa {

	/*
	 * Instance variables
	 */
	
	String nit, nombre, direccion, ciudad, pais;
	public ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	/*
	 * Constructors
	 */
	public Empresa(String nit, String nombre, String direccion, String ciudad, String pais) {
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	/*
	 * Getters and setters
	 */
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public Empleado getEmpleado(int i) {
		return empleados.get(i);
	}
	/*public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}*/

	
	
	
}
