package ElementsSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    public By byIngresar = By.xpath("//div[@class = 'az_wmb']");
    public WebElement Ingresar (WebDriver driver)
    {
        WebElement ingresar = driver.findElement(byIngresar);
        return ingresar;
    }

    public By byAccount = By.xpath("//div[@class= 'az_Imb az_Jmb']/a[@id='my-account-sign-in']");

}