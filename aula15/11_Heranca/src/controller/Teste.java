package controller;

import model.Aluno;
import model.Professor;

public class Teste {
	
	public static void main(String [] args) {
		
		Aluno aluno = new Aluno ("Thalita Marques","61250187-0", "150180027-58",
				"21-9456-1992", "tmarques@gmail.com", "10001", "Programador de Sistemas");
		
		Professor professor = new Professor("Marcelo Roberto Campos", "10054987-07",
				"075598845-75", "21-7793-8574", "mrcampos@senai.rj.gov.br", "901", "TI");
	}
}
