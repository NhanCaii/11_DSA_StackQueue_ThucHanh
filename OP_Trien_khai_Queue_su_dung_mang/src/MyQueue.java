public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        if(currentSize==capacity){
            return true;
        } else {
            return false;
        }
    }
    public boolean isQueueEmpty(){
        if (currentSize==0){
            return true;
        } else {
            return false;
        }
    }

    public  void enqueue(int item){
        if (isQueueFull()){
            System.out.println("full, cannot add");
        } else {
            tail++;
            if (tail==capacity-1){
                tail=0;
            }
            queueArr[tail]=item;
            currentSize++;
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("no value");
        } else {
            head++;
            if (head==capacity-1){
                head=0;
            }
        }
        currentSize--;
    }
}
