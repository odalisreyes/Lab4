/*
 * @author Odalis Ryes
 * @File name Driver.java
 * @Date and project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Mostar en pantalla el uso de las clases y el funcionamiento de herencia
 */



package Ejercicio4;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	/*
	 * Creacion del objeto para llamar los metodos de las demas clases
	 */
	Soldado buenosDias = new Soldado();
	Coronel hola = new Coronel();
	Teniente saludo = new Teniente();
	General ricardo = new General();
	Militar arjona = new Militar();
	
	
	/* INFORMACION */
	
	
	/*
	 * SOLDADO
	 */
	System.out.println("--- INFORMACION DEL SOLDADO ---");
	/* Imprime la cantidad de horas del soldado */ 
	System.out.println("Horas: " + buenosDias.getHoras());
	/* Imprime el salario del soldado */ 
	System.out.println("Salario: Q" + buenosDias.getSalario());
	/* Imprime el dia de vacaciones del soldado */ 
	System.out.println("Dias de vacaciones: " + buenosDias.getDiasVacaciones());
	/* Imprime el mensaje del soldado */ 
	System.out.println("Mensaje al militar: " + buenosDias.recibeOrden());
	System.out.println("\n");
	
	
	/*
	 * CORONEL
	 */
	System.out.println("--- INFORMACION DEL CORONEL ---");
	/* Imprime el salario del coronel */ 
	System.out.println("Salario: Q" + hola.getSalario());
	/* Imprime el mensaje del coronel */ 
	hola.ejecutaOrdenManiobra();
	System.out.println("\n");
	
	
	/*
	 * TENIENTE
	 */
	System.out.println("--- INFORMACION DEL TENIENTE ---");
	/* Imprime el mensaje de Teniente */ 
	System.out.println("Ingrese el mensaje para el Teniente: ");
	String texto = teclado.nextLine();
	saludo.tomaOrdenCoronel(texto);
	System.out.println("\n");
	
	
	/*
	 * GENERAL
	 */
	System.out.println("--- INFORMACION DEL GENERAL ---");
	/* Imprime el dia de vacaciones del general */ 
	System.out.println("Dia de vacaciones: " + ricardo.getDiasVacaciones());
	/* Imprime el mensaje del general */ 
	System.out.println("Dia de vacaciones: " + ricardo.getFormularioVacaciones());
	/* Imprime el planificacion estrategia */ 
	ricardo.planificaEstrategia();
	System.out.println("\n");
	
	
	/*
	 * MILITAR
	 */
	System.out.println("--- INFORMACION DEL MILITAR ---");
	/* Imprime la cantidad de horas del militar */ 
	System.out.println("Horas: " + arjona.getHoras());
	/* Imprime el salario del militar */ 
	System.out.println("Salario: Q" + arjona.getSalario());
	/* Imprime el dia de vacaciones del militar */ 
	System.out.println("Dias de vacaciones: " + arjona.getDiasVacaciones());
	/* Imprime el mensaje del militar */ 
	System.out.println("Formulario de vacaciones: " + arjona.getFormularioVacaciones());
	System.out.println("--------------------------- FIN  ----------------------------");
	
	
	}
}
