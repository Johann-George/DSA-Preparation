class Node{

  int data;
  Node left;
  Node right;
  public Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }

}

class BST{

  Node root;

  public Node insert(Node temp,int data){

    Node newNode = new Node(data);
    if(temp==null){
      temp=newNode;
    }
    else{
      if(data<temp.data){
        temp.left=insert(temp.left,data);
      }
      else{
        temp.right = insert(temp.right,data);
      }
    }
    return temp;

  }

  public void display(Node temp){

    if(temp!=null){
      display(temp.left);
      System.out.println(temp.data+" ");
      display(temp.right);
    }

  }

}

class Question_4{

  public static void main(String[] args){
    BST bst = new BST();
    bst.root=bst.insert(bst.root,4);
    bst.root=bst.insert(bst.root,5);
    bst.root=bst.insert(bst.root,6);
    bst.display(bst.root);    
  }

}
