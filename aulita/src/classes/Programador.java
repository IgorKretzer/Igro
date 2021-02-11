package classes;

public class Programador extends funcionario {

	private String linguagemdev;
	
	private String niveldev;
	
	private String setor;
	
	public String getLinguagemdev() {
		return linguagemdev;
	}

	public void setLinguagemdev(String linguagemdev) {
		this.linguagemdev = linguagemdev;
	}

	public String getNiveldev() {
		return niveldev;
	}

	public void setNiveldev(String niveldev) {
		this.niveldev = niveldev;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String string) {
		this.setor = string;
	}

	public String getnivelacesso() {
		return "1 - nível baixo";
	}
		
	public Programador() {
		super();
		
	}

	
}
