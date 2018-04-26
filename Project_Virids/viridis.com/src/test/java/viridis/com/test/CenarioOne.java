package viridis.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import viridis.com.steps.CenarioOneSteap;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/cenario1.csv")

public class CenarioOne {
	// Pega credenciais do CSV
	protected String email,firstName,lastName,password,date,monther,year,company,address,address2,city,state,postalCode,country,additionalInformation,homePhone,mobilePhone,reference,emailValidacao,emailUtilizado,emailnew;

	// Configura o webdriver
	@Managed(driver = "chrome")
	WebDriver driver;

	// Steps
	@Steps
	CenarioOneSteap step;

	// Caminho Feliz
	@Test
	public void CadastroDeCliente() {
		step.abrirPagina();
		step.cadastroEtapa1(email);
		step.cadastroEtapa2(driver,email,firstName,lastName,password,date,monther,year,company,address,address2,city,state,postalCode,country,additionalInformation,homePhone,mobilePhone,reference);
		driver.close();
	}
	
	// Caminho Validação Feliz
	@Test
	public void CadastroClienteValidacao(){
		step.abrirPagina();
		step.validacaoCadastroEtapa1(driver,emailValidacao);
		step.validacaoCadastroEtapa2(driver,emailUtilizado);
		step.validacaoCadastroEtapa3(driver,emailnew);
		step.validacaoCAdastroEtapa4(driver,emailnew,firstName,lastName,password,date,monther,year,company,address,address2,city,state,postalCode,country,additionalInformation,homePhone,mobilePhone,reference);
		driver.close();
	}

}
