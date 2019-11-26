	
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.net.ServerSocket;

public class Conector {
	//Establezco conexion como cliente, ya que recibo el arbol
	Socket cliente;
	String iphost = "localhost";
	ArbolBinario nuevoArbol;
	
	public void iniciar() {
		try {
			cliente = new Socket(iphost, 4500);
			ObjectInputStream mensaje = new ObjectInputStream(cliente.getInputStream());
			mensaje.writeObject("Hola servidor");
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String mensaje2 = (String) entrada.readObject();
			System.out.println("Servidor -> " + mensaje2);
			cliente.close();
			System.out.println("Conexion terminada");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(Exception e){
			Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
