package classes;

import autentication.Autenticavel;

public class Cliente implements Autenticavel {
		
		private String nome;
		
		private String email;
		
		private Integer senha;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getSenha() {
			return senha;
		}

		public void setSenha(Integer senha) {
			this.senha = senha;
		}
		
		@Override
		public boolean autentica(int senha) {
			if (senha == this.senha) {
				System.out.println("Senha Correta! Login Concluído");
				return true;
			}
			else			 
			{
				System.out.println("Senha Incorreta! Tente novamente!");
				return false; 
			}
		}
		
		public void setCpf(String scannerString) {
			// TODO Auto-generated method stub
					
		}

	
}