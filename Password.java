package PasswordKey;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) throws InterruptedException {
		
		String key = "123456";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite sua senha: ");
		String password = entrada.next().trim();
		
		while(password.equals(key) == false ){
			System.out.printf("\nSenha incorreta!");
			System.out.printf("\nDigite sua senha novamente: \n");
			password = entrada.next().trim();
		}
		
		System.out.println("Carregando programa...");
		Thread.sleep(3000);
		System.out.println("Entrada liberada!");
		/*
		System.out.println("Password " + password);
		System.out.println("Key " + key);
		*/
		System.out.println("Fim do programa!");
		entrada.close();
	}
	
}
