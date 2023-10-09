package projeto.cucumber.metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import projeto.cucumber.drivers.DriversConexao;

public class Metodos extends DriversConexao {
	
	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("***************Causa do erro************ " + e.getCause());
			System.out.println("***************Mensagem do erro************ " + e.getMessage());
		}

	}

	public void click(By locator) {
		try {
			driver.findElement(locator).click();

		} catch (Exception e) {
			System.out.println("***************Causa do erro************ " + e.getCause());
			System.out.println("***************Mensagem do erro************ " + e.getMessage());
		}
	}

	public void submit(By locator) {
		driver.findElement(locator).submit();
		try {
			driver.findElement(locator).submit();

		} catch (Exception e) {
			System.out.println("***************Causa do erro************ " + e.getCause());
			System.out.println("***************Mensagem do erro************ " + e.getMessage());
		}

	}

	public void validarTexto(By locator, String textoEsperado) {
		try {

			String textoCapturado = driver.findElement(locator).getText();
			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			System.out.println("***************Causa do erro************ " + e.getCause());
			System.out.println("***************Mensagem do erro************ " + e.getMessage());
		}
	}

	public void mudarDeAba() {
		try {

			String janelaPrincipal = driver.getWindowHandle();
			Set<String> todasJanelas = driver.getWindowHandles();
			for (String janela : todasJanelas) {
				if (!janela.equals(janelaPrincipal)) {
					driver.switchTo().window(janela);
				}
			}

		} catch (Exception e) {
			System.out.println("***************Causa do erro************ " + e.getCause());
			System.out.println("***************Mensagem do erro************ " + e.getMessage());
		}
	}
}
