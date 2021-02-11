package classes;

public class Gerente extends funcionario{
	
	private String setorGerenciado;
	
	public String getSetorGerenciado() {
		return setorGerenciado;
	}
	public void setSetorGerenciado(String setorGerenciado) {
		this.setorGerenciado = setorGerenciado;
	}

	public String getnivelacesso() {
		return "2 - nível médio";
	}

	public Gerente() {
		super();
	}
	
			
	public void setSetor(Integer scannerInteger) {
		// TODO Auto-generated method stub
		
	}
	
}	
		
