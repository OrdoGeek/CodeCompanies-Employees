package operaciones;

import java.util.ArrayList;

import modelos.Empleado;
import modelos.Empresa;

public class OperacionEmpleado implements IOperacionEmpleado{

	public static void consultarEmpleadosporEmpresa(Empresa empresa, ArrayList<Empleado> empleados) {
		System.out.println(empresa.getNombre());
		for (Empleado x: empleados) {
			System.out.println(x.getNombre());
			System.out.println(x.getDocumento());
			System.out.println("Sueldo Hora: " + x.getSueldoHora());
		}
	}

	public static void empleadoPorDocumento(Empresa empresa, ArrayList<Empleado> empleados, String documento) {		
		
		int sw = 0;
		int cont = 0;
		String doc;
		for (Empleado x: empleados) {
			doc = x.getDocumento();
			for(int i=0;i<documento.length();i++) {
				if (documento.charAt(i) != doc.charAt(i)) {
					break;
				}else{
					cont += 1;
				}
			}
			if(cont == documento.length()) {
				System.out.println("La información del empleado de la empresa " + empresa.getNombre() + " con documento " + documento + " es:");
				System.out.println(x.getNombre());
				System.out.println("Sueldo Hora: " + x.getSueldoHora());
			}else {
				System.out.println("No se encontró el documento");
			}
		}
		
	}

	public static void consultarSueldoEmpleado(Empleado empleado) {
		System.out.println("Sueldo Hora: " + empleado.getSueldoHora());
	}

}
