//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Stack myStack = new Stack(7);

    myStack.push(23);
    myStack.push(3);
    myStack.push(11);

    myStack.pop();


    myStack.printStack();
    }
}