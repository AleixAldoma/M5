import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class Moda {
	int nLinies = 1;
	
	int nLletres1 = 4;
	int[] num1 = {4,6,8,4};
	
	@Test //Comproba si la cantitat de "línies" es superior a 0.
	public void TestModaLinies() {
		assertFalse("Nº de línies no valid", nLinies <= 0);
	}
	
	@Test
	public void TestModa1(){
		System.out.println(nLinies);
		System.out.println("");
		System.out.println(nLletres1);
		assertFalse("Es necessita mínim 1 nombre", nLletres1 <= 0); //En cas de no mirar ningún nombre per a comparar, donar error.
		
		int top = 0;
		int oldC = 0;
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]); //Mostrar en pantalla cada nombre.
			
			int c = 0;
			int aux=num1[i]; //Posar el nombre actual en la variable aux.
			assertFalse(num1[i]+" no es valid", num1[i] < 0 || num1[i] > 999); //En cas de ser un nombre menor a 0 o superior a 999, donar error.
			for(int n=1;n<num1.length;n++) {
				if(num1[i]==num1[n]) {
					assertEquals(num1[i],num1[n]); //Comprova si el nombre es el mateix.
					c++;
				}
				if(oldC==0) oldC = c; //Si no hi ha cap nombre anterior, posar la quantitat de vegades que ha sortit en el contador antic.
				else if(c>=oldC) top = aux; //Si el contador actual es major que el contador antic, actualitzar el resultat.
			}
		}
		System.out.println("");
		System.out.println("El nombre es: "+top); //Resultat.
	}
}
