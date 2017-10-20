package cajero;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Componentes extends JFrame{
	public JPanel panelArriba, panelAbajo, panelCentro, panelIzquierda,panelDerecha,panelCentro2,panelCentro3,panelCentroret,panelClave,panelClave2,panelClave3,panelClave5;
	public Usuario usuario1;
	public String nomi,apeli,nomi2,itemSeleecionado;
	public transferencia transferencias;
	public Pagos pagos1;
	public Retiro retiro2;
	public int clav,sald,celi,ncuenta,val;
	public HashMap<Integer, Usuario> mapa = new HashMap<Integer, Usuario>();
	
	public Componentes(String titulo){
		 super(titulo);
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
	}
	
	public Componentes iniciar(){
		
		Dimension dims = new Dimension(600, 500);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		return this;
	}
	
	public void componente() {
		Container conten= this.getContentPane();
		panelArriba = new logo();
        conten.add(panelArriba,BorderLayout.NORTH);
        panelCentro = new JPanel( );
        conten.add( panelCentro, BorderLayout.CENTER );
        panelIzquierda = new JPanel();
        conten.add(panelIzquierda,BorderLayout.WEST);
        panelDerecha = new JPanel( );
        conten.add( panelDerecha, BorderLayout.EAST );
        panelAbajo=new JPanel();
        conten.add( panelAbajo, BorderLayout.SOUTH );
        
        panelIzquierda.setLayout(new GridBagLayout( ));
		GridBagConstraints constraint = new GridBagConstraints( );
		constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.NONE;
        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        JButton boton1=new JButton("OK");
        panelIzquierda.add(boton1,constraint);
        
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        JButton boton2=new JButton("OK");
        panelIzquierda.add(boton2,constraint);
        
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        JButton boton3=new JButton("OK");
        panelIzquierda.add(boton3,constraint);
        
        panelDerecha.setLayout(new GridBagLayout( ));
		GridBagConstraints constraint1 = new GridBagConstraints( );
		constraint1.gridx = 0;
        constraint1.gridy = 0;
        constraint1.fill = GridBagConstraints.NONE;
        Insets insets1 = new Insets( 5, 10, 5, 10 );
        constraint1.insets = insets1;
        JButton boton4=new JButton("OK");
        panelDerecha.add(boton4,constraint1);
        
        constraint1.gridx = 0;
        constraint1.gridy = 1;
        constraint1.fill = GridBagConstraints.NONE;
        insets1 = new Insets( 5, 10, 5, 10 );
        constraint1.insets = insets1;
        JButton boton5=new JButton("OK");
        panelDerecha.add(boton5,constraint1);
        
        panelCentro.setLayout(new GridBagLayout( ));
		GridBagConstraints constraint2 = new GridBagConstraints( );
		constraint2.gridx = 0;
        constraint2.gridy = 0;
        constraint2.fill = GridBagConstraints.NONE;
        Insets insets2 = new Insets( 5, 10, 5, 10 );
        constraint2.insets = insets2;
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "imagen/Escudo_Universidad_de_Cundinamarca.svg.png" );
        imagen.setIcon( icono );
        panelCentro.add(imagen,constraint2);
        
        constraint2.gridx = 1;
        constraint2.gridy = 0;
        constraint2.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint2.insets = insets2;
        JLabel bienvenida = new JLabel("Bienvenido a Cajero Udec");
        panelCentro.add(bienvenida,constraint2);
        
        constraint2.gridx = 1;
        constraint2.gridy = 1;
        constraint2.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint2.insets = insets2;
        JLabel comentario = new JLabel("Inserte su tarjeta para iniciar");
        panelCentro.add(comentario,constraint2);
        
        panelAbajo.setLayout(new GridBagLayout( ));
		GridBagConstraints constraint3 = new GridBagConstraints( );
		constraint3.gridx = 0;
        constraint3.gridy = 0;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla1 = new JButton("1");
        panelAbajo.add(tecla1,constraint3);
        
        constraint3.gridx = 1;
        constraint3.gridy = 0;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla2 = new JButton("2");
        panelAbajo.add(tecla2,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 0;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla3 = new JButton("3");
        panelAbajo.add(tecla3,constraint3);
        
        constraint3.gridx = 3;
        constraint3.gridy = 0;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton cancelar = new JButton("Cancelar");
        panelAbajo.add(cancelar,constraint3);
        
        constraint3.gridx = 0;
        constraint3.gridy = 1;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla4 = new JButton("4");
        panelAbajo.add(tecla4,constraint3);
        
        constraint3.gridx = 1;
        constraint3.gridy = 1;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla5 = new JButton("5");
        panelAbajo.add(tecla5,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 1;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla6 = new JButton("6");
        panelAbajo.add(tecla6,constraint3);
        
        constraint3.gridx = 3;
        constraint3.gridy = 1;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton limpiar = new JButton("Limpiar");
        panelAbajo.add(limpiar,constraint3);
        
        constraint3.gridx = 0;
        constraint3.gridy = 2;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla7 = new JButton("7");
        panelAbajo.add(tecla7,constraint3);
        
        constraint3.gridx = 1;
        constraint3.gridy = 2;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla8 = new JButton("8");
        panelAbajo.add(tecla8,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 2;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla9 = new JButton("9");
        panelAbajo.add(tecla9,constraint3);
        
        constraint3.gridx = 3;
        constraint3.gridy = 2;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton salir = new JButton("Salir");
        panelAbajo.add(salir,constraint3);
        
        constraint3.gridx = 0;
        constraint3.gridy = 3;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla10 = new JButton("*");
        panelAbajo.add(tecla10,constraint3);
        
        constraint3.gridx = 1;
        constraint3.gridy = 3;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla0 = new JButton("0");
        panelAbajo.add(tecla0,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 3;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tecla11 = new JButton("#");
        panelAbajo.add(tecla11,constraint3);
        
        constraint3.gridx = 0;
        constraint3.gridy = 4;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JLabel retiro = new JLabel("Retiro su dinero");
        panelAbajo.add(retiro,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 4;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JLabel tarjeta = new JLabel("Inserte tarjeta");
        panelAbajo.add(tarjeta,constraint3);
        
        constraint3.gridx = 0;
        constraint3.gridy = 5;
        constraint3.fill = GridBagConstraints.BOTH;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JLabel retiro1 = new JLabel("");
        panelAbajo.add(retiro1,constraint3);
        
        constraint3.gridx = 2;
        constraint3.gridy = 5;
        constraint3.fill = GridBagConstraints.NONE;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JLabel tarjeta1 = new JLabel("");
        panelAbajo.add(tarjeta1,constraint3);
        
        constraint3.gridx = 3;
        constraint3.gridy = 5;
        constraint3.fill = GridBagConstraints.BOTH;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton tarjetaok = new JButton("OK");
        panelAbajo.add(tarjetaok,constraint3);
        
        constraint3.gridx = 3;
        constraint3.gridy = 6;
        constraint3.fill = GridBagConstraints.BOTH;
        insets2 = new Insets( 5, 10, 5, 10 );
        constraint3.insets = insets2;
        JButton usuario = new JButton("Agregar Usuario");
        panelAbajo.add(usuario,constraint3);
        
        limpiar.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText("");
				retiro1.setText("");
			}
        });
        
        usuario.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panelCentro.setVisible(false);
				panelCentro3 = new JPanel( );
				conten.add( panelCentro3, BorderLayout.CENTER );
				
				panelCentro3.setLayout(new GridBagLayout( ));
				GridBagConstraints constraint4 = new GridBagConstraints( );
				
				constraint4.gridx = 1;
		        constraint4.gridy = 0;
		        constraint4.fill = GridBagConstraints.NONE;
		        Insets insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel registro = new JLabel("Registro");
		        panelCentro3.add(registro,constraint4);
		        
				constraint4.gridx = 0;
		        constraint4.gridy = 2;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel cedula = new JLabel("Cedula");
		        panelCentro3.add(cedula,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 2;
		        constraint4.fill = GridBagConstraints.BOTH;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JTextField cedula2 = new JTextField("");
		        panelCentro3.add(cedula2,constraint4);
		        
		        constraint4.gridx = 0;
		        constraint4.gridy = 3;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel nombre = new JLabel("Nombre");
		        panelCentro3.add(nombre,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 3;
		        constraint4.fill = GridBagConstraints.BOTH;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JTextField nombre2 = new JTextField("");
		        panelCentro3.add(nombre2,constraint4);
		        
		        constraint4.gridx = 0;
		        constraint4.gridy = 4;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel apellido = new JLabel("Apellido");
		        panelCentro3.add(apellido,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 4;
		        constraint4.fill = GridBagConstraints.BOTH;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JTextField apellido2 = new JTextField("");
		        panelCentro3.add(apellido2,constraint4);
		        
		        constraint4.gridx = 0;
		        constraint4.gridy = 5;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel saldo = new JLabel("Saldo");
		        panelCentro3.add(saldo,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 5;
		        constraint4.fill = GridBagConstraints.BOTH;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JTextField saldo2 = new JTextField("");
		        panelCentro3.add(saldo2,constraint4);
		        
		        constraint4.gridx = 0;
		        constraint4.gridy = 6;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JLabel clave = new JLabel("Clave");
		        panelCentro3.add(clave,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 6;
		        constraint4.fill = GridBagConstraints.BOTH;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JTextField clave2 = new JTextField("");
		        panelCentro3.add(clave2,constraint4);
		        
		        constraint4.gridx = 1;
		        constraint4.gridy = 7;
		        constraint4.fill = GridBagConstraints.NONE;
		        insets4 = new Insets( 5, 10, 5, 10 );
		        constraint4.insets = insets4;
		        JButton agregar = new JButton("Agregar");
		        panelCentro3.add(agregar,constraint4);
		        
		        agregar.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						try{
							celi=Integer.parseInt(cedula2.getText());
							nomi=((String)nombre2.getText());
							apeli=((String)apellido2.getText());
							clav=Integer.parseInt(clave2.getText());
							sald=Integer.parseInt(saldo2.getText());
						}catch(Exception as) {
							JOptionPane.showMessageDialog(null, "Error al agregar usuario, verifique sus datos");
						}finally {
							if(mapa.containsKey(celi)==false){
								JOptionPane.showMessageDialog(null, "Usuario registrado");
								cedula2.setText(" ");
								nombre2.setText(" ");
								apellido2.setText(" ");
								clave2.setText(" ");
								saldo2.setText(" ");
								usuario1=new Usuario(nomi,apeli,sald,clav);
								mapa.put(celi,usuario1);
								panelCentro3.setVisible(false);
								panelCentro.setVisible(true);
							}else {
								cedula2.setText(" ");
								nombre2.setText(" ");
								apellido2.setText(" ");
								clave2.setText(" ");
								saldo2.setText(" ");
								JOptionPane.showMessageDialog(null, "Usuario ya existente, error");
							}

						}
					}
		        });
		        
		        cancelar.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Accion Cancelada");
						panelCentro3.repaint();
						panelCentro3.setVisible(false);
						panelCentro.setVisible(true);
					}
		        });
		        
		        limpiar.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						cedula2.setText("");
						nombre2.setText("");
						apellido2.setText("");
						clave2.setText("");
						saldo2.setText("");
					}
		        });
		        
		        salir.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						panelCentro3.repaint();
						panelCentro3.setVisible(false);
						panelCentro.setVisible(true);
					}
		        });
			}
        });
        
        tecla1.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"1");
			}
        });
        
        tecla2.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"2");
			}
        });
        
        tecla3.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"3");
			}
        });
        
        tecla4.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"4");
			}
        });
        
        tecla5.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"5");
			}
        });
        
        tecla6.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"6");
			}
        });
        
        tecla7.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"7");
			}
        });
        
        tecla8.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"8");
			}
        });
        
        tecla9.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"9");
			}
        });
        
        tecla0.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"0");
			}
        });
        
        tecla10.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"*");
			}
        });
        
        tecla11.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tarjeta1.setText((String)tarjeta1.getText()+"#");
			}
        });
        
        tarjetaok.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				try{
					celi=Integer.parseInt(tarjeta1.getText());
				}catch(Exception asd) {
					JOptionPane.showMessageDialog(null, "Busqueda erronea, verifique datos");
				}finally {
					if(mapa.containsKey(celi)==true) {
						panelCentro.setVisible(false);
						tarjeta1.setText("");
						
						panelCentro2 = new JPanel( );
				        conten.add( panelCentro2, BorderLayout.CENTER );
						panelCentro2.setLayout(new GridBagLayout( ));
						GridBagConstraints constraint4 = new GridBagConstraints( );
						constraint4.gridx = 1;
				        constraint4.gridy = 0;
				        constraint4.fill = GridBagConstraints.NONE;
				        Insets insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel menu = new JLabel("Menú");
				        panelCentro2.add(menu,constraint4);
						
				        constraint4.gridx = 0;
				        constraint4.gridy = 2;
				        constraint4.fill = GridBagConstraints.NONE;
				        insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel retiro = new JLabel("Retiro en efectivo");
				        panelCentro2.add(retiro,constraint4);
				        
				        constraint4.gridx = 2;
				        constraint4.gridy = 2;
				        constraint4.fill = GridBagConstraints.NONE;
				        insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel pagos = new JLabel("Pagos");
				        panelCentro2.add(pagos,constraint4);
				        
				        constraint4.gridx = 0;
				        constraint4.gridy = 6;
				        constraint4.fill = GridBagConstraints.NONE;
				        insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel consulta = new JLabel("Consulta saldo");
				        panelCentro2.add(consulta,constraint4);
				        
				        constraint4.gridx = 2;
				        constraint4.gridy = 6;
				        constraint4.fill = GridBagConstraints.NONE;
				        insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel cambioclave = new JLabel("Cambio de clave");
				        panelCentro2.add(cambioclave,constraint4);
				        
				        constraint4.gridx = 0;
				        constraint4.gridy = 8;
				        constraint4.fill = GridBagConstraints.NONE;
				        insets4 = new Insets( 5, 10, 5, 10 );
				        constraint4.insets = insets4;
				        JLabel transferencia = new JLabel("Transferencias");
				        panelCentro2.add(transferencia,constraint4);
				        
				        cancelar.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelCentro.setVisible(true);
								tarjeta1.setText("");
								retiro1.setText("");
								panelCentro2.repaint();
							}
				        });
				        
				        limpiar.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								tarjeta1.setText("");
								retiro1.setText("");
							}
				        });
				        
				        salir.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelCentro.setVisible(true);
								tarjeta1.setText("");
								retiro1.setText("");
							}
				        });
				        
				        boton1.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelCentroret = new JPanel( );
						        conten.add( panelCentroret, BorderLayout.CENTER );
								panelCentroret.setLayout(new GridBagLayout( ));
								GridBagConstraints constraint4 = new GridBagConstraints( );
								constraint4.gridx = 0;
						        constraint4.gridy = 0;
						        constraint4.fill = GridBagConstraints.NONE;
						        Insets insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor1=new JLabel("20.000");
								panelCentroret.add(valor1,constraint4);
								constraint4.gridx = 2;
						        constraint4.gridy = 0;
						        constraint4.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor2=new JLabel("50.000");
								panelCentroret.add(valor2,constraint4);
								constraint4.gridx = 0;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor3=new JLabel("100.000");
								panelCentroret.add(valor3,constraint4);
								constraint4.gridx = 2;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor4=new JLabel("200.000");
								panelCentroret.add(valor4,constraint4);
								constraint4.gridx = 0;
						        constraint4.gridy = 4;
						        constraint4.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor5 =new JLabel("400.000");
								panelCentroret.add(valor5,constraint4);
								constraint4.gridx = 2;
						        constraint4.gridy = 4;
						        constraint4.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel valor6=new JLabel("600.000");
								panelCentroret.add(valor6,constraint4);
								constraint1.gridx = 0;
						        constraint1.gridy = 2;
						        constraint1.fill = GridBagConstraints.NONE;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint1.insets = insets4;
								JButton boton6= new JButton("OK");
								panelDerecha.add(boton6,constraint1);
								cancelar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelCentro2.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								salir.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelCentro.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								limpiar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										
										tarjeta1.setText("");
										retiro1.setText("");
									}
						        });
								boton1.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),20000);
													tarjeta1.setText(" ");
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
										
										
									}
								});
								boton2.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),100000);
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
										
										
									}
								});
								boton3.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),400000);
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
										
										
									}
								});
								boton4.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),50000);
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
										
										
									}
								});
								boton5.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),200000);
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
										
										
									}
								});
								boton6.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelCentroret.setVisible(false);
										panelClave = new JPanel( );
								        conten.add( panelClave, BorderLayout.CENTER );
										panelClave.setLayout(new GridBagLayout( ));
										GridBagConstraints constraint4 = new GridBagConstraints( );
										constraint4.gridx = 0;
								        constraint4.gridy = 2;
								        constraint4.fill = GridBagConstraints.NONE;
								        Insets insets4 = new Insets( 5, 10, 5, 10 );
								        constraint4.insets = insets4;
										JLabel clave= new JLabel("Ingrese su clave");
										panelClave.add(clave,constraint4);
										tarjeta.setText("Ingrese Clave");
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentroret.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentroret.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
												int clav2=Integer.parseInt(tarjeta1.getText());
												if(clav2==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													retiro2 = new Retiro(mapa.get(celi).getSaldo(),600000);
													if(retiro2.getRetiro()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=retiro2.getRetiro();
														usuario1.setSaldo(sald);
														clave.setText("Saldo Nuevo: "+sald);
													}else {
														retiro1.setText("saldo insuficiente");
													}
													
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
											}
										});
									}
								});
							}
				        });
				        boton2.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelClave5 = new JPanel( );
						        conten.add( panelClave5, BorderLayout.CENTER );
								panelClave5.setLayout(new GridBagLayout( ));
								GridBagConstraints constraint4 = new GridBagConstraints( );
								constraint4.gridx = 0;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.NONE;
						        Insets insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel clave= new JLabel("Ingrese su clave");
								panelClave5.add(clave,constraint4);
								tarjeta1.setText("");
								tarjeta.setText("Ingrese Clave");
								cancelar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave5.setVisible(false);
										panelCentro2.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								salir.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave5.setVisible(false);
										panelCentro.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								limpiar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										
										tarjeta1.setText("");
										retiro1.setText("");
									}
						        });
								tarjetaok.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave5.setVisible(false);
												panelCentro2.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave5.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										sald=mapa.get(celi).getSaldo();
										clave.setText("Saldo : "+sald);
										retiro1.setText("Consulta exitosa");
									}
								});
							}
				        });
				        boton3.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelClave2 = new JPanel( );
						        conten.add( panelClave2, BorderLayout.CENTER );
								panelClave2.setLayout(new GridBagLayout( ));
								GridBagConstraints constraint5 = new GridBagConstraints( );
								constraint5.gridx = 0;
						        constraint5.gridy = 1;
						        constraint5.fill = GridBagConstraints.BOTH;
						        Insets insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JLabel nombre1= new JLabel("Nombre");
								panelClave2.add(nombre1,constraint5);
								constraint5.gridx = 1;
						        constraint5.gridy = 1;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JTextField nombre5 = new JTextField("");
								panelClave2.add(nombre5,constraint5);
								constraint5.gridx = 0;
						        constraint5.gridy = 2;
						        constraint5.fill = GridBagConstraints.NONE;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JLabel numcuenta= new JLabel("No. Cuenta");
								panelClave2.add(numcuenta,constraint5);
								constraint5.gridx = 1;
						        constraint5.gridy = 2;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JTextField numcuenta2 = new JTextField("");
								panelClave2.add(numcuenta2,constraint5);
								constraint5.gridx = 0;
						        constraint5.gridy = 3;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JLabel valor= new JLabel("Valor");
								panelClave2.add(valor,constraint5);
								constraint5.gridx = 1;
						        constraint5.gridy = 3;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JTextField valor2 = new JTextField("");
								panelClave2.add(valor2,constraint5);
								constraint5.gridx = 0;
						        constraint5.gridy = 4;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JButton aceptar= new JButton("Aceptar");
								panelClave2.add(aceptar,constraint5);
								constraint5.gridx = 0;
						        constraint5.gridy = 5;
						        constraint5.fill = GridBagConstraints.BOTH;
						        insets5 = new Insets( 5, 10, 5, 10 );
						        constraint5.insets = insets5;
						        JLabel clave= new JLabel("");
								panelClave2.add(clave,constraint5);
								cancelar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave2.setVisible(false);
										panelCentro2.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								salir.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave2.setVisible(false);
										panelCentro.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								limpiar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										nombre5.setText("");
										numcuenta2.setText("");
										valor2.setText("");
										tarjeta1.setText("");
										retiro1.setText("");
									}
						        });
								aceptar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave2.setVisible(false);
												panelCentro2.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave2.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												nombre5.setText("");
												numcuenta2.setText("");
												valor2.setText("");
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										clave.setText("Digite su clave");
										tarjeta.setText("Ingrese Clave");
										tarjetaok.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												
												nomi2=((String)nombre5.getText());
												ncuenta=Integer.parseInt(numcuenta2.getText());
												val=Integer.parseInt(valor2.getText());
												int clav3=Integer.parseInt(tarjeta1.getText());
												if(clav3==mapa.get(celi).getClave()) {
													tarjeta1.setText(" ");
													sald=mapa.get(celi).getSaldo();
													transferencias=new transferencia(nomi2,ncuenta,val,sald);
													if(transferencias.getSaldo()>=0) {
														retiro1.setText("Descuento exitoso");
														sald=transferencias.getSaldo();
														usuario1.setSaldo(sald);
													}else {
														retiro1.setText("Saldo insuficiente");
													}
												
												}else {
													tarjeta1.setText("dato incorrecto");
													retiro1.setText("");
												}
												cancelar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave2.setVisible(false);
														panelCentro2.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												salir.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														panelClave2.setVisible(false);
														panelCentro.setVisible(true);
														tarjeta1.setText("");
														retiro1.setText("");
													}
												});
												limpiar.addActionListener (new ActionListener(){
													public void actionPerformed(ActionEvent e){
														nombre5.setText("");
														numcuenta2.setText("");
														valor2.setText("");
														tarjeta1.setText("");
														retiro1.setText("");
													}
										        });
											}
										});
									}
								});
							}
				        });
				        boton4.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelClave3 = new JPanel( );
						        conten.add( panelClave3, BorderLayout.CENTER );
								panelClave3.setLayout(new GridBagLayout( ));
								GridBagConstraints constraint4 = new GridBagConstraints( );
								constraint4.gridx = 0;
						        constraint4.gridy = 0;
						        constraint4.fill = GridBagConstraints.BOTH;
						        Insets insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
						        JLabel ref= new JLabel("Referencia");
						        panelClave3.add(ref,constraint4);
						        constraint4.gridx = 1;
						        constraint4.gridy = 0;
						        constraint4.fill = GridBagConstraints.BOTH;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
						        JTextField ref1= new JTextField("");
						        panelClave3.add(ref1,constraint4);
						        constraint4.gridx = 0;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.BOTH;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
						        JLabel valor= new JLabel("Valor a pagar");
						        panelClave3.add(valor,constraint4);
						        constraint4.gridx = 1;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.BOTH;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
						        JTextField valor2= new JTextField("");
						        panelClave3.add(valor2,constraint4);
						        constraint4.gridx = 0;
						        constraint4.gridy = 4;
						        constraint4.fill = GridBagConstraints.BOTH;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JComboBox empresas=new JComboBox();
						        empresas.setModel(new DefaultComboBoxModel(new String[] {"seleccionar","Codensa","Davivienda","Compensar","EMAAF","Crediflores"}));
						        empresas.setSelectedIndex(0);
						        empresas.setBounds(10, 260, 150, 20);
						        panelClave3.add(empresas,constraint4);
						        constraint4.gridx = 0;
						        constraint4.gridy = 6;
						        constraint4.fill = GridBagConstraints.BOTH;
						        insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
						        JLabel clave= new JLabel("Digite su clave");
						        panelClave3.add(clave,constraint4);
						        cancelar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave3.setVisible(false);
										panelCentro2.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								salir.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave3.setVisible(false);
										panelCentro.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								limpiar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										ref1.setText("");
										valor2.setText("");
										empresas.setSelectedIndex(0);
										tarjeta1.setText("");
										retiro1.setText("");
									}
						        });
						        tarjetaok.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave3.setVisible(false);
												panelCentro2.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave3.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												ref1.setText("");
												valor2.setText("");
												empresas.setSelectedIndex(0);
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										int ref=Integer.parseInt(ref1.getText());;
										int valor=Integer.parseInt(valor2.getText());
										itemSeleecionado = (String)empresas.getSelectedItem();
										sald=mapa.get(celi).getSaldo();
										int clav3=Integer.parseInt(tarjeta1.getText());
										if(clav3==mapa.get(celi).getClave()) {
											tarjeta1.setText("");
											if ("Codensa".equals(itemSeleecionado)) {
												pagos1=new Pagos(ref,valor,"Codensa",sald);
											}else {
												if("Davivienda".equals(itemSeleecionado)) {
													pagos1=new Pagos(ref,valor,"Davivienda",sald);
												}else {
													if("Compensar".equals(itemSeleecionado)) {
														pagos1=new Pagos(ref,valor,"Compensar",sald);
													}else {
														if("EMAAF".equals(itemSeleecionado)) {
															pagos1=new Pagos(ref,valor,"EMAAF",sald);
														}else {
															if("Crediflores".equals(itemSeleecionado)) {
																pagos1=new Pagos(ref,valor,"Crediflores",sald);
															}
														}
													}
												}
											}
											empresas.setSelectedIndex(0);
											if(pagos1.getSaldo()>=0) {
												retiro1.setText("Pago exitoso");
												sald=pagos1.getSaldo();
												usuario1.setSaldo(sald);
											}else {
												retiro1.setText("Saldo Insuficiente");
											}
										}else {
											tarjeta1.setText("dato incorrecto");
											retiro1.setText("");
										}
									}
						        });
							}
				        });
				        boton5.addActionListener (new ActionListener(){
							public void actionPerformed(ActionEvent e){
								panelCentro2.setVisible(false);
								panelClave = new JPanel( );
						        conten.add( panelClave, BorderLayout.CENTER );
								panelClave.setLayout(new GridBagLayout( ));
								GridBagConstraints constraint4 = new GridBagConstraints( );
								constraint4.gridx = 0;
						        constraint4.gridy = 2;
						        constraint4.fill = GridBagConstraints.NONE;
						        Insets insets4 = new Insets( 5, 10, 5, 10 );
						        constraint4.insets = insets4;
								JLabel clave= new JLabel("Ingrese su clave");
								panelClave.add(clave,constraint4);
								cancelar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave.setVisible(false);
										panelCentro2.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								salir.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										panelClave.setVisible(false);
										panelCentro.setVisible(true);
										tarjeta1.setText("");
										retiro1.setText("");
									}
								});
								limpiar.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										tarjeta1.setText("");
										retiro1.setText("");
									}
						        });
								tarjeta1.setText("");
								tarjeta.setText("Ingrese Clave");
								tarjetaok.addActionListener (new ActionListener(){
									public void actionPerformed(ActionEvent e){
										cancelar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro2.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										salir.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												panelClave.setVisible(false);
												panelCentro.setVisible(true);
												tarjeta1.setText("");
												retiro1.setText("");
											}
										});
										limpiar.addActionListener (new ActionListener(){
											public void actionPerformed(ActionEvent e){
												tarjeta1.setText("");
												retiro1.setText("");
											}
								        });
										int clav3=Integer.parseInt(tarjeta1.getText());
										if(clav3==mapa.get(celi).getClave()) {
											tarjeta1.setText("");
											clave.setText("Ingrese nueva Clave");
											constraint4.gridx = 1;
									        constraint4.gridy = 2;
									        constraint4.fill = GridBagConstraints.NONE;
									        Insets insets4 = new Insets( 5, 10, 5, 10 );
									        constraint4.insets = insets4;
											JTextField clave2= new JTextField("");
											panelClave.add(clave2,constraint4);
											constraint4.gridx = 1;
									        constraint4.gridy = 3;
									        constraint4.fill = GridBagConstraints.NONE;
									        insets4 = new Insets( 5, 10, 5, 10 );
									        constraint4.insets = insets4;
											JButton clave3= new JButton("Aceptar");
											panelClave.add(clave3,constraint4);
											limpiar.addActionListener (new ActionListener(){
												public void actionPerformed(ActionEvent e){
													clave2.setText("");
													tarjeta1.setText("");
													retiro1.setText("");
												}
									        });
											clave3.addActionListener (new ActionListener(){
												public void actionPerformed(ActionEvent e){
													cancelar.addActionListener (new ActionListener(){
														public void actionPerformed(ActionEvent e){
															panelClave.setVisible(false);
															panelCentro2.setVisible(true);
															tarjeta1.setText("");
															retiro1.setText("");
														}
													});
													salir.addActionListener (new ActionListener(){
														public void actionPerformed(ActionEvent e){
															panelClave.setVisible(false);
															panelCentro.setVisible(true);
															tarjeta1.setText("");
															retiro1.setText("");
														}
													});
													limpiar.addActionListener (new ActionListener(){
														public void actionPerformed(ActionEvent e){
															tarjeta1.setText("");
															retiro1.setText("");
														}
											        });
													retiro1.setText("Cambio exitoso de clave");
													int clave=Integer.parseInt(clave2.getText());
													usuario1.setClave(clave);
												}
											});
											
										}
									}
								});
							}
				        });
					}else {
						tarjeta1.setText("dato incorrecto");
					}
				}
			}
        });	
	}
}
