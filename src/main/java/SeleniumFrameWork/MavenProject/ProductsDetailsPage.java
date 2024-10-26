package SeleniumFrameWork.MavenProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFrameWork.Utilities.Commons;

/**
 * Hello world!
 */
public class ProductsDetailsPage extends Commons{
	WebDriver driver;
	public ProductsDetailsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
    
	@FindBy(xpath="//h2[contains(text(),'ALL')]")
	WebElement productsPageText;
	
	@FindBy(css="a[href='/product_details/1']")
	WebElement firstProductBtn;
	
	@FindBy(css="div[class='product-information']")
	WebElement productScope;
	
	@FindBy(css="div[class='product-information'] span span")
	WebElement priceText;
	
	@FindBy(css="div[class='product-information'] h2")
	WebElement productNameText;
	
	@FindBy(css="input#quantity")
	WebElement increaseProdQuantityBtn;
	
	@FindBy(xpath="//button[contains(@class,'cart')]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//u[text()='View Cart']")
	WebElement ViewCartBtnModal;
	
    public String verifyProductsDetailsPage() {
    	return driver.getTitle();
    }
    
  
    public int getTheProductsDetails() {
    	
    	List<WebElement> products =productScope.findElements(By.cssSelector("p"));
    	for(WebElement product:products)
    	{
    		System.out.println(product.getText());
    	}
    	System.out.println("Product Name:"+productNameText.getText());
    	System.out.println("Product Price:"+priceText.getText());
    	return products.size();
    	
    }
    
    public void addProductQuantity(int increaseCount) {
    	
    	for(int i=1;i<increaseCount;i++)
    	{
    		increaseProdQuantityBtn.sendKeys(Keys.ARROW_UP);
    	}
  
    }
    
    public void clickAddCart() {
    	
    	ClickBtn(addToCartBtn);
    	
    }
    
    public void clickViewCart() {
    	waitForElementToBeClickable(ViewCartBtnModal);
    	ClickBtn(ViewCartBtnModal);
    }
    
 
}