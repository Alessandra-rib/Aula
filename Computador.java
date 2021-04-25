package ListaAvaliativa;

public class Computador {
	
	private String marca;
	private double preco;
	private SistemaOperacional nomeSistema;
	private MemoriaUSB memoria;
	private Componente qtdComponentes[];
	
	
	public Computador(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;
		nomeSistema = new nomeSistema;
		qtdComponentes = new qtdComponentes[4];
	}

	public void addComponentes(Componente comp) {
		for (int i = 0; i < 5; i++) {
			if (this.qtdComponentes[i] == null) {
				this.qtdComponentes[i] = comp;
				break;
			}
		}
	}
	
	public void addMemoriaUSB(MemoriaUSB mem) {
		System.out.println("Marca: " + memoria.getMarca() + "Capacidade: " + memoria.getCapacidade());
	}
		
	
	public void mostraPcConfig() {
		
		System.out.println("Marca PC: " + this.marca);
		System.out.println("Preco PC: " + this.preco);
		System.out.println("Componentes PC: ");
			for(Componente qtdComponente: qtdComponentes)
				System.out.println("Nome: " + qtdComponentes.getNome() + "Tipo: " + qtdComponentes.getTipo());

	}
	
	//Getter and Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public SistemaOperacional getNomeSistema() {
		return nomeSistema;
	}

	public MemoriaUSB getMemoria() {
		return memoria;
	}

	public void setMemoria(MemoriaUSB memoria) {
		this.memoria = memoria;
	}

	public Componente[] getQtdComponentes() {
		return qtdComponentes;
	}

	public void setQtdComponentes(Componente[] qtdComponentes) {
		this.qtdComponentes = qtdComponentes;
	}
