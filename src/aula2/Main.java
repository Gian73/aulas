import model.Funcionario;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		dadosFuncionarios();
	}

	public static void dadosFuncionarios() {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario;
		int opcao = 0;

		System.out.println("Escolha uma opcao : {1 criar} {2 ver} ");

		opcao = Integer.parseInt( sc.nextLine() );

		System.out.println("chegou apos a gravacao da opcao");

		do {
		System.out.println("Entrou no  DO");
			if ( opcao == 1 ) {
				System.out.println("Entrou no if");
				funcionario = new Funcionario();
				System.out.println("Digite um nome:");
				funcionario.nome=sc.nextLine();
				System.out.println("O funcionario digitado foi: " + funcionario.nome);
				System.out.println("A opcao nesse momento é: " + opcao);
				opcao = 0;
				System.out.println("A opcao nesse momento é: " + opcao);

			} else if ( opcao == 2 ) {
				funcionario = new Funcionario();
				System.out.println(funcionario.nome);
			}
		} while ( opcao != 0 );
	}
}




