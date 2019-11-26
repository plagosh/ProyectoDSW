
public class ArbolBinario {
	
	private IEstrategia estrategia;
	
	public ArbolBinario(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.eliminar();
	}
}
