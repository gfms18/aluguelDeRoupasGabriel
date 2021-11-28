package br.edu.ifpe.jaboatao.ts.Servicos;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import br.edu.ifpe.jaboatao.exceptions.LocacaoExceptions;
import br.edu.ifpe.jaboatao.ts.entidades.Cliente;
import br.edu.ifpe.jaboatao.ts.entidades.Locacao;
import br.edu.ifpe.jaboatao.ts.entidades.Roupa;
import br.edu.ifpe.jaboatao.ts.servicos.ServicoLocacao;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AluguelServiceTest {

	ServicoLocacao service;
	
	@BeforeEach
	public void test() {
		Cliente cliente = new Cliente("m");
		Locacao locacao = new Locacao();
		service = new ServicoLocacao();

	}

	@Test
	public void valorCorreto() {
		service = new ServicoLocacao();

		List<Roupa> roupas = Arrays.asList(new Roupa("m", "m", 4, 700.0), new Roupa("m", "m", 3, 650.0));
		Cliente cliente = new Cliente("m");
		Locacao locacao = new Locacao();

		try {
			locacao = service.locar_roupa(cliente, roupas);
		} catch (LocacaoExceptions e) {
			e.printStackTrace();
		}

		Assertions.assertEquals(1350, locacao.getValor());

	}

	@Test
	public void tamanhoVazio() {

		service = new ServicoLocacao();

		Cliente cliente = new Cliente("m");
		List<Roupa> roupas = Arrays.asList(new Roupa("m", "m", 2, 34.0), new Roupa("m", "", 3, 43.0));
		Locacao locacao = new Locacao();

		try {
			locacao = service.locar_roupa(cliente, roupas);
			Assertions.fail("Deveria ter ocorrido uma exception, mas não ocorreu.");
		} catch (LocacaoExceptions e) {
			Assertions.assertEquals("Exceção: Roupa com tamanho vazio.", e.getMessage());

		}

	}
	
}
