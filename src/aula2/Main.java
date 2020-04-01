import model.Funcionario;
import java.util.Scanner;

public class Main {


	public static int opcao = 0;
	public static Scanner lineScanner = new Scanner(System.in);


	public static void main(String[] args) {
		dadosFuncionarios();
	}

	public static void recebeOpcao(){

			System.out.println("\nEscolha uma opcao : {1 criar} {2 ver} {0 sair}");

			try {
				opcao = Integer.parseInt( lineScanner.nextLine() );
			} catch ( Exception e ) {
				System.out.println("Opcao invalida");
			}

	}

	public static void dadosFuncionarios() {

		Funcionario funcionario = new Funcionario();



		do {

			recebeOpcao();

			if ( opcao == 1 ) {

				System.out.println("\nDigite um nome:");
				funcionario.nome=lineScanner.nextLine();

			} else if ( opcao == 2 ) {

				if(funcionario.nome!=null){

					System.out.println("\nAbaixo segue o nome digitado:\n" + funcionario.nome);

				}

			}

		} while ( opcao != 0 );

	}

}




