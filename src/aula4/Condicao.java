package aula4;

public class Condicao {

	public static final long IDADE_MINIMA = 18;
	public static final long IDADE_MAXIMA = 50;
	
	public static void main(String[] args) {
		validaEntrada(0);
		validaEntrada(15);
		validaEntrada(18);
		validaEntrada(21);
		validaEntrada(40);
		validaEntrada(50);
		validaEntrada(51);
		validaEntrada(60);
		validaEntrada(100);
	}
	
	public static void validaEntrada( int idade ) {
		if  ( idade <IDADE_MINIMA ||  idade > IDADE_MAXIMA )  {
			System.out.println("Com a idade " + idade + " Você foi banido");
		} else {
			System.out.println("Com a idade " + idade + " Você foi Liberado");
		}
	}
}