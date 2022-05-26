import javax.swing.JOptionPane;

@SuppressWarnings("serial")

public class RepetirConversion extends JOptionPane {
	
	public int preguntarRepeticion () {
	
		String[] opciones = { "Si", "No" };
		int opcion = JOptionPane.showOptionDialog(null // componente
				, "¿Quiere Realizar otra conversion?" // Mensaje
				, null // Titulo en la barra del cuadro
				, JOptionPane.DEFAULT_OPTION // Tipo de opciones
				, JOptionPane.PLAIN_MESSAGE // Tipo de mensaje (icono)
				, null // Icono (ninguno)
				, opciones // Opciones personalizadas
				, null // Opcion por defecto
		);
		return opcion;
	}
}
	

