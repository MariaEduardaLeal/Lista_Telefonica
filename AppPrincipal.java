import java.util.Scanner;

public class AppPrincipal {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		
		
		System.out.println("====================================================="
				+ "\nEscolha a opção que deseja executar :"
				+ " \n [0] Sair do menu"
				+ " \n [1] Deseja criar um novo contato"
				+ "	\n [2] Deseja visualizar sua lista de contatos"
				+ "	\n [3] Deseja substituir o nome, número e email de algum contato"
				+ "	\n [4] Deseja excluir algum contato da sua lista"
				+ " \n [5] Deseja adicionar um novo evento"
				+ " \n [6] Deseja visualizar sua lista de eventos"
				+ " \n [7] Deseja atualizar os dados de algum evento"
				+ " \n [8] Deseja excluir algum evento da sua lista"
				+ "	\n ====================================================\");");
		escolha = scan.nextInt();
		
		scan.nextLine();//Na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado antes da leitura do valor String
		ContatoCRUD contato = new ContatoCRUD();
		EventoCRUD evento = new EventoCRUD();
		
		switch (escolha) {
		case 1:
			System.out.println("Digite o nome do contato");
			String nome = scan.nextLine();
			System.out.println("Digite o número do contato");
			String num = scan.nextLine();
			System.out.println("Deseja adicionar email ao contato ? (s/n)");
			char sino = scan.next().charAt(0);
			scan.nextLine();
			
			if(sino =='s') {
				System.out.println("Digite o email do contato");
				String email = scan.nextLine();
				contato.criarContato(nome, num, email);
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
			}
			else {
				contato.criarContato(nome, num, null);
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
			}
			
			break;
			
		case 2:
			contato.listarContato();
			break;
		
		case 3:
			contato.listarContato();
			int escolha2 = 0;
				
					
				
			System.out.println("\n\nDigite o número identificador do contato que deseja alterar os dados");
			int id2 = scan.nextInt();
			System.out.println("\nEscolha uma opção"
					+ "\n[1] Mudar o nome"
					+ "\n[2] Mudar o telefone"
					+ "\n[3] Mudar o email"
					+ "\n[4] Mudar todos os valores"
					+ "\n[5] Sair do menu");
			 escolha2 = scan.nextInt();
			 

			switch (escolha2) {
			case 1:
				scan.nextLine();
				System.out.println("Digite o novo nome ");
				String newname = scan.nextLine();
				contato.atualizarNomeContato(id2, newname);
				
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
				break;
			case 2:
				System.out.println("Digite o novo telefone");
				String newnum = scan.nextLine();
				contato.atualizarTelefoneContato(id2, newnum);
				
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
				break;
			case 3:
				System.out.println("Digite o novo email");
				String newemail = scan.nextLine();
				contato.atualizarEmailContato(id2, newemail);
				
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
				break;
			case 4:
				System.out.println("Digite o novo nome ");
				String newname2 = scan.nextLine();
				contato.atualizarNomeContato(id2, newname2);
				System.out.println("Digite o novo telefone");
				String newnum2 = scan.nextLine();
				contato.atualizarTelefoneContato(id2, newnum2);
				System.out.println("Digite o novo email");
				String newemail2 = scan.nextLine();
				contato.atualizarEmailContato(id2, newemail2);
				
				System.out.println("Aqui está sua agenda de contatos atualizadas");
				contato.listarContato();
				break;
				
			

			default:
				System.out.println("Opção inválida");
				break;
			}
			break;//case 3
			
					
		case 4:
			System.out.println("Informe o id do contato que deseja substituir");
			int delet = scan.nextInt();
			
			contato.excluirContato(delet);
			scan.nextLine();
			
			System.out.println("Aqui está sua agenda de contatos atualizadas");
			contato.listarContato();
			break;
		case 5:
			
			System.out.println("Digite a data do evento na sequência de ano, mês e data, usando essa formatação:(aaaa/mm/dd)");
			String data = scan.nextLine();
			System.out.println("Digite a descrição do seu evento");
			String desc = scan.nextLine();
			
			evento.criarEvento(desc, data);		
			
			System.out.println("Aqui está sua lista de eventos atualizadas");
			evento.listarEvento();
			break;
		case 6:
			evento.listarEvento();
			break;
		case 7:
			evento.listarEvento();
			
			System.out.println("\n\nDigite a o número identificador do evento que você deseja alterar");
			int id3 = scan.nextInt();
			int escolha3 = 0
					;
			
				
			System.out.println("\nEscolha uma opção"
					+ "\n[1]Mudar a data do evento"
					+ "\n[2]Mudar a descrição do evento"
					);
			 escolha3 = scan.nextInt();
			
				switch (escolha3) {
				case 1:
					scan.nextLine();
					System.out.println("Digite uma nova data para o evento usando a seguinte formatação(aaaa/mm/dd)");
					String newdata = scan.nextLine();
					evento.atualizarDataEvento(id3, newdata);
					System.out.println("Aqui está sua lista de eventos atualizadas");
					evento.listarEvento();
					break;
				case 2:
					scan.nextLine();
					System.out.println("Digite a nova descrição do evento");
					String newdesc = scan.nextLine();
					evento.atualizarDescricaoEvento(id3, newdesc);
					System.out.println("Aqui está sua lista de eventos atualizadas");
					evento.listarEvento();
					break;
			

				default:
					System.out.println("Opção Inválida");
					System.out.println("SAINDO...");
					break;
				
			}
			break;//case 7
		case 8:
			evento.listarEvento();
			System.out.println("\nDigite o número identificador do evento que deseja excluir");
			int deletev = scan.nextInt();
			evento.deletarEvento(deletev);
			
			evento.listarEvento();
			break;
					
			
				
				
				
			
			

		default:
			break;
		}//switch (escolha)

}//public static void main(String[] args)
}//AppPrincipal

