
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	Conta(int agencia, int numero, Cliente titular){
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	
	public boolean deposita(double valor) {
		if(valor <= 0) {
			return false;
		}
		this.saldo += valor;
		return false;

	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta conta){
		if(this.saldo >= valor) {
			conta.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
}
