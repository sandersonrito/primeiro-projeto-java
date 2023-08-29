package ProjetoModulo1;

public class InfoTutor {

	// atributos

	private String nome;
	private String cpf;
	private String endereco;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String telefone;

	// construtores com parâmetros

	public InfoTutor(String nome, String cpf, String endereco, int numero, String complemento, String bairro,
			String cidade, String cep, String telefone) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;

		// construtores sem parametros

	}

	public InfoTutor() {

	}

	// getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "*InfoTutor*{" + 
				"Nome: " + nome + " | " + 
				"CPF: " + cpf + " | " + 
				"Endereco: " + endereco + " | " + 
				"Numero: " + numero + " | " + 
				"Complemento: " + complemento + " | " + 
				"Bairro: " + bairro + " | " +
				"Cidade: " + cidade + " | " + 
				"CEP: " + cep + " | " + 
				"Telefone: " + telefone +
				"}";
	}
	
	
}
