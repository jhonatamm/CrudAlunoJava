package com.escolav2.manager.classes;

import com.escolav2.admin.aluno.view.AlunoAdminView;

public class Escola {
	
	private static AlunoAdminView alunoAdminView;
	public static synchronized AlunoAdminView getAlunoAdminView() {

		if (alunoAdminView == null) {
			alunoAdminView = new AlunoAdminView();
		}
		return alunoAdminView;

	}
	

}
