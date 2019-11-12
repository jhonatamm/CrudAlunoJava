package com.escolav2.admin.aluno.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AlunoAdminView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable alunosTable;
	private JButton btnDeletar;
	private JButton btnAtualizar;
	private JButton btnEditar;
	private JButton btnAdicionar;
	private JScrollPane scrollPane;
	private JPanel addPanel;
	private final JLabel lblNewLabel_1 = new JLabel("");
	private JTextField textNome;
	private JTextField textMatricula;
	private JButton btnCancelar;
	private JButton btnSalvar;
	private JComboBox<String> comboBox;
	private JInternalFrame internalFrame;
	private JTextField txtEditName;
	private JTextField txtEditMatricula;
	private JInternalFrame EditarAluno;
	private JButton btnEditSalvar;
	private JButton btnEditCancela;
	private JComboBox<String> cbxName;
	
	/**
	 * Create the frame.
	 */
	public AlunoAdminView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 EditarAluno = new JInternalFrame("Editar Aluno");
		EditarAluno.setBounds(25, 25, 374, 346);
		contentPane.add(EditarAluno);
		EditarAluno.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(0, 0, 415, 317);
		EditarAluno.getContentPane().add(panel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 57, 42);
		panel_2.add(label);
		
		JLabel lblEditarAluno = new JLabel("Editar Aluno");
		lblEditarAluno.setForeground(new Color(119, 136, 153));
		lblEditarAluno.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblEditarAluno.setBounds(77, 22, 190, 31);
		panel_2.add(lblEditarAluno);
		
		JLabel label_2 = new JLabel("Nome");
		label_2.setFont(label_2.getFont().deriveFont(label_2.getFont().getStyle() | Font.BOLD, label_2.getFont().getSize() + 2f));
		label_2.setBounds(10, 81, 46, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Sexo");
		label_3.setFont(label_3.getFont().deriveFont(label_3.getFont().getStyle() | Font.BOLD, label_3.getFont().getSize() + 2f));
		label_3.setBounds(10, 130, 46, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Matricula");
		label_4.setFont(label_4.getFont().deriveFont(label_4.getFont().getStyle() | Font.BOLD, label_4.getFont().getSize() + 2f));
		label_4.setBounds(9, 178, 68, 14);
		panel_2.add(label_4);
		
		txtEditName = new JTextField();
		txtEditName.setColumns(10);
		txtEditName.setBounds(87, 74, 233, 31);
		panel_2.add(txtEditName);
		
		txtEditMatricula = new JTextField();
		txtEditMatricula.setColumns(10);
		txtEditMatricula.setBounds(87, 171, 233, 31);
		panel_2.add(txtEditMatricula);
		
		cbxName = new JComboBox<String>();
		cbxName.setModel(new DefaultComboBoxModel<String>(new String[] {"M", "F"}));
		cbxName.setBounds(87, 122, 76, 32);
		panel_2.add(cbxName);
		
		btnEditCancela = new JButton("Cancelar");
		btnEditCancela.setBounds(111, 240, 98, 42);
		panel_2.add(btnEditCancela);
		
		btnEditSalvar = new JButton("Salvar");
		btnEditSalvar.setBounds(222, 240, 98, 42);
		panel_2.add(btnEditSalvar);
		EditarAluno.setResizable(true);
		EditarAluno.setClosable(true);
		
		internalFrame = new JInternalFrame("AddAluno");
		internalFrame.setBounds(0, 0, 374, 346);
		contentPane.add(internalFrame);
		internalFrame.setFrameIcon(new ImageIcon(AlunoAdminView.class.getResource("/img/icons8_students_40px.png")));
		internalFrame.setClosable(true);
		internalFrame.setResizable(true);
		internalFrame.getContentPane().setLayout(null);
		
		this.addPanel = new JPanel();
		addPanel.setBounds(0, 0, 415, 317);
		internalFrame.getContentPane().add(addPanel);
		addPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		addPanel.setBackground(new Color(224, 255, 255));
		addPanel.setLayout(null);
		lblNewLabel_1.setIcon(new ImageIcon(AlunoAdminView.class.getResource("/img/icons8_add_user_male_30px_1.png")));
		lblNewLabel_1.setBounds(10, 11, 57, 42);
		addPanel.add(lblNewLabel_1);
		
		JLabel lblAdicionarAluno = new JLabel("Adicionar aluno");
		lblAdicionarAluno.setForeground(new Color(119, 136, 153));
		lblAdicionarAluno.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblAdicionarAluno.setBounds(77, 22, 190, 31);
		addPanel.add(lblAdicionarAluno);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(lblNome.getFont().deriveFont(lblNome.getFont().getStyle() | Font.BOLD, lblNome.getFont().getSize() + 2f));
		lblNome.setBounds(10, 81, 46, 14);
		addPanel.add(lblNome);
		
		JLabel lblSexto = new JLabel("Sexo");
		lblSexto.setFont(lblSexto.getFont().deriveFont(lblSexto.getFont().getStyle() | Font.BOLD, lblSexto.getFont().getSize() + 2f));
		lblSexto.setBounds(10, 130, 46, 14);
		addPanel.add(lblSexto);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(lblMatricula.getFont().deriveFont(lblMatricula.getFont().getStyle() | Font.BOLD, lblMatricula.getFont().getSize() + 2f));
		lblMatricula.setBounds(9, 178, 68, 14);
		addPanel.add(lblMatricula);
		
		textNome = new JTextField();
		textNome.setBounds(87, 74, 233, 31);
		addPanel.add(textNome);
		textNome.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		textMatricula.setBounds(87, 171, 233, 31);
		addPanel.add(textMatricula);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"M", "F"}));
		comboBox.setBounds(87, 122, 76, 32);
		addPanel.add(comboBox);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(111, 240, 98, 42);
		addPanel.add(btnCancelar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(222, 240, 98, 42);
		addPanel.add(btnSalvar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(0, 0, 819, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AlunoAdminView.class.getResource("/img/icons8_students_40px.png")));
		lblNewLabel.setBounds(10, 11, 52, 48);
		panel.add(lblNewLabel);
		
		JLabel lblListasDeAlunos = new JLabel("Listas de Alunos");
		lblListasDeAlunos.setForeground(new Color(102, 102, 102));
		lblListasDeAlunos.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblListasDeAlunos.setBounds(306, 21, 204, 38);
		panel.add(lblListasDeAlunos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(0, 401, 819, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		this.btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(710, 31, 89, 39);
		panel_1.add(btnDeletar);
		
		this.btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(599, 31, 89, 39);
		panel_1.add(btnAtualizar);
		
		this.btnEditar = new JButton("Editar");
		btnEditar.setBounds(484, 31, 89, 39);
		panel_1.add(btnEditar);
		
		this.btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(368, 31, 89, 39);
		panel_1.add(btnAdicionar);
		
		this.scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setBounds(0, 79, 819, 325);
		contentPane.add(scrollPane);
		
		alunosTable = new JTable();
		alunosTable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		scrollPane.setColumnHeaderView(alunosTable);
	}


	public JTable getAlunosTable() {
		return alunosTable;
	}


	public void setAlunosTable(JTable alunosTable) {
		this.alunosTable = alunosTable;
	}


	public JButton getBtnDeletar() {
		return btnDeletar;
	}


	public void setBtnDeletar(JButton btnDeletar) {
		this.btnDeletar = btnDeletar;
	}


	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}


	public void setBtnAtualizar(JButton btnAtualizar) {
		this.btnAtualizar = btnAtualizar;
	}


	public JButton getBtnEditar() {
		return btnEditar;
	}


	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}
	


	public JPanel getAddPanel() {
		return addPanel;
	}


	public void setAddPanel(JPanel addPanel) {
		this.addPanel = addPanel;
	}


	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}


	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}


	public JTextField getTextNome() {
		return textNome;
	}


	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}


	public JTextField getTextMatricula() {
		return textMatricula;
	}


	public void setTextMatricula(JTextField textMatricula) {
		this.textMatricula = textMatricula;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}


	public JButton getBtnSalvar() {
		return btnSalvar;
	}


	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}


	public JComboBox<String> getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}


	public JInternalFrame getInternalFrame() {
		return internalFrame;
	}


	public void setInternalFrame(JInternalFrame internalFrame) {
		this.internalFrame = internalFrame;
	}


	public JTextField getTxtEditName() {
		return txtEditName;
	}


	public void setTxtEditName(JTextField txtEditName) {
		this.txtEditName = txtEditName;
	}


	public JTextField getTxtMatricula() {
		return txtEditMatricula;
	}


	public void setTxtMatricula(JTextField txtMatricula) {
		this.txtEditMatricula = txtMatricula;
	}


	public JInternalFrame getEditarAluno() {
		return EditarAluno;
	}


	public void setEditarAluno(JInternalFrame editarAluno) {
		EditarAluno = editarAluno;
	}


	public JButton getBtnEditSalvar() {
		return btnEditSalvar;
	}


	public void setBtnEditSalvar(JButton btnEditSalvar) {
		this.btnEditSalvar = btnEditSalvar;
	}


	public JButton getBtnEditCancela() {
		return btnEditCancela;
	}


	public void setBtnEditCancela(JButton btnEditCancela) {
		this.btnEditCancela = btnEditCancela;
	}


	public JComboBox<String> getCbxEditsex() {
		return cbxName;
	}


	public void setCbxEditSex(JComboBox<String> cbxName) {
		this.cbxName = cbxName;
	}
	
}
