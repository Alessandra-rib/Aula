package ListaAvaliativa;

public class main {

	public static void main (String []args) {
		Cliente cliente = new Cliente ("Ale", 123456, 2);
		
		Computador comput1 = new Computador ("AlienWarw", 6000, 4, "Windows");
		
		Computador comput2 = new Computador ("Positivo da Xuxa", 1800, 4, "Windows");

		comput1.addComponentes(new Componente("GPU", "Geforce RTX 3080"));
		comput1.addComponentes(new Componente("CPU", "Intel i5"));
		comput1.addComponentes(new Componente("SSD", "1TB"));
		comput1.addComponentes(new Componente("RAM", "32GB"));
		
		comput1.mostraPcConfig();
		
		comput2.addComponentes(new Componente("CPU", "Pentium III"));
		comput2.addComponentes(new Componente("HD", "100GB"));
		comput2.addComponentes(new Componente("RAM", "1GB"));
		comput2.addComponentes(new Componente("Modem", "Discado"));
		comput2.addMemoriaUSB("Kingston", 32);
		
		comput2.mostraPcConfig();
		
		System.out.println("Preco total: " + cliente.calculaCompra());
    
	}
}
