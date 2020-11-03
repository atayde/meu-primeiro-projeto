package com.atayde.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.atayde.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {
	
	@Value("${projeto.tipo}")
	private String tipo;
	
	@Value("${projeto.valor}")
	private int valor;

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.err.println("### Valor propriedade (" + this.tipo + ") = " + this.valor);		
			
			
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.err.println("Senha encoded: " + senhaEncoded);	
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.err.println("Senha encoded novamente: " + senhaEncoded);	

			System.err.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));	
			
		};
	}

}
