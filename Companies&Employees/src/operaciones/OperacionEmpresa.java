package operaciones;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelos.Empleado;
import modelos.Empresa;

public class OperacionEmpresa implements IOperacionEmpresa{
	
	//public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	/*public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}*/

	public static void consultarEmpresas(Empresa empresa) {
		System.out.println(empresa.getNit());
		System.out.println(empresa.getNombre());
		System.out.println(empresa.getDireccion());
		System.out.println(empresa.getCiudad());
		System.out.println(empresa.getPais());
	}

	public static void cantidadEmpleados(Empresa empresa, ArrayList<Empleado> empleados) {
		System.out.println(empresa.getNombre());
		System.out.println("Cantidad de empleados: " + empleados.size());		
	}

}
