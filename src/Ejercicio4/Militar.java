/*
 * @author POO
 * @File name Militar.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Una clase para representar a los militares en general. 
 */ 


package Ejercicio4;



public class Militar {
	
	/*
	 * @param
	 * PROPOSITO: Contiene las horas del militar
	 */
	public int getHoras() {
     return 40;           // trabaja 40 horas / semana
	}
	
	
	/*
	 * @param
	 * PROPOSITO: Contiene el salario del militar
	 */
	public double getSalario() {
     return 40000.0;      // Q40,000.00 / anio
	}
 
	
	/*
	 * @param
	 * PROPOSITO: Contiene el dia de vacaciones del militar
	 */
	public int getDiasVacaciones() {
     return 10;           // 2 semanas de vacaciones pagadas
	}

	
	/*
	 * @param
	 * PROPOSITO: Contiene el formulario de vacaciones
	 */
	public String getFormularioVacaciones() {
     return "amarillo";     // use el formulario amarillo
	}
	
	
}