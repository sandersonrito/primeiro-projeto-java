package ProjetoModulo1;

public class InfoPaciente {
	
	
	//atributos
	
	private String nome;
	private int idade;
	private String sexo;
	private String pelagem;
	private double peso;
	private String porte;
	private String raca;
	
	public InfoPaciente(String nome, int idade, String sexo, String pelagem, double peso, String porte, String raca) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.pelagem = pelagem;
		this.peso = peso;
		this.porte = porte;
		this.raca = raca;
	}

	public InfoPaciente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "*InfoPaciente*{" + 
				"Nome: " + nome + " | " + 
				"Idade: " + idade + " | " + 
				"Sexo: " + sexo + " | " + 
				"Pelagem: " + pelagem + " | " + 
				"Peso: " + peso + " | " + 
				"Porte: " + porte + " | " + 
				"Raca: " + raca +
				"}";
	}

	
	
	
}
