import javax.swing.JOptionPane;


public class Programa {

	public static void main(String[] args) {
		Conector c = new Conector();
		c.iniciar();
		
		int opcion = 0, elemento;
		Padre arbolito1 = new Padre(); 
		Hijo arbolito2 = new Hijo(); 
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Sacar los nodos que no tengan... \n"
						+ "2. Eliminar sub-árbol que su raiz coincida con el nombre... \n"
						+ "3. Salir"
						+ "Elija una opción: ",JOptionPane.QUESTION_MESSAGE));
				switch(opcion) {
				case 1:
					if(!arbolito1.estaVacio()) {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Ingresa el número del nodo a eliminar...","Eliminando nodo",JOptionPane.QUESTION_MESSAGE));
						if(arbolito1.eliminar1(elemento) == false) {
							JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el arbol",
									"Nodo no encontrado",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "El nodo a sido eliminado del arbol",
									"Nodo eliminado",JOptionPane.INFORMATION_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "El arbol esta vacio","Cuidado!",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 2:
					if(!arbolito2.estaVacio()) {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Ingresa el número del nodo a eliminar...","Eliminando nodo",JOptionPane.QUESTION_MESSAGE));
						if(arbolito2.eliminar2(elemento) == false) {
							JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el arbol",
									"Nodo no encontrado",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "El nodo a sido eliminado del arbol",
									"Nodo eliminado",JOptionPane.INFORMATION_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "El arbol esta vacio","Cuidado!",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Aplicación finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			}catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
			}
		}while(opcion!=3);

	}

}
