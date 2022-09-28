package Medium;

class MinStack {
    private class Node {
        int val;
        Node next;
    }
    private Node top;
    private boolean isEmpty;
    private int minVal;

    public MinStack() {
        top = null;
        isEmpty = true;
    }
    
    public void push(int val) {
        Node temp = new Node();

        if(isEmpty){
            isEmpty = false;
            minVal = val;
        }else{
            minVal = minVal > val ? val : minVal;
        }
        temp.val = val;
        temp.next = top;
        top = temp;
    }
    
    public void pop() {
        if(isEmpty){
            return;
        }

        Node temp = top.next;
        top = null;
        top = temp;

        if(top == null){
            isEmpty = true;
        }
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return minVal;
    }
}
