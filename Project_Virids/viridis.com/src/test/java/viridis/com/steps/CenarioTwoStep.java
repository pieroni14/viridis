package viridis.com.steps;

import net.thucydides.core.annotations.Step;
import viridis.com.pages.CenarioPageTwo;
import viridis.com.webElements.CenarioTwoWebElements;

public class CenarioTwoStep {
	CenarioTwoWebElements pagina;
	CenarioPageTwo cenarioPageTwo;

	@Step("Abri Pagina e Faz Login")
	public void fazerLoginCliente(String email, String senha) {
		pagina.open();
		cenarioPageTwo.fazerLogin(email, senha);

	}

	@Step("Home Escolhendo Produto")

	public void acessandoHomeEscolhendoProduto() {
		cenarioPageTwo.home();

	}

	@Step("Detalhes do produto Escolhido")

	public void detalhesDoProduto() {
		cenarioPageTwo.detalheProduto();
	}

	@Step("Comprando o produto")
	public void comprarProduto() {
		cenarioPageTwo.compraProduto();

	}

	@Step("Finalizando a compra")
	public void finalizarCompra() {
		cenarioPageTwo.finalizarCompra();

	}

	@Step("Validando as descricao do produto da escolha para o carrinho")
	public void validandoMercadoria() {
		cenarioPageTwo.validandoMercadoria();

	}

}
