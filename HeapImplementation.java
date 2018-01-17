import java.util.Arrays;

class Heap {
	
	int size;
	int capacity;
	int[] heapArr;
	
	public Heap() {
		// TODO Auto-generated constructor stub
		size = 0;
		capacity = 1;
		heapArr = new int[1];
	}
	
	void ensureExtraSpace() {
		if(size+1>capacity) {
			this.heapArr = Arrays.copyOf(this.heapArr, 2*capacity);
			capacity = 2*capacity;
		}
	}
	
	void printHeap() {
		int[] x = Arrays.copyOf(this.heapArr,size);
		System.out.println(Arrays.toString(x));
	}
	
	void add(int x) {
		ensureExtraSpace();
		this.heapArr[size] = x;
		this.size++;
		heapifyUp();
	}
	
	void extractMin() {
		this.heapArr[0] = this.heapArr[this.size-1];
		size--;
		heapifyDown();
	}
	
	int getParent(int idx) {
		return (idx-1)/2;
	}
	
	int getLeftChildIndex(int idx) {
		return idx*2+1;
	}
	
	int getRightChildIndex(int idx) {
		return idx*2+2;
	}
	
	boolean hasParent(int idx) {
		return getParent(idx)>=0;
	}
	
	boolean hasLeftChild(int idx) {
		return getLeftChildIndex(idx) <= size;
	}
	
	boolean hasRightChild(int idx) {
		return getRightChildIndex(idx) <= size;
	}
	
	int getHeapSize() {
		return this.size;
	}
	
	void heapifyUp() {
		int x = this.size-1;
		while(hasParent(x) && this.heapArr[getParent(x)]>this.heapArr[x]) {
			swap(getParent(x),x);
			x = getParent(x);
		}
	}
	
	void heapifyDown() {
		int x = 0;
		///System.out.println(x+"->"+hasLeftChild(x));
		while(hasLeftChild(x)) {
			int smallerChildIndex = x;
			if(this.heapArr[getLeftChildIndex(x)] < this.heapArr[x]) {
				smallerChildIndex = getLeftChildIndex(x);
			}
			//System.out.println("X:"+x+"\tSmallerLeftIndex:"+smallerChildIndex);
			smallerChildIndex = hasRightChild(x) && this.heapArr[getRightChildIndex(x)]<this.heapArr[smallerChildIndex] ? getRightChildIndex(x) : getLeftChildIndex(x);
			//System.out.println("Smaller Index : "+smallerChildIndex);
			if(this.heapArr[x] < this.heapArr[smallerChildIndex]) {
				break;
			} else {
			swap(smallerChildIndex,x);
			x = smallerChildIndex;
			}
		}
	}
	
	void swap(int x,int y) {
		int temp = this.heapArr[x];
		this.heapArr[x] = this.heapArr[y];
		this.heapArr[y] = temp;
	}
	
	int getLastElement() {
		return this.heapArr[this.size-1];
	}
	
}

public class HeapImplementation {

	public static void main(String[] args) {

		Heap heap = new Heap();
		heap.add(25);
		heap.add(2);
		heap.add(4);
		heap.add(30);
		heap.add(3);
		heap.add(1);
		heap.printHeap();
		heap.extractMin();
		heap.printHeap();
		heap.extractMin();
		heap.printHeap();
		heap.extractMin();
		heap.printHeap();
		heap.extractMin();
		heap.printHeap();
		
	}

}
