
public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
    if(height == 0){
            top = newNode;
        }else{
            newNode.next =top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;

        return temp;
    }


    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println("Value: " + temp.value);
            temp = temp.next; // 다음 노드로 이동
        }
    }
    public void getHeight(){
            System.out.println(("Height: " + height));
        }



    }

