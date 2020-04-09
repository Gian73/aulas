package aula4;

public class Condicao {

	public static final long IDADE_MINIMA = 18;
	public static final long IDADE_MAXIMA = 50;
	
	public static void main(String[] args) {
		for( int i=0; i<=100; i++ ) {
			validaEntrada(i);
		}
	}
	
	public static void validaEntrada( int idade ) {
		if( idade < IDADE_MINIMA || idade > IDADE_MAXIMA ) {
			System.out.println("Com a idade " + idade + " Você foi banido");
		}else{
			System.out.println("Com a idade " + idade + " Você foi Liberado");
		}
	}
}