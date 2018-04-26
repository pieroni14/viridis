package viridis.com.webElements;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CenarioOneWebElements extends PageObject {
	// Etapa01
	@FindBy(xpath = "//*[@id='email_create']")
	protected WebElement campo_Email;

	@FindBy(xpath = "//*[@id='SubmitCreate']")
	protected WebElement btn_Creation_Account;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	protected WebElement btn_SigIn;

	// Etapa02
	// Mensagens Campos Obrigatórios
	@FindBy(xpath = "//html//div[@class='columns-container']//li[3]")
	protected WebElement msg_FirstName_Obrigatorio;

	@FindBy(xpath = "//html//div[@class='columns-container']//li[2]")
	protected WebElement msg_LastName_Obrigatorio;

	@FindBy(xpath = "//html//div[@class='columns-container']//li[4]")
	protected WebElement msg_Password_Obrigatorio;

	// YOUR PERSONAL INFORMATION
	@FindBy(xpath = "//*[@id='uniform-id_gender1']")
	protected WebElement btn_Radion_Mr;
	@FindBy(xpath = "//*[@id='customer_firstname']")
	protected WebElement txt_FirstName;
	@FindBy(xpath = "//*[@id='customer_lastname']")
	protected WebElement txt_LastName;
	@FindBy(xpath = "//*[@id='email']")
	protected WebElement txt_Email;
	@FindBy(xpath = "//*[@id='passwd']")
	protected WebElement txt_Password;
	@FindBy(xpath = "//*[@id='uniform-days']")
	protected WebElement txt_Day;
	@FindBy(id = "days")
	protected WebElement txt_days;
	@FindBy(xpath = "//*[@id=\"uniform-months\"]")
	protected WebElement txt_Monther;
	@FindBy(xpath = "//*[@id=\"uniform-years\"]")
	protected WebElement txt_Year;
	// YOUR ADDRESS
	@FindBy(xpath = "//*[@id='firstname']")
	protected WebElement txt_FirstName1;
	@FindBy(xpath = "//*[@id='lastname']")
	protected WebElement txt_LastName1;
	@FindBy(xpath = "//*[@id='company']")
	protected WebElement txt_Company;
	@FindBy(xpath = "//*[@id='address1']")
	protected WebElement txt_Andress1;
	@FindBy(xpath = "//*[@id='address2']")
	protected WebElement txt_Andress2;
	@FindBy(xpath = "//*[@id='city']")
	protected WebElement txt_City;
	@FindBy(xpath = "//*[@id='uniform-id_state']")
	protected WebElement txt_State;
	@FindBy(xpath = "//*[@id='postcode']")
	protected WebElement txt_PostCode;
	@FindBy(xpath = "//*[@id='uniform-id_country']")
	protected WebElement txt_Country;
	@FindBy(xpath = "//*[@id='other']")
	protected WebElement txt_Information;
	@FindBy(xpath = "//*[@id='phone']")
	protected WebElement txt_HomePhone;
	@FindBy(xpath = "//*[@id='phone_mobile']")
	protected WebElement txt_PhoneMobile;
	@FindBy(xpath = "//*[@id='alias']")
	protected WebElement txt_Reference;
	@FindBy(xpath = "//*[@id='submitAccount']")
	protected WebElement btn_Register;
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	protected WebElement SigOut;
	@FindBy(xpath = "//*[@id='center_column']/div")
	protected WebElement modalErro02;
}
