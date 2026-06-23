package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	
	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
		
	}

	public int getDiaAniversario() {
		return aniversario;
	}

	public void setDiaAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Aniversário da conta: dia " + this.aniversario);
	}
	    
}
