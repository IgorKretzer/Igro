package classes;

public class funcionario {
	
	private String nome;
	
	private String fun��o;
	
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

	public String getFun��o() {
		return fun��o;
	}

	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}

	public boolean autentica(int senha) {
		if (senha == this.senha) {
			System.out.println("Senha Correta! Login Conclu�do");
			return true;
		}else{	
			System.out.println("Senha Incorreta! Tente novamente!");
			return false;
		}
	}
}
