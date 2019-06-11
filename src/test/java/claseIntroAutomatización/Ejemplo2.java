package claseIntroAutomatización;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejemplo2 {

	@Test
	public void interactionElements() throws InterruptedException {
		// Creamos la instancia del driver
		FirefoxDriver driver = new FirefoxDriver();
		// Accedemos a la URL que deseemos
		driver.get("https://www.paypal.com/es/webapps/mpp/account-selection");
		// Aceptamos las cookies
		driver.findElement(By.xpath(".//a[@id='acceptAllButton']")).click();
		// Obtenemos el elemento deseado y le hacemos click
		driver.findElement(By.xpath(".//input[@id='radio-personal']")).click();
		// Clickamos en siguiente
		driver.findElement(By.xpath(".//a[@id='cta-btn']")).click();
		// Vamos a interactuar con un select
		Select select = new Select(driver.findElement(By.xpath(".//select[@id='paypalAccountData_countryselector']")));
		select.selectByIndex(15);
		// Rellenar campo con texto
		driver.findElement(By.xpath(".//input[@id='paypalAccountData_firstName']")).sendKeys("MI NOMBRE");
		Thread.sleep(10000);
		// Cerrar el navegador
		driver.quit();
	}
}
