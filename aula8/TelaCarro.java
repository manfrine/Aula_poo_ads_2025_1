package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCarro implements ActionListener {

	Carro car = new Carro();
	
	JFrame tela = new JFrame("Cadastro de Carros");
	JPanel painel = new JPanel();
	
	//labels
	JLabel lbmodelo = new JLabel("Modelo:" );
	JLabel lbvalor = new JLabel("Valor:" );
	JLabel lbimposto = new JLabel("Imposto:" );
	
	//campo texto
	JTextField txtmodelo = new JTextField();
	JTextField txtvalor = new JTextField();
	JTextField txtimposto = new JTextField();
	
	//botões
	JButton btSalvar = new JButton("Salvar");
	JButton btExibir = new JButton("Exibir");
	
	void criarTela() {
		tela.setSize(300, 300); // tam da tela altura x largura
		tela.setLocation(500, 200);// posição
		painel.setLayout(null); // layout padrão
		
		lbmodelo.setBounds(10, 10, 100, 30);
		txtmodelo.setBounds(120, 10, 150, 30);
		lbvalor.setBounds(10, 60, 100, 30);
		txtvalor.setBounds(120, 60, 150, 30);
		lbimposto.setBounds(10, 110, 100, 30);
		txtimposto.setBounds(120, 110, 150, 30);
		txtimposto.disable();
		
		btSalvar.setBounds(20, 170, 100, 30);
		btSalvar.addActionListener(this);// ação
		btExibir.setBounds(150, 170, 100, 30);
		btExibir.addActionListener(this);// ação
		
		painel.add(lbmodelo);
		painel.add(txtmodelo);
		painel.add(lbvalor);
		painel.add(txtvalor);
		painel.add(lbimposto);
		painel.add(txtimposto);
		painel.add(btSalvar);
		painel.add(btExibir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true); // exibir a tela
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btSalvar) {
		
			car.setModelo(txtmodelo.getText());
			car.setValor(Double.valueOf(txtvalor.getText()));
			car.calcImposto();
			txtimposto.setText(String.valueOf(car.getImposto()));
			
			JOptionPane.showMessageDialog(null, "Objeto Salvo com Sucesso !!");
		}
		
		if(e.getSource() == btExibir) {
			JOptionPane.showMessageDialog(null, 
					  "O nome: "+car.getModelo()
					+"\nO valor: R$ "+car.getValor()
					+"\nO Imposto: R$ "+car.getImposto());
		}
		
	}
}
