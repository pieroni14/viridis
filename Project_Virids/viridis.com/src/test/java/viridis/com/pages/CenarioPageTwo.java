package viridis.com.pages;




import static org.junit.Assert.assertTrue;

import viridis.com.webElements.CenarioTwoWebElements;

public class CenarioPageTwo extends CenarioTwoWebElements {

	public void fazerLogin(String email, String senha) {
		waitABit(1500);
		this.sign_IN.click();
		waitABit(1500);
		this.txt_email.sendKeys(email);
		this.passwd.sendKeys(senha);
		this.btn_Sign_In.click();
	}

	// Cenario 3
	public void home() {
		this.btn_Home.click();
		this.produto.click();

	}

	public void detalheProduto() {
		this.fot1.click();
		this.close.click();
		waitABit(700);
		this.fot2.click();
		waitABit(700);
		this.close.click();
		waitABit(700);
		this.quantidade.click();
		this.cor.click();
		this.btn_AddCart.click();

	}

	public void compraProduto() {

		this.btn_CheckoutCart.click();
		waitABit(700);
		this.btn_checkout.click();
		this.txt_AddComment.sendKeys("teste");
		this.btn_checkout2.click();
		waitABit(700);
		this.radion_terms.click();
		this.btn_check_shipping.click();

	}

	public void finalizarCompra() {
		this.btn_Metodo_Pag.click();
		this.btn_ConfirmaPagamento.click();
		this.modalConfirmacao.getText().equals("Your order on My Store is complete.");

	}

	// Validando Cena 4
	public void validandoMercadoria() {
		this.btn_Home.click();
		nome_mercadoria_home.getText().toString();
		precoHome.getText().toString();
		validaCamposObrigatorios(true, true, false, false, false, false, false);
		this.merc2.click();
		this.preco.getText().toString();
		this.nome_mercadoria.getText().toString();
		validaCamposObrigatorios(false, false, true, true, false, false, false);
		this.quantidade.click();
		this.btn_AddCart.click();

		this.valorDaEntrega.getText().toString();
		this.valorTotalDaCompra.getText().toString();
		this.valorTotalMercadoria.getText().toString();
		validaCamposObrigatorios(false, false, false, false, true, true, true);
		this.btn_check_val.click();
		validaCamposObrigatorios(true, true, true, true, true, true, true);

		this.btn_chekout_summary.click();
		this.btn_chekout_addres.click();
		this.radion_terms.click();
		this.btn_checkout_shipping.click();
	}

	public void validaCamposObrigatorios(boolean nome_mercadoria_home, boolean precoHome, boolean preco,
			boolean nome_mercadoria, boolean valorDaEntrega, boolean valorTotalDaCompra, boolean valorTotalMercadoria) {
		if (nome_mercadoria_home)
			assertTrue(this.getDriver().getPageSource().contains("Blouse"));
		if (precoHome)
			assertTrue(this.getDriver().getPageSource().contains("$27.00"));
		if (preco)
			assertTrue(this.getDriver().getPageSource().contains("$27.00"));
		if (nome_mercadoria)
			assertTrue(this.getDriver().getPageSource().contains("Blouse"));
		if (valorDaEntrega)
			assertTrue(this.getDriver().getPageSource().contains("$2.00"));
		if (valorTotalDaCompra)
			assertTrue(this.getDriver().getPageSource().contains("$56.00"));
		if (valorTotalMercadoria)
			assertTrue(this.getDriver().getPageSource().contains("$54.00"));
	}

}
