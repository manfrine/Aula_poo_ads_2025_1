package aula7gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCarro implements ActionListener{

	Carro car;
	JFrame tela = new JFrame("Cadastro de Carro");
	JPanel painel = new JPanel();
	
	JLabel lbnome = new JLabel("Modelo:");
	JLabel lbmarca= new JLabel("Marca:");
	JLabel lbvalor = new JLabel("Valor:");
	JLabel lbimp = new JLabel("Imposto:");
	
	JTextField txtnome = new JTextField();
	JTextField txtmarca = new JTextField();
	JTextField txtvalor = new JTextField();
	JTextField txtimp = new JTextField();
	
	JButton btsalvar = new JButton("Salvar");
	JButton btexibir = new JButton("Exibir");
	
	void criarTela() {
		
		tela.setSize(350, 350);
		tela.setLocation(250,250);
		painel.setLayout(null);
		
		lbnome.setBounds(20, 20, 100, 30);
		txtnome.setBounds(120, 20, 150, 30);
		lbmarca.setBounds(20, 70, 100, 30);
		txtmarca.setBounds(120, 70, 150, 30);
		lbvalor.setBounds(20, 120, 100, 30);
		txtvalor.setBounds(120, 120, 150, 30);
		lbimp.setBounds(20, 170, 100, 30);
		txtimp.setBounds(120, 170, 150, 30);
		txtimp.disable();// desabilita o campo
		
		btsalvar.setBounds(40, 240, 100, 30);
		btsalvar.addActionListener(this);
		btexibir.setBounds(200, 240, 100, 30);
		btexibir.addActionListener(this);
		
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbmarca);
		painel.add(txtmarca);
		painel.add(lbvalor);
		painel.add(txtvalor);
		painel.add(lbimp);
		painel.add(txtimp);
		painel.add(btsalvar);
		painel.add(btexibir);
		tela.getContentPane().add(painel);
		tela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCarro tc = new TelaCarro();
		tc.criarTela();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btsalvar) {
			String n = txtnome.getText();
			String m = txtmarca.getText();
			Double v = Double.valueOf( txtvalor.getText());
			
			car = new Carro(n, m, v);
			car.calcImposto();
			txtimp.setText(String.valueOf(car.getImposto()));
			
			JOptionPane.showMessageDialog(null, "Objeto salvo com sucesso!");
			txtnome.setText("");
			txtmarca.setText("");
			txtvalor.setText("");
			txtimp.setText("");
		}
		
		if(e.getSource()==btexibir) {
			JOptionPane.showMessageDialog(null, ""
					+ "O modelo: "+car.getModelo()
					+"\nA marca: "+car.getMarca()
					+"\nO valor: R$ "+car.getValor()
					+"\nO imposto: R$ "+car.getImposto());
		}
		
	}

}
