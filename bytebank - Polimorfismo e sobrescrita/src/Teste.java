
public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100, 150);
		ContaPoupanca cp = new ContaPoupanca(100, 123);
		SeguroDeVida seg = new SeguroDeVida();
		CalculadorImposto ci = new CalculadorImposto();
		
		cc.deposita(100);
		cp.deposita(200);
		ci.Registra(seg);
		ci.Registra(cc);
		
		//cc.transfere(99.8, cp);
		
		//System.out.println("CC: " + cc.getSaldo());
		//System.out.println("CP: " + cp.getSaldo());
		
		System.out.println(ci.getTotalImposto());

	}

}
