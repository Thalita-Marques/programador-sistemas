package controller;

import model.Aluno;
import model.Professor;

public class Teste {
	
	public static void main(String [] args) {
		
		Aluno aluno1 = new Aluno ("Thalita Marques1","61250187-0", "150180027-58", "21-9456-1992", "tmarques@gmail.com", "10001", "Programador de Sistemas", 0);
		Aluno aluno2 = new Aluno ("Thalita Marques2","61250187-0", "150180027-58", "21-9456-1992", "tmarques@gmail.com", "10001", "Programador de Sistemas", 0);
		Aluno aluno3 = new Aluno ("Thalita Marques3","61250187-0", "150180027-58", "21-9456-1992", "tmarques@gmail.com", "10001", "Programador de Sistemas", 0);
		
		
		System.out.println("Nome:" + aluno1.getNome());
		System.out.println("Nome:" + aluno2.getNome());
		System.out.println("Nome:" + aluno3.getNome());
		System.out.println("São" + aluno1.getNome() + "alunos registrados");
		
		Professor professor = new Professor("Marcelo Roberto Campos", "10054987-07","075598845-75", "21-7793-8574", "mrcampos@senai.rj.gov.br", "901", "TI");
		System.out.println("Nome do professor:" + professor.getNome());
	}
}