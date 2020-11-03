package com.atayde.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class MeuPrimeiroProjetoApplicationTests {
	
	@Value("${projeto.tipo}")
	private String tipo;
	
	@Value("${projeto.valor}")
	private int valor;


	@Test
	void contextLoads() {
	}
	
	@Test
	void testPropriedades() {
		assertEquals("test", tipo);
		assertEquals(100, valor);
	}

}
