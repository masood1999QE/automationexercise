package SeleniumFrameWork.MavenProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFrameWork.Utilities.Commons;

/**
 * Hello world!
 */
public class BrandProductsPage extends Commons{
	WebDriver driver;
	public BrandProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//h2[@class='title text-center']")
	WebElement BrandClothesTitleText;
	
	 public String verifySelectedBrandClothesNameIsVisible() {
		   	return BrandClothesTitleText.getText();
	}
    

   

}
