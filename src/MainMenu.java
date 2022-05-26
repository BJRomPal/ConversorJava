import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class MainMenu extends JOptionPane {

	//public static void main(String[] args) {
	
	public int seleccionarOpcion() {
	
		String[] opciones = { "Moneda", "Pesos", "Temperatura" };
		int opcion = JOptionPane.showOptionDialog(null // componente
				, "¿Que conversor desea utilizar?" // Mensaje
				, "Menú Principal" // Titulo en la barra del cuadro
				, JOptionPane.DEFAULT_OPTION // Tipo de opciones
				, JOptionPane.PLAIN_MESSAGE // Tipo de mensaje (icono)
				, null // Icono (ninguno)
				, opciones // Opciones personalizadas
				, null // Opcion por defecto
		);
		return opcion;
	}
}
