public class Queue{
    private int size = 0;
    private String[] queue;
    private int rear;
    private int front;
    public Queue(int size){
        this.queue = new String[size];
        rear = 0;
        front = -1;
    }
    public void enQueue(String s){
        if (size < 10050){
            size++;
            front++;
            queue[front] = s;
        }else{
            try {
                throw new Exception("Queue is full");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public String deQueue(){
        if (size > 0){
            size--;
            String temp = queue[rear++];
            if (rear == queue.length){
                rear = 0;
                front = -1;
            }
            return temp;
        }
        return "";
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == queue.length;
    }
}
