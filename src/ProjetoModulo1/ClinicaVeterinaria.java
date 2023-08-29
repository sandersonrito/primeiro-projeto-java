package ProjetoModulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ClinicaVeterinaria {

	public static void main(String[] args) throws Exception {

		
		List<FichaCadastro> atendimentos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true){
			
			System.out.println("__________Ficha Atendimento_________\n");
			
			System.out.println("Digite o número da ficha de atendimento: ");
			int numeroFicha = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite data da criação do atendimento: ");
			String dataCriacao = sc.nextLine();

			
			InfoPaciente infoPaciente = new InfoPaciente();
			System.out.println("__________Informações do Paciente_________\n");
			
			System.out.println("Informe o nome do paciente: ");
			String nomePaciente = sc.nextLine();
			infoPaciente.setNome(nomePaciente);
			
			System.out.println("Informe a idade do paciente: ");
			int idadePaciente = sc.nextInt();
			sc.nextLine();
			infoPaciente.setIdade(idadePaciente);
			
			System.out.println("Informe o sexo do paciente: ");
			String sexoPaciente = sc.nextLine();
			infoPaciente.setSexo(sexoPaciente);
			
			System.out.println("Informe o pelagem do paciente: ");
			String pelagemPaciente = sc.nextLine();
			infoPaciente.setPelagem(pelagemPaciente);
			
			System.out.println("Informe o peso do paciente: ");
			double pesoPaciente = sc.nextDouble();
			sc.nextLine();
			infoPaciente.setPeso(pesoPaciente);
			
			System.out.println("Informe o porte do paciente: ");
			String portePaciente = sc.nextLine();
			infoPaciente.setPorte(portePaciente);
			
			System.out.println("Informe a raça do paciente: ");
			String racaPaciente = sc.nextLine();
			infoPaciente.setRaca(racaPaciente);
			
			
			InfoTutor infoTutor = new InfoTutor();
			System.out.println("__________Informações do Tutor_________\n");
			
			
			System.out.println("Informe o nome do tutor: ");
			String nomeTutor = sc.nextLine();
			infoTutor.setNome(nomeTutor);
			
			System.out.println("Informe o CPF do tutor: ");
			String cpfTutor = sc.nextLine();
			infoTutor.setCpf(cpfTutor);
			
			System.out.println("Informe o endereço: ");
			String enderecoTutor = sc.nextLine();
			infoTutor.setEndereco(enderecoTutor);
			
			System.out.println("Informe o numero da residência: ");
			int numeroTutor = sc.nextInt();
			sc.nextLine();
			infoTutor.setNumero(numeroTutor);
			
			System.out.println("Informe o complemento: ");
			String complementoTutor = sc.nextLine();
			infoTutor.setComplemento(complementoTutor);
			
			System.out.println("Informe o bairro: ");
			String bairroTutor = sc.nextLine();
			infoTutor.setBairro(bairroTutor);
			
			System.out.println("Informe a cidade: ");
			String cidadeTutor = sc.nextLine();
			infoTutor.setCidade(cidadeTutor);
			
			System.out.println("Informe o CEP: ");
			String cepTutor = sc.nextLine();
			infoTutor.setCep(cepTutor);
			
			System.out.println("Informe o telefone: ");
			String telefoneTutor = sc.nextLine();
			infoTutor.setTelefone(telefoneTutor);
			
			Anamnese anamnese = new Anamnese();
			System.out.println("__________Anamnese_________\n");
			
			
			System.out.println("O paciente tomou vacina(sim ou nao)? ");
			String vacina = sc.nextLine();
			anamnese.setVacina(vacina);
			
			// lembrar de colocar o equals
			//if (vacina == "sim") {
				//System.out.println("Digite a validade da vacina: ");
				//String validade = sc.next();
				//anamnese.setValidade(validade);
			//}
			
			System.out.println("O paciente foi vermifugado (sim ou nao)? ");
			String vermifugacao = sc.nextLine();
			anamnese.setVermifugacao(vermifugacao);
			
			System.out.println("O paciente possui antecedentes morbidos (sim ou nao)? ");
			String opcaoAntecedentes = sc.nextLine();
			if(opcaoAntecedentes.toLowerCase().equals("sim")) {
				String antecedente;
				List<String> antecedentesMorbidos = new ArrayList<>();
				do{
					System.out.println("Informe o antecedente (ou digite -1 para sair): ");
					antecedente = sc.nextLine();
					
					if(!antecedente.toLowerCase().equals("-1")) {
						antecedentesMorbidos.add(antecedente);	
					}
					
				} while(!antecedente.toLowerCase().equals("-1"));
				anamnese.setAntecedentesMorbidos(antecedentesMorbidos);
			}
			
			System.out.println("Informe a condição atual do paciente (doente ou bem): ");
			String avaliacao = sc.nextLine();
			if(avaliacao.toLowerCase().equals("Doente")) {
				String condicao;
				List<String> condicaoAtual = new ArrayList<>();
				do {
					System.out.println("Descreva a situação atual do paciente (ou digite -1 para sair): ");
					condicao = sc.nextLine();
					
					if(!condicao.toLowerCase().equals("-1")) {
						condicaoAtual.add(condicao);
					}
					
				}while(!condicao.toLowerCase().equals("-1"));
				anamnese.setCondicaoAtual(condicaoAtual);
			}
				
			
			Responsaveis responsaveis = new Responsaveis();
			System.out.println("__________Responsáveis pelo atendimento_________\n");
	
			
			System.out.println("Informe o professor responsável: ");
			String professor = sc.nextLine();
			responsaveis.setProfessor(professor);
			
			System.out.println("Informe o veterinario responsável pelo atendimento: ");
			String veterinario = sc.nextLine();
			responsaveis.setVeterinario(veterinario);
			
			System.out.println("Informe estudante por auxiliar no atendimento: ");
			String aluno = sc.nextLine();
			responsaveis.setAluno(aluno);

			
			FichaCadastro fichaCadastro = new FichaCadastro(numeroFicha, dataCriacao, infoTutor, infoPaciente, anamnese, responsaveis);
			atendimentos.add(fichaCadastro);
			
			System.out.println("Deseja cadastrar um novo paciente (digite nao para parar)?");
			String opcao = sc.nextLine();
			if(opcao.toLowerCase().equals("nao")){
				break;
			}
		
		}
		
		System.out.println("__________Relatório Atendimentos_________\n");
		
		for(int i=0;i<atendimentos.size();i++) {
			System.out.println(atendimentos.get(i) + "\n");
			
		}
		
		sc.close();
	}
}	
		