package cajero;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

public class logo extends JPanel{
	public logo() {
		setBorder( new TitledBorder( "Cajero Udec" ) );

        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "imagen/cajero.png" );
        imagen.setIcon( icono );
        add( imagen);
        
        
        setBackground( Color.WHITE );
	}
}
