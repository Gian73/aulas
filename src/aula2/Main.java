import model.Funcionario;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		dadosFuncionarios();	
	}

	public static void dadosFuncionarios(){
	
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario;
		int opcao =0;
		
		System.out.print("Escolha uma opcao : {1 criar} {2 ver} ");
			opcao = Integer.parseInt(sc.next());
		do {
			if(opcao == 1){
				funcionario = new Funcionario();
				System.out.print("Digite um nome:");
				funcionario.nome=sc.next();

			}else if(opcao ==2){
				funcionario = new Funcionario();
				System.out.println(funcionario.nome);
			}
	
		}while(opcao!=0);
	//sc.close;
	}
}




