//Write a function to reverse a singly linked list.

class Node{

  int data;
  Node next;
  public Node(int data){
    this.data=data;
    this.next=null;
  }

}

class LinkedList{

  Node head;

  public void insert(int data){
    Node temp;
    Node newNode = new Node(data);
    //if no node is there 
    if(head==null){
      head=newNode;
    }
    //adding new node to end of list
    else{
      temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;
    }
  }

  public void delete(int index){
    Node temp;
    Node prev;
    temp=head;
    prev=null;
    int i=0;
    while(temp!=null){
      i+=1;
      if(index==1 && i==index){
        head=temp.next;
        temp=null;
        return;
      }
      if(i==index){
        prev.next=temp.next;
        return;
      }
      else{
        prev=temp;
        temp=temp.next;
      }
    }
  }

  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.println(temp.data+"-->");
      temp=temp.next;
    }
  }

  public void reverse(){
    Node temp=head;
    Node prev=null;
    Node new_node;
    while(temp!=null){
      new_node=temp.next;
      temp.next=prev;
      prev=temp;
      temp=new_node;
    }
    head=prev;
  }

}

class Question_3{

  public static void main(String[] args){

    LinkedList list = new LinkedList();    
    // Insert elements
    list.insert(10);
    list.insert(20);
    list.insert(30);

    // Display the list
    System.out.println("Linked List:");
    list.display();

    // Delete a node
    //list.delete(2);
    //reverse a linked list
    list.reverse();
    // Display after deletion
    System.out.println("After deleting 20:");
    list.display();  
  }

}
