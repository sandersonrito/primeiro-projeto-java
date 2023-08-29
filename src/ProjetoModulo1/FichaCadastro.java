package ProjetoModulo1;

public class FichaCadastro {
	
		private int numeroFicha;
		private String dataCriacao;
		private InfoTutor infoTutor;
		private InfoPaciente infoPaciente;
		private Anamnese anamnese;
		private Responsaveis responsaveis;
		
		public FichaCadastro(int numeroFicha, String dataCriacao, InfoTutor infoTutor, InfoPaciente infoPaciente,
				Anamnese anamnese, Responsaveis responsaveis) {
			
			this.numeroFicha = numeroFicha;
			this.dataCriacao = dataCriacao;
			this.infoTutor = infoTutor;
			this.infoPaciente = infoPaciente;
			this.anamnese = anamnese;
			this.responsaveis = responsaveis;
			
		}
		
		public FichaCadastro() {
			
		}



		public int getNumeroFicha() {
			return numeroFicha;
		}

		public String getDataCriacao() {
			return dataCriacao;
		}

		public InfoTutor getInfoTutor() {
			return infoTutor;
		}

		public InfoPaciente getInfoPaciente() {
			return infoPaciente;
		}

		public Anamnese getAnamnese() {
			return anamnese;
		}

		public Responsaveis getResponsaveis() {
			return responsaveis;
		}

		@Override
		public String toString() {
			return "*FichaCadastro*{" +
					"NumeroFicha: " + numeroFicha + " | " + 
					"DataCriacao: " + dataCriacao + " | " + 
					"InfoTutor: " + infoTutor + " |" +
					"InfoPaciente: " + infoPaciente + " | " +
					"Anamnese: " + anamnese + " | " +
					"Responsaveis: " + responsaveis + 
					"}";
		}
		
		
}
