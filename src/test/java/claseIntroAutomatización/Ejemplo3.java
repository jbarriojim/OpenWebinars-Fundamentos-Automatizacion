package claseIntroAutomatización;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejemplo3 {

	@Test
	public void interactionElementsWait() throws InterruptedException {
		int EXPLICIT_TIMEOUT = 30; // segundos
		// Creamos la instancia del driver
		FirefoxDriver driver = new FirefoxDriver();
		// Accedemos a la URL que deseemos
		driver.get("https://www.paypal.com/es/webapps/mpp/account-selection");
		// Aceptamos las cookies
		new WebDriverWait(driver, EXPLICIT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@id='acceptAllButton']"))).click();
		//driver.findElement(By.xpath(".//a[@id='acceptAllButton']")).click();
		// Obtenemos el elemento deseado y le hacemos click
		myFindelement(".//input[@id='radio-personal']", EXPLICIT_TIMEOUT, driver).click();
		//driver.findElement(By.xpath(".//input[@id='radio-personal']")).click();
		// Clickamos en siguiente
		myFindelement(".//a[@id='cta-btn']", EXPLICIT_TIMEOUT, driver).click();
		//driver.findElement(By.xpath(".//a[@id='cta-btn']")).click();
		// Vamos a interactuar con un select
		//Select select = new Select(driver.findElement(By.xpath(".//select[@id='paypalAccountData_countryselector']")));
		Select select = new Select(myFindelement(".//select[@id='paypalAccountData_countryselector']", EXPLICIT_TIMEOUT, driver));
		select.selectByValue("AN");
		// Rellenar campo con texto
		//driver.findElement(By.xpath(".//input[@id='paypalAccountData_firstName']")).sendKeys("MI NOMBRE");
		myFindelement(".//input[@id='paypalAccountData_firstName']", EXPLICIT_TIMEOUT, driver).sendKeys("WAIT NAME");
		Thread.sleep(10000);
		// Cerrar el navegador
		driver.quit();
	}

	public WebElement myFindelement(String xpath, int timeout, WebDriver driver) {
		return new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
}
