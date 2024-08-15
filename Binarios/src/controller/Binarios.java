package controller;

public class Binarios {

	public Binarios() {
		super();}
	
	public String transformaBinario(int quociente, String binario) {
		if (quociente==0) {
			
			 /*
			  * se o quociente for 0 a operacao acabou
			  */
	return(binario);}
	else {
		 String resto= String.valueOf(quociente%2);
		binario = resto+binario;
		
		
		return transformaBinario(quociente/2, binario);
		/* 
		 * primeiro o numero precisa ser transformado em string para ser 
		 * concatenado, em seguida o ultimo valor e adcionado na frente do primeiro
		 * por fim o quociente precisa ser dividido por 2 para que a operaco avance 
		 * e se repita normalmente
		 */
	
	}
		   }

	}
	