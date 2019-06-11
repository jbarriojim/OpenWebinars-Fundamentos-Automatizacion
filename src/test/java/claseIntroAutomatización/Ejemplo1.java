package claseIntroAutomatización;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ejemplo1 {

	@Test
	public void goToSiteCorrect() throws InterruptedException {
		// Creamos la instancia del driver
		FirefoxDriver driver = new FirefoxDriver();
		// Accedemos a la URL que deseemos
		driver.get("https://www.google.com");
		// Incluimos una parada de 10 segundos para ver que el acceso es correcto
		Thread.sleep(10000);
		// Si no hacemos nada mas, nuestra prueba habrá terminado correctamente pero notaremos que el driver continua levantado
		// Por ello tenemos que cerrar el driver al terminar
		driver.quit();
	}
}
