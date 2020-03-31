import model.Funcionario;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		dadosFuncionarios();
	}

	public static void dadosFuncionarios() {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		int opcao = 0;

		do {

		System.out.println();
		System.out.println("Escolha uma opcao : {1 criar} {2 ver} {0 sair}");
		opcao = Integer.parseInt( sc.nextLine() );

			if ( opcao == 1 ) {

				funcionario = new Funcionario();
				System.out.println();
				System.out.println("Digite um nome:");
				funcionario.nome=sc.nextLine();

			} else if ( opcao == 2 ) {
				if(funcionario.nome!=null){
					System.out.println();
					System.out.println("Abaixo segue o nome digitado: ");
					System.out.println(funcionario.nome);
				}
			}

		} while ( opcao != 0 );

	}

}




