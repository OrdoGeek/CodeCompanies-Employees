package modelos;

public class GestorProyectos extends Empleado{

	/*
	 * Instance vars
	 */
	String area;
	
	
	/*
	 * Setters and getters
	 */
	
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	
	
	/*
	 * Constructors
	 */
	public GestorProyectos(String documento, String nombre, String sueldoHora, String empresa) {
		super(documento, nombre, sueldoHora, empresa);	
	}
	
	public GestorProyectos() {
		
	}
	
	
}
