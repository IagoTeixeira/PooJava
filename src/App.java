
public class App {
	public static void main(String[] args) {
		//Primeiro Cliente e Conta
		Cliente iago = new Cliente("Iago", "222.222.222-22", "Programador");
		Conta contaIago = new Conta(42056, 04, iago);
		
		//Segundo Cliente e Conta
		
		Cliente leide = new Cliente("Leide", "222.222.222-22", "Programador");
		Conta contaLeide= new Conta(42056, 04, leide);
		
		//Getters Da conta
		System.out.println("Saldo de Iago: " + contaIago.getSaldo());
		System.out.println("Agencia de Iago: " + contaIago.getAgencia());
		System.out.println("Numero da agencia de Iago: " + contaIago.getNumero());
		System.out.println("Titular da conta: " + contaIago.getTitular().getNome());
		System.out.println("Cpf do titular: " + contaIago.getTitular().getCpf());
		System.out.println("Profissao do Titular: " + contaIago.getTitular().getProfissao());
		
		//Operações Da conta
		
		contaIago.deposita(400);
		System.out.println("Saldo de Iago Depois de depositar 400: " + contaIago.getSaldo());
		contaIago.saca(200);
		System.out.println("Saldo de Iago depois de sacar 200: " + contaIago.getSaldo());
		contaIago.transfere(200,contaLeide);
		System.out.println("Saldo de Iago depois de transferir: " + contaIago.getSaldo());
		System.out.println("Saldo de Leide depois da transferencia: " + contaLeide.getSaldo());
		
	
	}
}
