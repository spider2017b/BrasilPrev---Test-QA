
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	private Scanner l;
	private boolean execute;
	private List<Dados> dados;

	public static void main(String[] args) {
		new Main();
	}

	private Main() {
		l = new Scanner(System.in);
		execute = true;
		dados = new ArrayList<Dados>();

		System.out.println("BEM VINDO AO CADASTRO DE USU�RIOS");

		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("n")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("l")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("x")) {
				execute = false;
			} else {
				System.out.println("\nOp��o Inv�lida seu noob !!! \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a op��o:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usu�rio");
			Dados d = new Dados();
			d.setNome(textInput("Nome:"));
			d.setLogin(textInput("Login: "));
			d.setCargo(textInput("Cargo: "));
			d.setCargo(textInput("CPF: "));
			d.setCargo(textInput("Endere�o: "));
			d.setCargo(textInput("N�mero: "));
			d.setCargo(textInput("Complemento: "));
			d.setCargo(textInput("Bairro: "));
			d.setCargo(textInput("Cidade: "));
			d.setCargo(textInput("Estado: "));
			d.setCargo(textInput("Telefone: "));
			

			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				dados.add(d);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOp��o inv�lida seu noob, vou ignorar o cadastro s� pra voc� ter que digitar denovo !!! \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOp��o inv�lida seu noob, eu vou sair s� porque voc� n�o colabora !!! \n");
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (dados.size() == 0) {
			System.out.println("\nN�o existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < dados.size(); i++) {
				Dados d = dados.get(i);
				System.out.println("Cadastro n�mero: " + i);
				System.out.println("\tNome: " + d.getNome());
				System.out.println("\tLogin: " + d.getLogin());
				System.out.println("\tCargo: " + d.getCargo() + "\n");
				System.out.println("\tCPF: " + d.getCPF() + "\n");
				System.out.println("\tEndere�o: " + d.getEndere�o() + "\n");
				System.out.println("Numero: " + d.getN�mero() + "\n");
				System.out.println("Complemento: " + d.getComplemento() + "\n");
				System.out.println("\tBairro: " + d.getBairro() + "\n");
				System.out.println("\tCidade: " + d.getCidade() + "\n");
				System.out.println("\tEstado: " + d.getEstado() + "\n");
				System.out.println("\tTelefone: " + d.getTelefone() + "\n");
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}