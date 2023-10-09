package projeto.cucumber.config;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.cucumber.drivers.DriversConexao;

public class InicializarTeste extends DriversConexao{
	
static String ambiente = "https://www.correios.com.br/";
	
	public static void configurarAmbiente() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
		
	}
	
	public static void encerrarTeste() {
		driver.quit();
		
	}

}
