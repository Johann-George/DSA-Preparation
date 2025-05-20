#write a function to reverse a singly linked list
class Node:
    def __init__(self,value):
        self.data=value
        self.next=None

class LinkedList:
    def __init__(self):
        self.head = None

    # Method to append data to the end of the list
    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = new_node

    # Method to display the linked list
    def display(self):
        cur = self.head
        while cur:
            print(cur.data, end=" -> ")
            cur = cur.next
        print("None")

    def reverse(self):
        cur=self.head
        prev=None
        #traverse through the linked list till it reaches 
        while(cur!=None):
            next_node=cur.next
            cur.next=prev
            prev=cur
            cur=next_node
        return prev

ll=LinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.display()
ll.head=ll.reverse()
ll.display()




