package Controller;

public class NumerosNegativos {
	public NumerosNegativos() {
		super();
	}
	
	public int ContadorNegativos(int[] numeros, int contador) {
		if (contador == 0) {
			return 0;
		} else { 
			return numeros[contador - 1] < 0 ? 1 + ContadorNegativos(numeros, contador - 1) : ContadorNegativos(numeros, contador - 1);
		}
	}
}
