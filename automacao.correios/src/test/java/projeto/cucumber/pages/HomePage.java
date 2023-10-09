package projeto.cucumber.pages;

import projeto.cucumber.elementos.Elementos;
import projeto.cucumber.metodos.Metodos;

public class HomePage {
	
Metodos metodo = new Metodos();
	
	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscarCep, dado);
		
	}
	
	public void validarDadosRetornado(String logradoura, String bairro, String localidade, String cep) {
		metodo.mudarDeAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradoura);
		metodo.validarTexto(Elementos.Bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.Localidade_UF, localidade);
		metodo.validarTexto(Elementos.cep, cep);
		
	}

}
