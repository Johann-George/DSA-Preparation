class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

class BinarySearchTree:
    def __init__(self):
        self.root=None

    def insert(self,root,data):
        #condition to add a node to the root if empty
        if root==None:
            return Node(data)
        elif root.data<data:
            root.right=self.insert(root.right,data)
        else:
            root.left=self.insert(root.left,data)
        #updates root.right/root.left/bst.root
        return root

    def display(self,root):
        #inorder traversal
        if root:
            self.display(root.left)
            print(root.data," ")
            self.display(root.right)

bst = BinarySearchTree()
bst.root=bst.insert(bst.root,50)
bst.root=bst.insert(bst.root,30)
bst.root=bst.insert(bst.root,70)
bst.root=bst.insert(bst.root,20)
bst.root=bst.insert(bst.root,40)
bst.root=bst.insert(bst.root,60)
bst.root=bst.insert(bst.root,80)
bst.display(bst.root)
