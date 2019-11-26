
public abstract class EliminarHijos implements IEstrategia{
	
	public void eliminar() {
		Hijo();
		eliminar2();
		estaVacio();
	}
	abstract void Hijo();
	abstract boolean eliminar2(int d);
	abstract boolean estaVacio();

}
