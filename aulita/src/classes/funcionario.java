package classes;

public class funcionario {
	
	private String nome;
	
	private String função;
	
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setarSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
	}

	public boolean autentica(int senha) {
		if (senha == this.senha) {
			System.out.println("Senha Correta! Login Concluído");
			return true;
		}else{	
			System.out.println("Senha Incorreta! Tente novamente!");
			return false;
		}
	}
}
