package View;

import Controller.NumerosNegativos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosNegativos negativos = new NumerosNegativos();
		
		int[] numeros = {5, -7, -9, -3, -5, 5, 22};
		int tamanho = numeros.length;
		
		System.out.println(negativos.ContadorNegativos(numeros, tamanho));
	}

}
