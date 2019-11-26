
public abstract class EliminarPadre implements IEstrategia{
	
	public void eliminar() {
		Padre();
		eliminar1();
		estaVacio();
	}
	abstract void Padre();
	abstract boolean eliminar1(int d);
	abstract boolean estaVacio();

}
