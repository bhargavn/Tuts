package trees;

public class BinTree {

    
    private Node rootNode;
    static int treeCount=0;
    int count;
    
    public BinTree(){
           rootNode=null;
           treeCount++;
           count =0;
    }
    
    private void addNode(Object objData){
           Node tempNode = new Node(objData);
           tempNode.leftPtr=tempNode.rightPtr=tempNode.threadPtr=null;
           count++;
           if(rootNode==null)
                  rootNode = tempNode;
           else{
                  Node inParentNode=null,travNode = rootNode;
                  while(travNode!=null){
                         if(Integer.valueOf(travNode.nodeData.toString())>Integer.valueOf(objData.toString())){
                               if(travNode.leftPtr==null){
                                      travNode.leftPtr=tempNode;
                                      travNode.threadPtr=null;
                                      tempNode.threadPtr=travNode;
                                      break;
                               }
                               inParentNode = travNode;
                               travNode = travNode.leftPtr;
                        }
                        else{
                               if(travNode.rightPtr==null){
                                      travNode.rightPtr=tempNode;
                                      travNode.threadPtr=null;
                                      tempNode.threadPtr=inParentNode;
                                      break;
                               }
                               travNode = travNode.rightPtr;
                        }
                  }
           }
           
           
    }
    
    private void printNodes(){
           
           System.out.println("Nodes in Tree:");
           printNode(rootNode);
    }
    private void printNode(Node travNode){
           if(travNode==null)
                  return;
           printNode(travNode.leftPtr);
           System.out.print(travNode.nodeData.toString()+" ");
           printNode(travNode.rightPtr);
    }
    private void printNodesThreaded(){
           
           System.out.println("Nodes in Tree:");
           Node travNode=rootNode;
           boolean threadFlag=false;
           while(travNode!=null){
                  if(travNode.leftPtr!=null && threadFlag==false){
                        travNode=travNode.leftPtr;
                        continue;
                  }
                  else{
                        if(travNode.rightPtr!=null){
                               threadFlag=false;
                               System.out.print(" "+travNode.nodeData.toString());
                               travNode=travNode.rightPtr;
                               continue;
                        }
                        if(travNode.threadPtr!=null){
                               System.out.print(" "+travNode.nodeData.toString());
                               travNode=travNode.threadPtr;
                               threadFlag=true;
                               continue;
                        }
                        if(travNode.threadPtr!=null &&travNode.rightPtr!=null&&travNode.leftPtr!=null){
                        	System.out.print(" "+travNode.nodeData.toString());
                        }
                        
                  }
           }
    }

    
    public static void main(String[] args) {
           // TODO Auto-generated method stub
           BinTree tree1= new BinTree();
           tree1.addNode("1");
           tree1.addNode("2");
           tree1.addNode("3");
           tree1.addNode("0");
           //tree1.printNodes();
           tree1.printNodesThreaded();
    }

}

class Node{
    Node leftPtr,rightPtr,threadPtr;
    Object nodeData;
    Node(){
           leftPtr=rightPtr=threadPtr=null;
    }
    Node(Object obj){
           nodeData = obj;
           leftPtr=rightPtr=threadPtr=null;
    }
}
