
public class Cadastro {
	
	
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	
	public Cadastro (int agencia, int numero) {
		//System.out.println("Abertura de Conta");
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		
	}
	
		
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	
}

