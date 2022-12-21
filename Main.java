import java.util.Random;
import java.lang.Exception;
public class Main{
    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(1000);
        Queue myQueue = new Queue(1000);
        System.out.println("Message send user 1 send:");
        long  startTime  =  System.currentTimeMillis();
        for (int i = 0; i < 1000;i++) {
            String mess = "I love Banana";
            Random rand = new Random();
            mess += rand.nextInt(20);
            if (mess.length()>255) {
                System.out.println("maxium lenght");
                System.out.print("please try again");
                System.exit(0);
            }else {
                myQueue.enQueue(mess);
                System.out.println("[User 1]: " + mess);
            }
        }
        while (!myQueue.isEmpty()){
           String mess = myQueue.deQueue();
            myStack.push(mess);
        }
        System.out.println();
        System.out.println("Message send user 2 recive:");
         while (!myStack.isEmpty()){
             System.out.println("[User 2]: " +  myStack.pop());
         }
         long  endTime  =  System.currentTimeMillis();
         double  time  =  (endTime  -  startTime)/1000.0;
         System.out.println("Runtime  in  seconds:"+time);
    }
    
}
