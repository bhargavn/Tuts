package trees;

public class ThreadedBinaryTree<T> {
	ThreadedTreeNode<T>root=null;
	Integer size =0;
	public ThreadedBinaryTree(T value) {
		// TODO Auto-generated constructor stub
		root=new ThreadedTreeNode<T>(value);
	}
	
	public void addTreeNode(T value){
		ThreadedTreeNode<T>current=new ThreadedTreeNode<T>(value);
		
		ThreadedTreeNode<T>node=root;
		
	/*	while(node.leftChild!=null&&node.rightChild!=null){
			int i =current.compareTo(node);
			if(i<0){
				node=node.rightChild;
			}
			else{
				node=node.leftChild;
			}
		}*/
		while(true){
			int i =current.compareTo(node);
			if(i<0){
				if(node.rightChild==null){
					node.rightChild=current;
					size++;
					break;
				}else{
					node=node.rightChild;
				}
			}else{
				if(node.leftChild==null){
					node.leftChild=current;
					size++;
					break;
				}else{
					node=node.leftChild;
				}
			}
			
		}
		int i =current.compareTo(node);
		if(i<0){
			node.rightChild=current;
			size++;
		}else{
			current.rightChild=node;
			current.rightThread=true;
			node.leftChild=current;
			
			size++;
		}
		
	}
	
	
}
class ThreadedTreeNode<T>{
	T value;
	ThreadedTreeNode<T>leftChild;
	ThreadedTreeNode<T>rightChild;
	boolean rightThread;
	public ThreadedTreeNode() {
		// TODO Auto-generated constructor stub
	}
	public ThreadedTreeNode(T value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	public int compareTo(ThreadedTreeNode<T> value){
		Integer i=null;
		if(value.value instanceof Integer){
		i=	Integer.compare((Integer)value.value, (Integer)this.value);
		}
		return i;
	}
	
}
