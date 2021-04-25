package ListaAvaliativa;

public class Componente {
	
	private String tipo;
	private String nome;
	
	public Componente(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	//Getter and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
