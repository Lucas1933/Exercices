package binarytree;

public class Heap {
	public int [] array = new int [9];
	/* la posición del hijo izquierdo es 2*i
	 la posición del hijo derecho es (2*i)+1
	 la posición del padre = parte entera [i/2]*/
	public void printHeap() {
		for(int i = 1; i*2<=this.array.length;i++) {
			if(this.array[i]!=0) {
				System.out.print("root "+this.array[i]+" ");
			}
			System.out.print("left "+this.array[i*2]+" ");
			if(i*2+1 <this.array.length) {
				System.out.print("right "+this.array[(i*2)+1]+" ");
			}
			this.array[i]=0;
		}
	}
	public void addElement(int element) {
		this.array[8]=element;
		this.orderElement(8);
	}
	private void orderElement(int elementIndex) {
		int parentIndex = elementIndex/2;
		int addedElement = this.array[elementIndex];
		if(this.array[parentIndex]>addedElement) {
			int aux = this.array[parentIndex];
			this.array[parentIndex] = addedElement;
			this.array[elementIndex]=aux;
			this.orderElement(parentIndex);
		}
	}
	
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.array[1]=7;
		heap.array[2]=7;
		heap.array[3]=15;
		heap.array[4]=14;
		heap.array[5]=9;
		heap.array[6]=18;
		heap.array[7]=20;
		heap.addElement(6);
		heap.printHeap();
	}
}
