package viridis.com.webElements;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CenarioTwoWebElements extends PageObject {
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	protected WebElement sign_IN;

	@FindBy(xpath = "//*[@id='email']")
	protected WebElement txt_email;

	@FindBy(xpath = "//*[@id='passwd']")
	protected WebElement passwd;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	protected WebElement btn_Sign_In;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	protected WebElement btn_Home;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	protected WebElement produto;

	@FindBy(xpath = "//*[@id='thumb_1']")
	protected WebElement fot1;

	@FindBy(xpath = "//*[@id='thumb_2']")
	protected WebElement fot2;

	@FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]")
	protected WebElement quantidade;

	@FindBy(xpath = "//*[@id='color_14']")
	protected WebElement cor;

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	protected WebElement btn_AddCart;

	@FindBy(xpath = "//*[@id='product']/div[2]/div/div/a")
	protected WebElement close;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	protected WebElement btn_CheckoutCart;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement btn_checkout;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement btn_checkout2;

	@FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
	protected WebElement txt_AddComment;

	@FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
	protected WebElement radion_terms;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	protected WebElement btn_check_shipping;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement btn_Metodo_Pag;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement btn_ConfirmaPagamento;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
	protected WebElement modalConfirmacao;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]")
	protected
	WebElement merc2;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a")
	protected
	WebElement nome_mercadoria_home;
	@FindBy(xpath = "//*[@id=\"our_price_display\"]")
	protected
	WebElement preco;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[1]/span")
	protected
	WebElement precoHome;
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
	protected
	WebElement nome_mercadoria;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")
	protected
	WebElement valorTotalMercadoria;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[2]/span")
	protected
	WebElement valorDaEntrega;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/span")
	protected
	WebElement valorTotalDaCompra;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected
	WebElement btn_check_val;
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement btn_chekout_addressVerify;
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	protected
	WebElement btn_checkout_shipping;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	protected
	WebElement btn_chekout_addres;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected
	WebElement btn_chekout_summary;
}
