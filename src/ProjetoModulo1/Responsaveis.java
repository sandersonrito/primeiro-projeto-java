package ProjetoModulo1;

public class Responsaveis {

	// Atributos

	private String professor;
	private String veterinario;
	private String aluno;

	// Constructor com parâmetro

	public Responsaveis(String professor, String veterinario, String aluno) {
		this.professor = professor;
		this.veterinario = veterinario;
		this.aluno = aluno;
	}

	// Constructor sem parâmetro

	public Responsaveis() {

	}

	// Setters e Getters

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "*Responsáveis*{" + 
				"Professor: " + professor + " | " + 
				"Veterinario: " + veterinario + " | " + 
				"Aluno:" + aluno +
				"}";
	}
	
	
}
