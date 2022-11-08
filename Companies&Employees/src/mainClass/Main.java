package mainClass;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelos.Admin;
import modelos.Desarrollador;
import modelos.Empleado;
import modelos.Empresa;
import modelos.EmpresaDesarrollo;
import modelos.GestorProyectos;
import operaciones.OperacionEmpleado;
import operaciones.OperacionEmpresa;

public class Main {

	public static ArrayList<Empresa> empresas = new ArrayList<Empresa>();
	public static ArrayList<Empleado> desarrolladores = new ArrayList<Empleado>();
	public static ArrayList<Empleado> admins = new ArrayList<Empleado>();
	public static ArrayList<Empleado> gestores = new ArrayList<Empleado>();
	public static ArrayList<Empleado> todoslosEmpleados = new ArrayList<Empleado>();
	
	public static void main(String[] args) {
		menu();
	}
	
	public static Empresa crearEmpresa(){
		EmpresaDesarrollo empresa1 = new EmpresaDesarrollo();
		String nit = JOptionPane.showInputDialog(null, "Ingrese el nit de la empresa:");
		empresa1.setNit(nit);
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la empresa:");
		empresa1.setNombre(nombre);
		String direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion de la empresa:");
		empresa1.setDireccion(direccion);
		String ciudad = JOptionPane.showInputDialog(null, "Ingrese la ciudad de la empresa:");
		empresa1.setCiudad(ciudad);
		String pais = JOptionPane.showInputDialog(null, "Ingrese el pais de la empresa:");
		empresa1.setPais(pais);
		empresas.add(empresa1);
		return empresa1;

	}
	
	public static void agregarEmpleado(Empresa empresa, Empleado empleado) {
		empresa.agregarEmpleado(empleado);
	}
	
	public static Empleado crearEmpleadoDesarrollador(){
		Desarrollador Desarrollador1 = new Desarrollador();
		String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del empleado:");
		Desarrollador1.setDocumento(documento);
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
		Desarrollador1.setNombre(nombre);
		String sueldoHora = JOptionPane.showInputDialog(null, "Ingrese el sueldo por hora del empleado:");
		Desarrollador1.setSueldoHora(sueldoHora);
		desarrolladores.add(Desarrollador1);
		todoslosEmpleados.add(Desarrollador1);
		return Desarrollador1;
	
	}
	
	
	public static Empleado crearEmpleadoAdmin(){
		Admin admin1 = new Admin();
		String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del empleado:");
		admin1.setDocumento(documento);
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
		admin1.setNombre(nombre);
		String sueldoHora = JOptionPane.showInputDialog(null, "Ingrese el sueldo por hora del empleado:");
		admin1.setSueldoHora(sueldoHora);
		admins.add(admin1);
		todoslosEmpleados.add(admin1);
		return admin1;

	}
	
	public static Empleado crearEmpleadoGestor(){
		GestorProyectos gestor1 = new GestorProyectos();
		String documento = JOptionPane.showInputDialog(null, "Ingrese el documento del empleado:");
		gestor1.setDocumento(documento);
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
		gestor1.setNombre(nombre);
		String sueldoHora = JOptionPane.showInputDialog(null, "Ingrese el sueldo por hora del empleado:");
		gestor1.setSueldoHora(sueldoHora);
		String area = JOptionPane.showInputDialog(null, "Ingrese el area del empleado:");
		gestor1.setArea(area);
		gestores.add(gestor1);
		todoslosEmpleados.add(gestor1);
		return gestor1;

	}
	
	public static void consultarEmpresas(){
		int emp = elejirEmpresa();
		Empresa empresa = empresas.get(emp-1);
		OperacionEmpresa.consultarEmpresas(empresa);
	}
	
	public static void consultarTodoslosEmpleados(){
		for (Empleado x: todoslosEmpleados) {
			System.out.println(x.getNombre());
			System.out.println(x.getDocumento());
			System.out.println("Sueldo Hora: " + x.getSueldoHora());
		}
	}
	
	public static void consultarCantidadEmpleados() {
		int emp = elejirEmpresa();
		Empresa empresa = empresas.get(emp-1);
		OperacionEmpresa.cantidadEmpleados(empresa, empresa.empleados);
	}
	
	public static int elejirEmpresa() {
		JOptionPane.showMessageDialog(null, "Elije la empresa\n");
		int cont = 1;
		for (Empresa x: empresas) {
			JOptionPane.showMessageDialog(null, cont + ". " + x.getNombre() + " - " + x.getCiudad() + "\n");
			cont += 1;
		}
		int emp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opción.\n"));
		return emp;
	}
	
	public static int elejirEmpleado(Empresa empresa) {
		JOptionPane.showMessageDialog(null, "Elije el empleado.\n");
		int cont = 1;
		for (Empleado x: empresa.empleados) {
			JOptionPane.showMessageDialog(null, cont + ". " + x.getNombre() + " - " + x.getDocumento() + "\n");
			cont += 1;
		}
		int emp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opción.\n"));
		return emp;
	}
	
	public static void consultarEmpleadosporEmpresa() {
		int emp = elejirEmpresa();
		Empresa empresa = empresas.get(emp-1);
		OperacionEmpleado.consultarEmpleadosporEmpresa(empresa, empresa.empleados);
	}
	
	public static void consultarSueldoEmpleado() {
		int emp = elejirEmpresa();
		Empresa empresa = empresas.get(emp-1);
		int emple= elejirEmpleado(empresa);
		Empleado empleado = empresa.empleados.get(emple-1);
		OperacionEmpleado.consultarSueldoEmpleado(empleado);
	}
	
	public static void consultarEmpleadoporDocumento() {
		int emp = elejirEmpresa();
		Empresa empresa = empresas.get(emp-1);
		int doc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el documento.\n"));
		String documento = Integer.toString(doc);
		OperacionEmpleado.empleadoPorDocumento(empresa, empresa.empleados, documento);
	}
	
	public static void menu(){
		int sw = 0;
		do {
			JOptionPane.showMessageDialog(null, "¡Bienvenido al programa! Elija una de las opciones.\n"
					+ "1. Crear una empresa\n"
					+ "2. Crear un empleado y asignarle su empresa\n"
					+ "3. Consultar empresas\n"
					+ "4. Consultar cantidad de empleados en una empresa\n"
					+ "5. Consultar empleados por empresa\n"
					+ "6. Consultar sueldo de empleado\n"
					+ "7. Consultar empleados por documento\n"
					+ "8. Consultar todos los empleados de todas las empresas\n"
					+ "0. Salir");
			
			sw = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opción.\n"));
			switch(sw) {
				case 1:
					crearEmpresa();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "¿Qué tipo de empleado desea crear?\n"
							+ "1. Desarrollador\n"
							+ "2. Administrador\n"
							+ "3. Gestor de Proyectos");
					int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opción.\n"));
					int emp;
					switch(opcion) {
						case 1:
							Empleado empleado = crearEmpleadoDesarrollador();
							emp = elejirEmpresa();
							Empresa empresa = empresas.get(emp-1);
							agregarEmpleado(empresa, empleado);
							break;
						case 2:
							Empleado empleado2 = crearEmpleadoAdmin();
							emp = elejirEmpresa();
							Empresa empresa2 = empresas.get(emp-1);
							agregarEmpleado(empresa2, empleado2);	
							break;
						case 3:
							Empleado empleado3 = crearEmpleadoGestor();
							emp = elejirEmpresa();
							Empresa empresa3 = empresas.get(emp-1);
							agregarEmpleado(empresa3, empleado3);	
							break;
					}
					break;
				case 3:
					consultarEmpresas();
					break;
				case 4:
					consultarCantidadEmpleados();
					break;
				case 5:
					consultarEmpleadosporEmpresa();
					break;
				case 6:
					consultarSueldoEmpleado();
					break;
				case 7:
					consultarEmpleadoporDocumento();
					break;
				case 8:
					consultarTodoslosEmpleados();
					break;
				case 0:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Favor ingresar una de las opciones.");
					menu();
			}
			
		}while(sw != 0);
	}
	
	
}
	
	
