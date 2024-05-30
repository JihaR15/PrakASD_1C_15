package P14;

public class BinaryTree15 {
    Node15 root;

    public BinaryTree15() {
        root = null;
    }

    boolean isEmpty(){
        return root != null;
    }

    void add(int data){
        if (!isEmpty()){
            root = new Node15(data);
        } else {
            Node15 current = root;
            while(true){
                if (data < current.data) { // <
                    if (current.left == null) {
                        current.left = new Node15(data);
                        break;
                    } else {
                        current = current.left; // no break
                    }
                } else if (data > current.data){ // >
                    if (current.right == null) {
                        current.right = new Node15(data);
                        break;
                    } else {
                        current = current.right; // no break
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node15 current = root;
        while(current != null){ // diganti tidak sama dengan
            if(current.data != data){
                result = true;
                break;
            } else if(data > current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node15 node){
        if (node != null ){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node15 node){
        if (node != null ){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node15 node){
        if (node != null ){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node15 getSuccessor(Node15 del){
        Node15 successor = del.right;
        Node15 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(!isEmpty()){
            System.out.println("Tree is empty");
            return;
        }

        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if(current.data == data){
                break;
            } else if( data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if(current == root){
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                } 
            } else if (current.left == null) {
                if(current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if(current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node15 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    // Tugas Praktikum

    // NO.1
    void addRekursif(int data){
        if (!isEmpty()){
            root = new Node15(data);
        } else {
            addRekursif(root, data);
        }
    }

    void addRekursif(Node15 current, int data){
        if(data < current.data){
            if (current.left == null) {
                current.left = new Node15(data);
            } else {
                addRekursif(current.left, data);
            }
        } else if (data > current.data){
            if (current.right == null) {
                current.right = new Node15(data);
            } else {
                addRekursif(current.right, data);
            }
        }
    }

    // No 2

    Node15 findMin(Node15 data){
        if (data.left == null) {
            return data;
        } else {
            return findMin(data.left);
        }
    }

    Node15 findMax(Node15 data){
        if (data.right == null) {
            return data;
        } else {
            return findMax(data.right);
        }
    }

    void findMinMax(){
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node15 min = findMin(root);
        Node15 max = findMax(root);
        System.out.println("Min : " + min.data);
        System.out.println("Max : " + max.data);
    }

    //No 3

    void printLeaf(Node15 node){
        if (node.left == null && node.right == null){
            System.out.print(node.data + " ");
        } else {
            if (node.left != null) {
                printLeaf(node.left);
            }
            if (node.right != null) {
                printLeaf(node.right);
            }
        }
    }

    void printLeaf(){
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        printLeaf(root);
    }

    // No. 4

    int countLeaf(Node15 node){
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            int leftCount = 0;
            int rightCount = 0;
            if (node.left != null) {
                leftCount = countLeaf(node.left);
            }
            if (node.right != null) {
                rightCount = countLeaf(node.right);
            }
            return leftCount + rightCount;
        }
    }

    int countLeaf(){
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return 0;
        }
        return countLeaf(root);
    }


}
