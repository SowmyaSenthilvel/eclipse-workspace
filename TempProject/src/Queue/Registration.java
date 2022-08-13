package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Registration {
	static int max=20;
static Queue<Integer> registerStudent(Queue<Integer> iQueue)
{
	
	for(int i=0;i<max;i++)
	{
		iQueue.add(i+1);
	}
	return waitingHall(iQueue);

}
static Queue<Integer> waitingHall( Queue<Integer> iQueue)
{
	 Queue<Integer> whQueue=new LinkedList<Integer>();
	for(int i=0;i<5;i++)
	{
		whQueue.add(iQueue.poll());
	}
	displayQueue(whQueue);
	return whQueue;
}
static void displayQueue(Queue<Integer> whQueue)
{
	System.out.print("|");
	for(Integer item:whQueue)
	{
		System.out.print(item+" | ");
	}
	//System.out.print("|");
	System.out.println();
}
static void queuingProcess(Queue<Integer> iQueue,Queue<Integer> whQueue)
{
	whQueue.poll();
	if(iQueue.size()>0)
	{
		whQueue.add(iQueue.poll());
	}
	displayQueue(whQueue);
}
static void queueImplementation()
{
	 Queue<Integer> iQueue=new LinkedList<Integer>();
	 
	try {
		System.out.println("Interview Process Starts");
		System.out.println("Candidates in the waiting hall");
		Queue<Integer> whQueue= Registration.registerStudent(iQueue);
		
		for(int i=0;i<max;i++)
		{
			
			Thread.sleep(3000);
			Registration.queuingProcess(iQueue,whQueue);
			
		}
		System.out.println("Interview Process Ended");
	} catch (Exception e) {
        System.out.println(e);
    }
}
public static void main(String[] args) {
	Registration.queueImplementation();
}
}

