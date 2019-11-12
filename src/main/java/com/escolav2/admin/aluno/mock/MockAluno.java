package com.escolav2.admin.aluno.mock;

import java.util.ArrayList;
import java.util.List;

import com.escolav2.domain.Aluno;

public class MockAluno {
	

	private List<Aluno> alunos;

	public MockAluno(){
		alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("joao pedro","M","0001"));
		alunos.add(new Aluno("joao carlos","M","0002"));
		alunos.add(new Aluno("Leiticia Maria","F","0003"));
		alunos.add(new Aluno("Cristiana Bastos","F","0004"));
		alunos.add(new Aluno("Leidivania pereira","F","0005"));
		alunos.add(new Aluno("Antonio nunes","M","0006"));
		alunos.add(new Aluno("Edivaldo macedo","M","0007"));
		alunos.add(new Aluno("Mauricio assis","M","0008"));
		alunos.add(new Aluno("Carlos evandro","M","0009"));
		alunos.add(new Aluno("Diana dallas","F","0010"));
		alunos.add(new Aluno("Monique Martins","F","0011"));
		alunos.add(new Aluno("Geanny silva","F","0012"));
	};

	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public void addAluno(Aluno al) {
		this.alunos.add(al);
	}
	public void removeAluno(Aluno al) {
		this.alunos.remove(al);
	}
	
	
	
}
