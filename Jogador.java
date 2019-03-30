package metodosAgeis;

public class Jogador {

	private int escolha;
	private String nome;

	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public Jogador(int escolha, String nome) {
		super();
		this.escolha = escolha;
		this.nome = nome;
	}

	public int getEscolha() {
		return escolha;
	}
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
