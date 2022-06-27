package IVR;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Menus {
	static HashMap<Integer,String> mainMenu=new HashMap<Integer, String>();
public void getMainMenu()
{
	System.out.println("Enter the choice");
	mainMenu.put(1, "Mobile Recharge");
	mainMenu.put(2, "DTH");
	mainMenu.put(3, "Exit");
	getMenus(1, 3);
}
public void getMobileRechargeMenu()
{
	System.out.println("Enter the choice");
	//Menus menu=new Menus();
	mainMenu.put(11, "Prepaid");
	mainMenu.put(12, "Postpaid");
	mainMenu.put(13, "Back to Main Menu");
	getMenus(11, 13);
}
public void getPrepaid()
{
	System.out.println("Enter the choice");
	mainMenu.put(111, "Airtel");
	mainMenu.put(112, "Aircel");
	mainMenu.put(113, "Jio");
	mainMenu.put(114, "Vodafone");
	mainMenu.put(115, "Back");
	mainMenu.put(116, "Back to Main Menu");
	getMenus(111,116);
}
public void getPostpaid()
{
	System.out.println("Enter the choice");
	//Menus menu =new Menus();
	mainMenu.put(121, "Airtel");
	mainMenu.put(122, "Aircel");
	mainMenu.put(123, "Jio");
	mainMenu.put(124, "Vodafone");
	mainMenu.put(125, "Back");
	mainMenu.put(126, "Back to Main Menu");
	getMenus(121,126);
}
public void goBackToMainMenu(Stack<Integer> flowStack)
{	
	flowStack.clear();
}
public int goBack(int choice,Stack<Integer> flowStack)
{
	int popval=choice/100;
	while(flowStack.peek()!=popval)
	{
		flowStack.pop();
	}
	return popval;
}
public void getMenus(int start,int end)
{
	//Menus menu =new Menus();
	int index=1;
	while(start<=end)
	{
		for(Map.Entry<Integer, String> entry:mainMenu.entrySet())
		{
				if(entry.getKey()==start)
				{
					System.out.println(index+". "+entry.getValue());
					index++;				
				}
		}
		start++;
	} 
	
} 
public int getStartIndex(int popval)
{
	int length = (int) (Math.log10(popval) + 1);
	int start=1;
	while((length-1)!=0)
	{
		start=start*10+1;
		length--;
	}
	return start;
}
public void getDTHMenus()
{
	System.out.println("Choose the DTH Provider");
	mainMenu.put(21, "SUN Direct");
	mainMenu.put(22, "TATA SKY");
	mainMenu.put(23, "AIRTEL DTH");
	mainMenu.put(24, "Reliance Digital TV");
	mainMenu.put(25, "AIRTEL DTH");
	mainMenu.put(26, "Back to Main Menu");
	getMenus(21, 26);
}
}

