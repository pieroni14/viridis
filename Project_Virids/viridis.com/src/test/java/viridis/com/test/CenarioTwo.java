package viridis.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import viridis.com.steps.CenarioTwoStep;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/cenario2.csv")
public class CenarioTwo {

	protected String email, senha;

	@Managed(driver = "chrome")
	WebDriver driver;
	

	@Steps
	CenarioTwoStep step;

	// Cenario 3 Caminho Feliz
	@Test
	public void SimulaCompra() {
		step.fazerLoginCliente(email, senha);
		step.acessandoHomeEscolhendoProduto();
		step.detalhesDoProduto();
		step.comprarProduto();
		step.finalizarCompra();
		driver.close();
	}
	
	//Cenario 4 Caminho Validacao
	@Test
	public void ValidacaoCompra() {
		step.fazerLoginCliente(email, senha);
		step.validandoMercadoria();
	}

}
