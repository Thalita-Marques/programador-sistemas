package controller;

import model.Pessoa;

public class Cadastro {

   public static void main(String [] args) {
	  Pessoa pessoa = new Pessoa();
	  
	  pessoa.setNome("Thalita Marques");
	  pessoa.setIdade(18);
	  pessoa.setSexo("Feminino");
	  
	  System.out.println("Nome: " + pessoa.getNome());
	  System.out.println("Idade: " + pessoa.getIdade());
	  System.out.println("Sexo: " + pessoa.getSexo());
	  
      Pessoa people1 = new Pessoa();
	  
      people1.setNome("Mateus Marques");
      people1.setIdade(14);
      people1.setSexo("Masculino");
	  
	  System.out.println("Nome: " + people1.getNome());
	  System.out.println("Idade: " + people1.getIdade());
	  System.out.println("Sexo: " + people1.getSexo());
   }
}
