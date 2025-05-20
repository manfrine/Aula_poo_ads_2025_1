package aula8;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;



public class Principal extends JFrame implements ActionListener{

	Tela tp = new Tela();
	TelaCarro tc = new TelaCarro();
	JMenuBar M1;
	JTextField T1;
	JMenu menuCadastroPessoa, menuBuscar, menuVenda;
	JMenuItem miCadastro, miListar, misair,  miCadastrocarro;
//	Lista tela = new Lista();
	//ListaLigada lista = new ListaLigada();
	int x=0;
	public static void main(String args[]) {

		JFrame janela = new Principal();
		//janela.show();
		janela.setTitle("SISTEMA DE FAMETRO");
		janela.setBounds(100,100,800,600);
		double alt = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		double larg = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int altura = (int) alt;
		int largura = (int) larg;

		ImageIcon imagem = new ImageIcon("\\Users\\usuario\\Documents\\CodigoFonte\\QuintoNoite\\src\\imagem\\foto.jpg");

		Image redimensionadora = imagem.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
		imagem = new ImageIcon(redimensionadora);
		JLabel lab = new JLabel();
		lab.setIcon(imagem);
		lab.setBounds(0,0,largura,altura);
		janela.add(lab);
		janela.setExtendedState(JFrame.MAXIMIZED_VERT);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);

		/*WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };*/
		//Janela.addWindowListener(x);
	}

	Principal() {
		//JFrame tela = new JFrame("BEM VINDO AO GAVI�O");
		
		T1 = new JTextField();
		M1 = new JMenuBar(); // cria a barra de menusd

		menuCadastroPessoa = new JMenu("Opções"); // cria um novo menu
		menuBuscar = new JMenu("Buscar");
		
		miCadastro = new JMenuItem("Cadastro de Pessoa");// cria um item
		miCadastrocarro = new JMenuItem("Cadastro de Carro");// cria um item
		miListar = new JMenuItem("Listando informações");
		miCadastro.addActionListener(this);
		miCadastrocarro.addActionListener(this);
		
		miListar.addActionListener(this);
		
		misair = new JMenuItem("Sair do sistema");
		misair.addActionListener(this);

		menuBuscar.add(miListar);
		menuBuscar.addActionListener(this);

		menuCadastroPessoa.add(miCadastro);// adiciona o item ao menu
		menuCadastroPessoa.add(miCadastrocarro);// adiciona o item ao menu
		//eo q to fazendo!!
		menuCadastroPessoa.add(misair);

		
		M1.add(menuCadastroPessoa);// adiciona o menu na barra de menus
		
		M1.add(menuBuscar);
		
		setJMenuBar(M1);// define a barra de menus como padrao
		getContentPane().add(T1);
	}

	public void actionPerformed(ActionEvent e) {
		//menu cadastro
		if (e.getSource() == miCadastro){
			tp.criarTela();	
		}
		if (e.getSource() == miCadastrocarro){
			tc.criarTela();	
		}
		
		if (e.getSource() == miListar){
			//tela.listar();
		}
			
		if (e.getSource() == misair){
			System.exit(0);
		}

    }

}
