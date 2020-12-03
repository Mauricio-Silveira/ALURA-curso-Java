
public class ContaCorrente implements Conta, Tributavel{
	
	Movimentacoes movimentacoes = new Movimentacoes();
	
	@Override
	public boolean saca(double valor) {
		
		double valorASacar = valor + 0.2;
		if (valorASacar <= movimentacoes.getSaldo()) {
			return saca(valorASacar);
		}else 
			return false;
	}

	@Override
	public void deposita(double valor) {
		movimentacoes.deposita(valor);
		
	}

	@Override
	public double getValorImposto() {
		return movimentacoes.getSaldo() * 0.1;
	}

	@Override
	public double getSaldo() {
		
		return movimentacoes.getSaldo();
	}


	
	@Override
	public void setSaldo(double valor) {
		
		movimentacoes.setSaldo(valor);
		
	}

	

	
	
	
}
	
