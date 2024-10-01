package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class 
{
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement un;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//button[contains(.,'Log')]")
	private WebElement login_button;
	
	@FindBy(xpath = "//span[contains(.,'PIM')]")
	private WebElement pim_link;
	
	@FindBy(xpath = "//a[contains(.,'Add Employee')]")
	private WebElement add_button;
	
	@FindBy(name = "firstName")
	private WebElement f_name;
	
	@FindBy(name = "lastName")
	private WebElement l_name;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement save_button;
	
	@FindBy(xpath = "//a[.='Employee List']")
	private WebElement employeelist_link;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement e_name_textfield;
	
	@FindBy(xpath = "//button[.=' Search ']")
	private WebElement search_button;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement delete_icon;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	private WebElement yes_delete;
	
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return un;
	}
	public WebElement password()
	{
		return pwd;
	}
	public WebElement login()
	{
		return login_button;
	}
	
	public WebElement pim()
	{
		return pim_link;
	}
	
	public WebElement add()
	{
		return add_button;
	}
	
	public WebElement fname()
	{
		return f_name;
	}
	
	public WebElement lname()
	{
		return l_name;
	}
	public WebElement save()
	{
		return save_button;
	}
	public WebElement employeelist()
	{
		return employeelist_link;
	}
	public WebElement ename()
	{
		return e_name_textfield;
	}
	public WebElement search()
	{
		return search_button;
	}
	public WebElement delete()
	{
		return delete_icon;
	}
	public WebElement yes_delete()
	{
		return yes_delete;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
