package executavel;

import java.util.Scanner;

import classes.Administrador;
import classes.Cliente;
import classes.Gerente;
import classes.Programador;

public class executar {

	public static void main (String[] args) {
		Integer I = 0;
		boolean cadCliente = false;
		boolean cadProgramador = false;
		boolean cadGerente = false;
		boolean cadAdministrador = false;
		
		Cliente cliente = new Cliente();
		Programador programador = new Programador();
		Gerente gerente = new Gerente();
		Administrador administrador = new Administrador();
		
		System.out.println("Bem vindo ao sistema de acompanhamento de demanda de requisitos!"
						 + "\n\n");
		while (I < 1) {
			System.out.println("Deseja cadastrar qual usuário?\n"
					         + "1 - Cliente\n"
					         + "2 - Programador\n"
					         + "3 - Gerente\n"
					         + "4 - Administrador\n");
			
			@SuppressWarnings("resource")
			int resp = new Scanner(System.in).nextInt();
				if (resp == 1) {
					cliente = cadastraCliente();
					cadCliente = true;
				}else if (resp == 2) {
					programador = cadastraProgramador();
					cadProgramador = true;
				}else if (resp == 3) {
					gerente = cadastraGerente();
					cadGerente = true;
				}else if (resp == 4) {
					administrador = cadastraAdministrador();
					cadAdministrador = true;
				}
			
			resp = mensagemLogin(cadCliente, cadProgramador, cadGerente, cadAdministrador);
			
			if (resp == 1) {
				logaCliente(cliente);
				I++;
				System.out.println("\n\n");
			}
			else if(resp == 2) {
				logaProgramador(programador);
				I++;
				System.out.println("\n\n");
			}
			else if(resp == 3) {
				logaGerente(gerente);
				I++;
				System.out.println("\n\n");
			}
			else if(resp == 4) {
				logaAdministrador(administrador);
				I++;
				System.out.println("\n\n");
			}
		}		
	}
	
	public static void logaCliente(Cliente cliente) {
		System.out.println("\n\nInforme a senha do usuário Cliente:");
		
		@SuppressWarnings("resource")
		int respSenha = new Scanner(System.in).nextInt();
		
		if (cliente.autentica(respSenha)){
			System.out.println("\n\nLogin autorizado! Acesso concedido");
		}
		
	}
	
	public static void logaProgramador(Programador programador) {
		System.out.println("\n\nInforme a senha do usuário Programador:");
		@SuppressWarnings("resource")
		int respSenha = new Scanner(System.in).nextInt();
		
		if (programador.autentica(respSenha)){
			System.out.println("\n\nLogin autorizado! Acesso concedido");
		}	
			
	}
	
	public static void logaGerente(Gerente gerente) {
		System.out.println("\n\nInforme a senha do usuário Gerente:");
		@SuppressWarnings("resource")
		int respSenha = new Scanner(System.in).nextInt();
		
		if (gerente.autentica(respSenha)){
			System.out.println("\n\nLogin autorizado! Acesso concedido");
		}
		
	}
	
	public static void logaAdministrador(Administrador administrador) {
		System.out.println("\n\nInforme a senha do usuário Administrador:");
		@SuppressWarnings("resource")
		int respSenha = new Scanner(System.in).nextInt();
		
		if (administrador.autentica(respSenha)){
			System.out.println("\n\nLogin autorizado! Acesso concedido");
		}
		
	}
	
	public static Integer mensagemLogin(boolean cadCliente, boolean cadProgramador, boolean cadGerente, boolean cadAdministrador) {
		System.out.println("\n\nDeseja fazer o login em algum dos usuários cadastrados?\n\n");
		
		if (cadCliente == true) {
			System.out.println("1 - Cliente");	
		}
		
		if (cadProgramador == true) {
			System.out.println("2 - Programador");
		}
		
		if (cadGerente == true) {
			System.out.println("3 - Gerente");
		}
		
		if (cadAdministrador == true) {
			System.out.println("4 - Administrador");
		} 
		
		System.out.println("5 - Cadastrar um novo usuário");
		
		Integer resp = scannerInteger();
		
		return resp;
	}
		
	public static Cliente cadastraCliente() {
		Cliente cliente = new Cliente();
		
		System.out.println("\n\nDigite o nome o Cliente");
		cliente.setNome(scannerString());
		System.out.println("Digite o cpf do Cliente");
		cliente.setCpf(scannerString());
		System.out.println("Digite o email do Cliente");
		cliente.setEmail(scannerString());
		System.out.println("Digite a senha do Cliente");
		cliente.setSenha(scannerInteger());
		
		return cliente;
	}
	
	public static Programador cadastraProgramador() {
		Programador programador = new Programador();
		
		System.out.println("\n\nDigite o nome do Programador");
		programador.setNome(scannerString());
		
		System.out.println("Digite as Linguagens  do Programador");
		programador.setLinguagemdev(scannerString());
		
		System.out.println("Digite o Nivel do Programador");
		programador.setNiveldev(scannerString());
		
		System.out.println("Digite o setor do Programador");
		programador.setSetor(scannerString());
		
		System.out.println("Digite a senha do Programador");
		programador.setarSenha(scannerInteger());
		
		return programador;
	}
	
	public static Gerente cadastraGerente() {
		Gerente gerente = new Gerente();
		
		System.out.println("\n\nDigite o nome do Gerente");
		gerente.setNome(scannerString());
		
		System.out.println("Digite o Setor do Gerente");
		gerente.setSetorGerenciado(scannerString());
		
		System.out.println("Digite a senha do Gerente");
		gerente.setSetor(scannerInteger());
		
		return gerente;
	}
	
	public static Administrador cadastraAdministrador() {
		Administrador administrador = new Administrador();
		
		System.out.println("\n\nDigite o nome do Administrador");
		administrador.setNome(scannerString());
		
		System.out.println("Digite o setor do Administrador");
		administrador.setSetoradministrado(scannerString());
		
		System.out.println("Digite a senha do Administrador");
		administrador.setarSenha(scannerInteger());
		
		return administrador;
	}
	
	public static Integer scannerInteger() {
		@SuppressWarnings("resource")
		Integer resp = new Scanner(System.in).nextInt();
		
		return resp;
	}
	
	public static String scannerString() {
		@SuppressWarnings("resource")
		String resp = new Scanner(System.in).nextLine();
		
		return resp;
	}

	
}
