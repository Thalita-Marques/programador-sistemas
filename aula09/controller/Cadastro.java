package controller;

import model.Pessoa;

public class Cadastro {

   public static void main(String [] args) {
	  Pessoa pessoa = new Pessoa();
	  
	  pessoa.setNome("Thalita Marques");
	  pessoa.setIdade(18);
	  pessoa.setSexo("Femenino");
	  
	  System.out.println("Nome: " + pessoa.getNome());
	  System.out.println("Idade: " + pessoa.getIdade());
	  System.out.println("Sexo: " + pessoa.getSexo());
   }
}
