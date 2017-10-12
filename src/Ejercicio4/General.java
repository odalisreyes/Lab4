/*
 * @author POO
 * @File name General.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Una clase para representar a los Tenientes. 
 */ 


package Ejercicio4;

public class General extends Militar {
	
	
	/*
	 * @param
	 * PROPOSITO: contiene el dia de vacaciones del general
	 */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    
    /*
	 * @param
	 * PROPOSITO: contiene el formulario de vacaciones del general
	 */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    
    
    /*
	 * @param
	 * PROPOSITO: contiene la planificacion estrategica del general
	 */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
    
    
}