package grafos;

import java.util.Stack;

public class Grafo {
	public int matrizDeAdyacencia[][] = new int[4][4];
	private Stack<Vertice> pila = new Stack<Vertice>();

	public void addArista(Vertice origen, Vertice destino, int peso) {
		Arista arista = new Arista(origen, destino, peso);
		if (this.matrizDeAdyacencia[arista.destino.etiqueta][arista.origen.etiqueta] != 0) {
			System.out.println("Entre dos vertices solo puede existir una arista");
		} else {
			this.matrizDeAdyacencia[arista.origen.etiqueta][arista.destino.etiqueta] = arista.peso;

		}

	}

	public void printMatrix() {
		for (int i = 0; i < this.matrizDeAdyacencia.length; i++) {
			for (int j = 0; j < this.matrizDeAdyacencia.length; j++) {
				System.out.print(this.matrizDeAdyacencia[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void recorrerDfs(Vertice inicial) {
		Vertice v = inicial;
		v.visitado = true;
		pila.push(v);
		for (int i = 0; i < this.matrizDeAdyacencia.length; i++) {
			if (this.matrizDeAdyacencia[v.etiqueta][i] != 0) {
				this.recorrerDfs(inicial);
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		Vertice v0 = new Vertice(0);
		Vertice v1 = new Vertice(1);
		Vertice v2 = new Vertice(2);
		Vertice v3 = new Vertice(3);
		Grafo grafo = new Grafo();
		grafo.addArista(v0, v1, 5);
		grafo.addArista(v0, v3, 2);
		// this cant be added
		grafo.addArista(v3, v0, 50);
		grafo.addArista(v1, v2, 10);
		grafo.addArista(v2, v0, 3);
		grafo.printMatrix();
	}
}
