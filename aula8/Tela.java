package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener{
	
	Pessoa pes;
	PessoaDao pd = new PessoaDao();

	JFrame tela = new JFrame("Cadastro de Pessoas");
	JPanel painel = new JPanel();
	
	JLabel lbcod = new JLabel("Código: ");
	JLabel lbnome = new JLabel("Nome: ");
	JLabel lbidade = new JLabel("Idade: ");
	JLabel lbrenda = new JLabel("Renda: ");
	
	JTextField txtcod = new JTextField();
	JTextField txtnome = new JTextField();
	JTextField txtidade= new JTextField();
	JTextField txtrenda = new JTextField();
	
	JButton btsalvar = new JButton("Salvar");
	JButton btlistar = new JButton("Listar");
	JButton btalterar = new JButton("Alterar");
	JButton btexcluir = new JButton("Excluir");
	JButton btpesq = new JButton("Pesquisar");
	
	void criarTela() {
		
		tela.setSize(500, 400);
		tela.setLocation(550, 250);
		painel.setLayout(null);
		
		lbcod.setBounds(30, 20, 100, 30);
		txtcod.setBounds(120, 20, 180, 30);
		txtcod.disable();
		btpesq.setBounds(370, 20, 100, 30);
		btpesq.addActionListener(this); //acao
		btpesq.disable();
		lbnome.setBounds(30, 80, 100, 30);
		txtnome.setBounds(120, 80, 180, 30);
		lbidade.setBounds(30, 140, 100, 30);
		txtidade.setBounds(120, 140, 180, 30);
		lbrenda.setBounds(30, 200, 100, 30);
		txtrenda.setBounds(120, 200, 180, 30);
		btsalvar.setBounds(20, 280, 90, 30);
		btsalvar.addActionListener(this); //acao
		btlistar.setBounds(130, 280, 90, 30);
		btlistar.addActionListener(this); //acao
		btalterar.setBounds(240, 280, 90, 30);
		btalterar.addActionListener(this); //acao
		btexcluir.setBounds(360, 280, 90, 30);
		btexcluir.addActionListener(this); //acao
		
		painel.add(lbcod);
		painel.add(txtcod);
		painel.add(btpesq);
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbidade);
		painel.add(txtidade);
		painel.add(lbrenda);
		painel.add(txtrenda);
		painel.add(btsalvar);
		painel.add(btlistar);
		painel.add(btalterar);
		painel.add(btexcluir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Tela t = new Tela();
		t.criarTela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btsalvar) {
			String n = txtnome.getText();
			Integer i = Integer.parseInt(txtidade.getText());
			Double r =  Double.valueOf(txtrenda.getText());
			pes = new Pessoa(n, i, r);
			pd.salvar(pes);
			JOptionPane.showMessageDialog(null, "Objeto Salvo com Sucesso!!");
			
			txtnome.setText("");
			txtidade.setText("");
			txtrenda.setText("");
			
			txtcod.enable();//desabilitar
			btpesq.enable();
		}
		
		if(e.getSource()==btlistar) {
			pd.listar();
		}
		
		if(e.getSource() == btpesq) {
			int cod = Integer.valueOf(txtcod.getText());
			
			pes = pd.pesquisar(cod);
			
			txtnome.setText(pes.getNome());
			txtidade.setText(String.valueOf(pes.getIdade()));
			txtrenda.setText( String.valueOf(pes.getRenda()));
		}
		if(e.getSource() == btalterar) {
			int cod = Integer.valueOf(txtcod.getText());
			
			String n = txtnome.getText();
			Integer i = Integer.parseInt(txtidade.getText());
			Double r =  Double.valueOf(txtrenda.getText());
			pes = new Pessoa(n, i, r);
			
			pd.alterar(cod, pes);
			
			JOptionPane.showMessageDialog(null, "Objeto Alterado !!");
			txtnome.setText("");
			txtidade.setText("");
			txtrenda.setText("");
		}
		
		if(e.getSource() == btexcluir) {
			int cod = Integer.valueOf(txtcod.getText());
			
			pd.excluir(cod);
			
			JOptionPane.showMessageDialog(null, "Objeto Deletado !!");
			txtnome.setText("");
			txtidade.setText("");
			txtrenda.setText("");
		}
		
	}

}
