package ListaAvaliativa;

public class Cliente {

	private String nome;
	private long cpf;
	private Computador computador;
	
	public Cliente(String nome, long cpf, int qtdComputador) {
		this.nome = nome;
		this.cpf = cpf;
		computador = new qtdComputador[2];
	}
	
	public void addComputador (Computador computador) {
		for (int i = 0; i < 2; i++) {
			if (this.qtdComputador[i] == null) {
				this.qtdComputador[i] = computador;
				break;
			}
		}
	}
	
	public void double calculaCompra () {
		System.out.println("Total da Compra: " + cliente.calculaCompra());
		
	}	
		
	//Getter and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Computador getComputador() {
		return computador;
	}

	public void setComputador(Computador computador) {
		this.computador = computador;
	}
	

}
