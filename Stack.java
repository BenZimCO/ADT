public class Stack {
    public String stack[];
    public int size;
    public Stack(int size) {
        this.stack = new String[size];
    }
    //check if the stack empty or not
    public boolean isEmpty(){
        return (size==0);
    }
    //check if the stack full or not
    public boolean isFull(){
        return (size== stack.length);
    }
    //insert message at the top of stack
    public void push (String items) {
        //check stackoverflow
        try{
            if (isFull());
        }catch (Exception e){
            System.out.println("Stack is full");
        }
        this.stack[size++]=items;
    }
    private void ensureNonEmpty() {
        if (size == 0) throw new IllegalStateException("Stack is Empty!!! Can not pop!");
    }
    //remove the top message
    public String pop()  {
        String popMess ="";
        ensureNonEmpty();
        popMess = this.stack[size-1];
        size--;
        return popMess;
    }
}
