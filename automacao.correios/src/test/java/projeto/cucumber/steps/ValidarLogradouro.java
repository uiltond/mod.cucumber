package projeto.cucumber.steps;

import org.junit.Before;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.config.InicializarTeste;
import projeto.cucumber.pages.HomePage;

public class ValidarLogradouro {
	
	HomePage home = new HomePage();
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}
	


	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarCepEndereco("06460-030");
	  
	}
	@Then("validar os dados retornados")
	public void validarOsDadosRetornados() {
		home.validarDadosRetornado("Avenida Piracema", "Tamboré", "Barueri/SP", "06460-030");
		
	}




}
