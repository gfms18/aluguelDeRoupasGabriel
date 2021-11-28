package br.edu.ifpe.jaboatao.ts.servicos;

//br.edu.ifpe.jaboata.ts.servicos
import java.util.Date;
import java.util.List;

import br.edu.ifpe.jaboatao.exceptions.LocacaoExceptions;
import br.edu.ifpe.jaboatao.ts.entidades.Cliente;
import br.edu.ifpe.jaboatao.ts.entidades.Locacao;
import br.edu.ifpe.jaboatao.ts.entidades.Roupa;
import br.edu.ifpe.jaboatao.ts.utils.ManipulandoDatas;

public class ServicoLocacao {
	
	public Locacao locar_roupa(Cliente cliente, List<Roupa> roupa) throws LocacaoExceptions {
		
		for (Roupa roupaUnidade : roupa) {
			if (roupaUnidade.getTamanho() == "") {
				throw new LocacaoExceptions("Exceção: Roupa com tamanho vazio.");
			}
		}
		
		for (Roupa roupaQnt : roupa) {
			if (roupaQnt.getQntEmEstoque() == 0) {
				throw new LocacaoExceptions("Exceção: Roupa sem estoque.");
			}
		}
		
			if (roupa == null) {
				throw new LocacaoExceptions("Exceção: Roupa vazia.");
			}

		
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setDataLocacao(new Date());
		
		double preco = 0;
		
		for (Roupa roupaUnidade : roupa) {
			preco += roupaUnidade.getPreco();
		}
		
		locacao.setValor(preco);
		
		//Definir a entrega para 2 dias depois.
		Date dataEntrega = ManipulandoDatas.novaDataComDiferencaDeDias(2);
		locacao.setDataRetorno(dataEntrega);
		
		//Os dados ainda não serão salvos.

		return locacao;
	}

	public static void main(String[] args) {
		System.out.println("Funcionando.");
	}
}