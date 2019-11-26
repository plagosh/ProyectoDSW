
public class Hijo extends EliminarHijos{
	//clase para eliminar a los hijos (opción 2)
	//Se asume que tanto en padre como hijo son arboles binarios y que estan ordenados de mayor a menor
	//también estos son numero de cualquier tipo
	NodoArbol raiz;
	int d;
	
	@Override
	public boolean estaVacio() {
		return raiz == null;
	}

	@Override
	void Hijo() {
		raiz = null;
	}

	@Override
	boolean eliminar2(int d) {
		NodoArbol auxiliar = raiz;
		NodoArbol padre = raiz;
		boolean esHijoIzq = true;
		while(auxiliar.dato != d) {
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
				auxiliar.hijoIzquierdo = null;
			}else {
				auxiliar.hijoDerecho = null;
			}
		}else if(auxiliar.hijoDerecho == null) {
			if(auxiliar == raiz) {
				raiz = auxiliar.hijoIzquierdo;
			}else if(esHijoIzq) {
				auxiliar.hijoIzquierdo = auxiliar.hijoIzquierdo;
			}else {
				auxiliar.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		}else if(auxiliar.hijoIzquierdo == null) {
			if(auxiliar == raiz) {
				raiz = auxiliar.hijoDerecho;
			}else if(esHijoIzq) {
				auxiliar.hijoIzquierdo = auxiliar.hijoDerecho;
			}else {
				auxiliar.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		}
		return true;
	}


}

