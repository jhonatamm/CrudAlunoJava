package com.escolav2.admin.aluno.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.escolav2.admin.aluno.mock.MockAluno;
import com.escolav2.admin.aluno.model.AlunoTableModel;
import com.escolav2.admin.aluno.utils.StripedRowTableCellRenderer;
import com.escolav2.admin.aluno.view.AlunoAdminView;
import com.escolav2.domain.Aluno;
import com.escolav2.manager.classes.Escola;

public class AlunoAdminController {
	
	public AlunoAdminController() {
		Escola.getAlunoAdminView().getInternalFrame().setVisible(false);
		Escola.getAlunoAdminView().getEditarAluno().setVisible(false);
		Escola.getAlunoAdminView().getBtnEditar().setEnabled(false);
		Escola.getAlunoAdminView().setVisible(true);
		
		AlunoMaintener.gettableInstance().setAlunos(AlunoMaintener.getalunoServiceInstance().getAlunos());
		Escola.getAlunoAdminView().getAlunosTable().setRowHeight(30);
		Escola.getAlunoAdminView().getAlunosTable().setDefaultRenderer(Object.class, new StripedRowTableCellRenderer());
		Escola.getAlunoAdminView().getAlunosTable().setModel(AlunoMaintener.gettableInstance());
		AlunoMaintener.gettableInstance().update();
		Escola.getAlunoAdminView().getScrollPane().setViewportView(Escola.getAlunoAdminView().getAlunosTable());
		Escola.getAlunoAdminView().getBtnAdicionar().addActionListener(new AddAluno());
		Escola.getAlunoAdminView().getBtnSalvar().addActionListener(new salvarAluno());
		Escola.getAlunoAdminView().getBtnEditar().addActionListener(new EditAluno());
		Escola.getAlunoAdminView().getAlunosTable().getSelectionModel().addListSelectionListener(new EditAlunoListener());
		Escola.getAlunoAdminView().getBtnEditSalvar().addActionListener(new EditAlunoSalvar());
		Escola.getAlunoAdminView().getBtnCancelar().addActionListener(new Cancelar());
		Escola.getAlunoAdminView().getBtnEditCancela().addActionListener(new Cancelar());
	}
	
	

}

class AlunoMaintener{
	private static AlunoTableModel tableAlunosInstance;
	private static MockAluno alunoService;
	public static synchronized AlunoTableModel gettableInstance() {

		if (tableAlunosInstance == null) {
			tableAlunosInstance = new AlunoTableModel();
		}
		return tableAlunosInstance;

	}
	public static synchronized MockAluno getalunoServiceInstance() {

		if (alunoService == null) {
			alunoService = new MockAluno();
		}
		return alunoService;

	}
}

class AddAluno implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		e.getInternalFrame().setVisible(true);
		
	// TODO Auto-generated method stub
		
	}
}
class EditAlunoListener implements ListSelectionListener {

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		e.getBtnEditar().setEnabled(true);
		// TODO Auto-generated method stub
		
	}
	
	
	
}
class EditAluno implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		
		Aluno a = AlunoMaintener.gettableInstance().getUsuario(e.getAlunosTable().getSelectedRow());
		e.getTxtEditName().setText(a.getNome());
		e.getTxtMatricula().setText(a.getMatricula());
		e.getCbxEditsex().setSelectedItem(a.getSexo());
		e.getTxtMatricula().setEnabled(false);
		//e.getTxtEditName()
		e.getEditarAluno().setVisible(true);
		
	// TODO Auto-generated method stub
		
	}
}



class EditAlunoSalvar implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		Aluno a = new Aluno(e.getTxtEditName().getText().toString(),e.getCbxEditsex().getSelectedItem().toString(),e.getTxtMatricula().getText());
		AlunoMaintener.gettableInstance().getUsuario(a.getMatricula()).setNome(e.getTxtEditName().getText().toString());
		AlunoMaintener.gettableInstance().getUsuario(a.getMatricula()).setSexo(e.getCbxEditsex().getSelectedItem().toString());
		AlunoMaintener.gettableInstance().update();
		e.getEditarAluno().setVisible(false);
		
		// TODO Auto-generated method stub
		
	}
	
}


class salvarAluno implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		Aluno a = new Aluno(e.getTextNome().getText(), e.getComboBox().getSelectedItem().toString(), e.getTextMatricula().getText());
		AlunoMaintener.getalunoServiceInstance().addAluno(a);
		AlunoMaintener.gettableInstance().setAlunos(AlunoMaintener.getalunoServiceInstance().getAlunos());
		AlunoMaintener.gettableInstance().update();
		e.getInternalFrame().setVisible(false);
		// TODO Auto-generated method stub
		
	}
	
}
class Cancelar implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent args) {
		AlunoAdminView e = Escola.getAlunoAdminView();
		e.getEditarAluno().setVisible(false);
		e.getInternalFrame().setVisible(false);
		
	}
	
}
