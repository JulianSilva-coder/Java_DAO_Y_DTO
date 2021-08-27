package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ventana_Inicio extends JFrame {

	private JMenu menu;
	private JMenuBar barramenu;
	private JMenuItem Archivo;

	private Inicio inicio;
	private Almacen almacen;
	private Registro_panel Tabla1;
	
	public Ventana_Inicio() {
		setSize(500, 600);
		setResizable(false);
		setTitle("Cell Phone Storage");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		iniciar();
		setVisible(true);
	}

	private void iniciar() {
		barramenu = new JMenuBar();
		setJMenuBar(barramenu);

		menu = new JMenu("File");
		barramenu.add(menu);

		Archivo = new JMenuItem("Archivo");
		Archivo.setActionCommand("ARCHIVO");
		menu.add(Archivo);

		inicio = new Inicio();
		getContentPane().add(inicio);
		
		almacen = new Almacen();
		getContentPane().add(almacen);
		
		Tabla1 = new Registro_panel();
		getContentPane().add(Tabla1);
		
	}

	public JMenu getMenu() {
		return menu;
	}

	public void setMenu(JMenu menu) {
		this.menu = menu;
	}

	public JMenuBar getBarramenu() {
		return barramenu;
	}

	public void setBarramenu(JMenuBar barramenu) {
		this.barramenu = barramenu;
	}

	public JMenuItem getArchivo() {
		return Archivo;
	}

	public void setArchivo(JMenuItem archivo) {
		Archivo = archivo;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Registro_panel getTabla1() {
		return Tabla1;
	}

	public void setTabla1(Registro_panel tabla1) {
		Tabla1 = tabla1;
	}
}
