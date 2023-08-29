package ProjetoModulo1;

import java.util.List;

public class Anamnese {
//História atual, tratamento prévio, antecedentes morbidos, condição atual.

	// Atributos

	private String vacina;
	private String vermifugacao;
	private List<String> antecedentesMorbidos;
	private List <String> condicaoAtual;

	// Construtor com parâmetro

	public Anamnese(String vacina, String vermifugacao, List<String> antecedentesMorbidos, List<String> condicaoAtual) {
		this.vacina = vacina;
		this.vermifugacao = vermifugacao;
		this.antecedentesMorbidos = antecedentesMorbidos;
		this.condicaoAtual = condicaoAtual;

	}

	// Construtor sem parâmetro

	public Anamnese() {

	}

	// Setters and getters

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public String getVermifugacao() {
		return vermifugacao;
	}

	public void setVermifugacao(String vermifugacao) {
		this.vermifugacao = vermifugacao;
	}

	public List<String> getAntecedentesMorbidos() {
		return antecedentesMorbidos;
	}

	public void setAntecedentesMorbidos(List<String> antecedentesMorbidos) {
		this.antecedentesMorbidos = antecedentesMorbidos;
	}

	public List<String> getCondicaoAtual() {
		return condicaoAtual;
	}

	public void setCondicaoAtual(List<String> condicaoAtual) {
		this.condicaoAtual = condicaoAtual;
	}

	@Override
	public String toString() {
		return "*Anamnese*{" + 
				"Vacina: " + vacina + " | " + 
				"Vermifugacao: " + vermifugacao + " | " + 
				"AntecedentesMorbidos:" + antecedentesMorbidos + " | " + 
				"CondicaoAtual:" + condicaoAtual +
				"}";
	}
	
}
