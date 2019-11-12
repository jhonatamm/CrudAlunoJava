package com.escolav2.admin.aluno.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.escolav2.domain.Aluno;

public class AlunoTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4842876701598074262L;
	
	private List<Aluno> alunos;
	private String[] colunas = {"Nome","Sexo","Matricula"};

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.alunos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno usuarioSelecionado = alunos.get(rowIndex);
        
        String valueObject = null;
        switch(columnIndex){
            case 0: valueObject = usuarioSelecionado.getNome(); break;
            case 1: valueObject = usuarioSelecionado.getSexo(); break;
            case 2: valueObject = usuarioSelecionado.getMatricula(); break;
            default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
        }
         
        return valueObject;
	}
	
    @Override
    public String getColumnName(int columnIndex){
      return colunas[columnIndex];
    } 
    @Override  
    public Class<?> getColumnClass(int columnIndex) {  
       return String.class;  
    }
	
    @Override  
    public boolean isCellEditable(int rowIndex, int columnIndex) {  
        return false;  
    }
    
    public void update() {
    	fireTableDataChanged();
    }
    
    public Aluno getUsuario(int indiceLinha) {  
        return alunos.get(indiceLinha);  
    }  

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Aluno getUsuario(String matricula) {
		Aluno retorn = null;
		if(this.alunos != null ) {
			for(Aluno a : this.alunos) {
				if(a.getMatricula().equals(matricula)) {
					retorn = a;
				}
			}
		}
		return retorn;
	
	}
	

}
