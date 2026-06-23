package conta_bancaria.model;

public class ContaPoupanca {
	
	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario;
		
	}

	public int getDiaAniversario() {
		return aniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.aniversario = aniversario;
	}
	
	
}
