package viridis.com.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import viridis.com.webElements.CenarioOneWebElements;

public class CenarioPageOne extends CenarioOneWebElements {

	public CenarioPageOne() {
		WebDriver drive = getDriver();
		PageFactory.initElements(drive, this);
	}

	// Cenario 01 Caminho Feliz
	public void prencherEmail(String email) {
		this.btn_SigIn.click();
		this.campo_Email.sendKeys(email);
		this.btn_Creation_Account.click();
	}

	public void prencherDadosCliente(WebDriver driver, String email, String firstName, String lastName, String password,
			String date, String monther, String year, String company, String address, String address2, String city,
			String state, String postalCode, String country, String additionalInformation, String homePhone,
			String mobilePhone, String reference) {
		// YOUR PERSONAL INFORMATION
		waitABit(700);
		this.btn_Radion_Mr.click();
		this.txt_FirstName.sendKeys(firstName);
		this.txt_LastName.sendKeys(lastName);
		this.txt_Email.equals(email);
		this.txt_Password.sendKeys(password);
		this.txt_Day.click();

		Select drpDay = new Select(driver.findElement(By.name("days")));
		drpDay.selectByValue(date);

		this.txt_Monther.click();

		Select drpMother = new Select(driver.findElement(By.name("months")));
		drpMother.selectByValue(monther);

		this.txt_Year.click();

		Select drpYear = new Select(driver.findElement(By.name("years")));
		drpYear.selectByValue(year);

		// YOUR ADDRESS
		this.txt_FirstName1.equals(firstName);
		this.txt_LastName1.equals(lastName);
		this.txt_Company.sendKeys(company);
		this.txt_Andress1.sendKeys(address);
		this.txt_Andress2.sendKeys(address2);
		this.txt_City.sendKeys(city);

		this.txt_State.click();
		Select drpState = new Select(driver.findElement(By.name("id_state")));
		drpState.selectByValue(state);

		this.txt_PostCode.sendKeys(postalCode);
		this.txt_Country.click();

		Select drpCountry = new Select(driver.findElement(By.name("id_country")));
		drpCountry.selectByValue(country);

		this.txt_Information.sendKeys(additionalInformation);
		this.txt_HomePhone.sendKeys(homePhone);
		this.txt_PhoneMobile.sendKeys(mobilePhone);
		this.txt_Reference.clear();
		this.txt_Reference.sendKeys(reference);

		this.btn_Register.click();

		this.SigOut.click();

	}

	// Cenário 02 Validações

	public void validacaoCadastroEtapa01EmailIncorreto(String emailValidacao, WebDriver driver) {

		this.btn_SigIn.click();
		this.campo_Email.sendKeys(emailValidacao);
		this.btn_Creation_Account.click();
		waitABit(2000);

		assertTrue(driver.findElement(By.xpath("//*[@id='create_account_error']")).getText()
				.matches("Invalid email address."));
		this.campo_Email.clear();

	}

	public void validacaoCadastroEtapa02EmailJaUtilizado(String emailUtilizado, WebDriver driver) {
		this.campo_Email.sendKeys(emailUtilizado);
		this.btn_Creation_Account.click();
		waitABit(2000);

		assertTrue(this.getDriver().getPageSource().contains(
				"An account using this email address has already been registered. Please enter a valid password or request a new one. "));

		this.campo_Email.clear();
	}

	public void validacaoProximaEtapa(String emailnew) {
		waitABit(2000);
		this.campo_Email.sendKeys(emailnew);
		this.btn_Creation_Account.click();

	}

	public void validacaoCadastroTodosCampos(WebDriver driver, String email, String firstName, String lastName,
			String password, String date, String monther, String year, String company, String address, String address2,
			String city, String state, String postalCode, String country, String additionalInformation,
			String homePhone, String mobilePhone, String reference) {

		this.btn_Register.click();

		waitABit(1000);

		validaCamposObrigatorios(true, true, true, true, true, true, true, false);

		this.btn_Radion_Mr.click();
		this.txt_FirstName.sendKeys(firstName);
		this.btn_Register.click();

		validaCamposObrigatorios(false, true, true, true, true, true, true, true);

		this.txt_LastName.sendKeys(lastName);
		this.btn_Register.click();

		validaCamposObrigatorios(false, true, true, true, true, true, true, true);

		this.txt_Email.equals(email);

		this.txt_Day.click();
		Select drpDay = new Select(driver.findElement(By.name("days")));
		drpDay.selectByValue(date);
		this.txt_Monther.click();
		Select drpMother = new Select(driver.findElement(By.name("months")));
		drpMother.selectByValue(monther);
		this.txt_Year.click();
		Select drpYear = new Select(driver.findElement(By.name("years")));
		drpYear.selectByValue(year);

		// YOUR ADDRESS
		this.txt_FirstName1.equals(firstName);
		this.txt_LastName1.equals(lastName);
		this.txt_Company.sendKeys(company);
		this.txt_Andress1.sendKeys(address);

		this.btn_Register.click();

		validaCamposObrigatorios(false, false, true, false, true, true, true, true);

		this.txt_City.sendKeys(city);
		this.btn_Register.click();

		validaCamposObrigatorios(false, false, true, false, false, true, true, true);

		this.txt_State.click();
		Select drpState = new Select(driver.findElement(By.name("id_state")));
		drpState.selectByValue(state);

		this.btn_Register.click();

		validaCamposObrigatorios(false, false, true, false, false, true, false, true);

		this.txt_PostCode.sendKeys(postalCode);
		this.btn_Register.click();

		validaCamposObrigatorios(false, false, true, false, false, false, false, true);

		this.txt_Country.click();
		Select drpCountry = new Select(driver.findElement(By.name("id_country")));
		drpCountry.selectByValue(country);

		this.txt_Information.sendKeys(additionalInformation);
		this.txt_HomePhone.sendKeys(homePhone);
		this.txt_PhoneMobile.sendKeys(mobilePhone);
		this.btn_Register.click();

		validaCamposObrigatorios(false, false, true, false, false, false, false, false);

		this.txt_Reference.clear();
		this.txt_Reference.sendKeys(reference);
		this.txt_Password.sendKeys(password);
	}

	// Validação
	public void validaCamposObrigatorios(boolean lastname, boolean firstname, boolean passwd, boolean address1,
			boolean city, boolean Zip_Postal, boolean country, boolean phoneNumber) {
		if (lastname)
			assertTrue(this.getDriver().getPageSource().contains("lastname"));
		if (firstname)
			assertTrue(this.getDriver().getPageSource().contains("firstname"));
		if (passwd)
			assertTrue(this.getDriver().getPageSource().contains("passwd"));
		if (address1)
			assertTrue(this.getDriver().getPageSource().contains("address1"));
		if (city)
			assertTrue(this.getDriver().getPageSource().contains("city"));
		if (Zip_Postal)
			assertTrue(this.getDriver().getPageSource()
					.contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"));
		if (country)
			assertTrue(this.getDriver().getPageSource().contains("This country requires you to choose a State."));
		if (phoneNumber)
			assertTrue(this.getDriver().getPageSource().contains("You must register at least one phone number."));
	}

}
