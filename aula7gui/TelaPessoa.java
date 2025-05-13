package aula7gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPessoa implements ActionListener{

	Pessoa pes;
	JFrame tela = new JFrame("Cadastro de Pessoas");
	JPanel painel = new JPanel();
	
	JLabel lbnome = new JLabel("Nome: ");
	JLabel lbidade = new JLabel("Idade: ");
	JLabel lbrenda = new JLabel("Renda: ");
	
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtrenda = new JTextField();
	
	JButton btsalvar = new JButton("Salvar");
	JButton btexibir = new JButton("Exibir");
	
	void criarTela() {
		tela.setSize(350, 350);
		tela.setLocation(300,200); // lateral x altura
		painel.setLayout(null);
		
		lbnome.setBounds(20, 20, 100, 30);
		txtnome.setBounds(150, 20, 150, 30);
		lbidade.setBounds(20, 70, 100, 30);
		txtidade.setBounds(150, 70, 150, 30);
		lbrenda.setBounds(20, 120, 100, 30);
		txtrenda.setBounds(150, 120, 150, 30);
		
		btsalvar.setBounds(30, 200, 100, 30);
		btsalvar.addActionListener(this);// ação do botao
		btexibir.setBounds(180, 200, 100, 30);
		btexibir.addActionListener(this);// ação do botao
		
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbidade);
		painel.add(txtidade);
		painel.add(lbrenda);
		painel.add(txtrenda);
		painel.add(btsalvar);
		painel.add(btexibir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		TelaPessoa tp = new TelaPessoa();
		tp.criarTela();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btsalvar) {
			String n = txtnome.getText();
			Integer i = Integer.parseInt(txtidade.getText());
			Double r = Double.valueOf(txtrenda.getText());
			
			pes = new Pessoa(n, i, r);
			JOptionPane.showMessageDialog(null, "Objeto Salvo com Sucesso !!");
			txtnome.setText("");
			txtidade.setText("");
			txtrenda.setText("");
		}
		
		if(e.getSource()==btexibir) {
			JOptionPane.showMessageDialog(null, ""
					+ "O nome: "+pes.getNome()
					+"\nA idade: "+pes.getIdade()
					+"\nA renda: R$ "+pes.getRenda());
		}
		
		
	}
}
