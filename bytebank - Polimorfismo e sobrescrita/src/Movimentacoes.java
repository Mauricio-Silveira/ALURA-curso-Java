
public class Movimentacoes {
	
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	
	
		
	
	
	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}	
		
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	void transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			this.saca(valor);
			destino.deposita(valor);
			
		} else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	
}

