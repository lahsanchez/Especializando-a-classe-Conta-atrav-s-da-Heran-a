
public class Conta {
	
	private double saldo;
	

	/** FAZ SAQUE **/
	public boolean saca(double valorDoSaque){
		if(getSaldo() < valorDoSaque){
			return false;
		} else {
			saldo = saldo - valorDoSaque;
			return true;
		}
	}

	/** FAZ DEPOSITO **/
	public void deposita(double valorDepositado){
		saldo = saldo + valorDepositado;
	}
		
	public double getSaldo() {
		return this.saldo;
	}
	
	
}