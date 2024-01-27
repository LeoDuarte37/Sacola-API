package com.duarte.sacolaapi.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Embeddable
public class Endereco {
	
	private String cep;
	private String complemento;
	
	/*
	 * Precisaremos de cep e complemento tanto
	 * para Restaurante, quanto para Cliente.
	 * 
	 * Para reuso de código, criamos uma classe
	 * com a anotação Embeddable, indicando que
	 * Endereco não será uma tabela no banco de
	 * dados, e sim colunas que são em comum
	 * entre as tabelas.
	 */
	
	/*
	 * Para indicar o uso dessa classe Embeddable
	 * nas outras classes, passamos em cima do 
	 * atributo (endereco), a anotação @Embedded
	 */
}
