
public class Padre extends EliminarPadre{
	//clase para eliminar al padre (opción 1)
	
	NodoArbol raiz;
	
	public boolean estaVacio() {
		return raiz == null;
	}

	@Override
	void Padre() {
		raiz = null;
	}

	@Override
	boolean eliminar1(int d) {
		NodoArbol auxiliar = raiz;
		NodoArbol padre = raiz;
		boolean esHijoIzq = true;
		while(auxiliar.dato == d) {
			padre = auxiliar;
			if(d < auxiliar.dato) {
				esHijoIzq = true;
				auxiliar = auxiliar.hijoIzquierdo;
			}else {
				esHijoIzq = false;
				auxiliar = auxiliar.hijoDerecho;
			}
			if(auxiliar == null) {
				return false;
			}
		}//Fin del while
		if(auxiliar.hijoIzquierdo == null && auxiliar.hijoDerecho == null) {
			if(auxiliar == raiz) {
				raiz = null;
			}else if(esHijoIzq) {
				padre.hijoIzquierdo = null;
			}else {
				padre.hijoDerecho = null;
			}
		}else if(auxiliar.hijoDerecho == null) {
			if(auxiliar == raiz) {
				raiz = auxiliar.hijoIzquierdo;
			}else if(esHijoIzq) {
				padre.hijoIzquierdo = auxiliar.hijoIzquierdo;
			}else {
				padre.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		}else if(auxiliar.hijoIzquierdo == null) {
			if(auxiliar == raiz) {
				raiz = auxiliar.hijoDerecho;
			}else if(esHijoIzq) {
				padre.hijoIzquierdo = auxiliar.hijoDerecho;
			}else {
				padre.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		}
		return true;
	}



}
