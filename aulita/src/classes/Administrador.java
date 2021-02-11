package classes;

public class Administrador extends funcionario {

	private String setoradministrado;
	
	public String getSetoradministrado() {
		return setoradministrado;
	}

	public void setSetoradministrado(String setoradministrado) {
		this.setoradministrado = setoradministrado;
	}

	public String getnivelacesso() {
		return "3 - nível alto";
		
	}
	
	public Administrador() {
		super();
	}
	
	
	public void setSetor(Integer scannerInteger) {
		// TODO Auto-generated method stub
	}
	
}
