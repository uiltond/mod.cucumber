 
 
  @regressivos
Feature: Busca de cep
	Como usuario do site dos correios
	Quero buscar dados de enderecos
	Para validar resultado da pesquisa
	
	@positivo 
	Scenario: Realizar a busca do cep
	When enviar os dados para busca
	Then validar os dados retornados
