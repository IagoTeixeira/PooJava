
public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		System.out.println("Cliente criado com sucesso!");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
}
