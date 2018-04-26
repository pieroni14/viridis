
package viridis.com.steps;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import viridis.com.pages.CenarioPageOne;
import viridis.com.webElements.CenarioOneWebElements;

public class CenarioOneSteap {
	CenarioOneWebElements pagina;
	CenarioPageOne cenarioPageOne;

	@Step("Abrindo a pagina")
	public void abrirPagina() {
		pagina.open();
	}

	@Step("Cadastro Etapa 01 ")
	public void cadastroEtapa1(String email) {
		cenarioPageOne.prencherEmail(email);
	}

	public void cadastroEtapa2(WebDriver driver, String email, String firstName, String lastName, String password,
			String date, String monther, String year, String company, String address, String address2, String city,
			String state, String postalCode, String country, String additionalInformation, String homePhone,
			String mobilePhone, String reference) {
		cenarioPageOne.prencherDadosCliente(driver, email, firstName, lastName, password, date, monther, year, company,
				address, address2, city, state, postalCode, country, additionalInformation, homePhone, mobilePhone,
				reference);
	}

	public void validacaoCadastroEtapa1(WebDriver driver, String emailValidacao) {
		cenarioPageOne.validacaoCadastroEtapa01EmailIncorreto(emailValidacao, driver);

	}

	public void validacaoCadastroEtapa2(WebDriver driver, String emailUtilizado) {
		cenarioPageOne.validacaoCadastroEtapa02EmailJaUtilizado(emailUtilizado, driver);

	}

	public void validacaoCadastroEtapa3(WebDriver driver, String emailnew) {
		cenarioPageOne.validacaoProximaEtapa(emailnew);

	}

	public void validacaoCAdastroEtapa4(WebDriver driver, String email, String firstName, String lastName,
			String password, String date, String monther, String year, String company, String address, String address2,
			String city, String state, String postalCode, String country, String additionalInformation,
			String homePhone, String mobilePhone, String reference) {
		cenarioPageOne.validacaoCadastroTodosCampos(driver, email, firstName, lastName, password, date, monther, year,
				company, address, address2, city, state, postalCode, country, additionalInformation, homePhone,
				mobilePhone, reference);
	}

}
