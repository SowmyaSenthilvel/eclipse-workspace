package dhanaShree_san__Assignment;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class TimeStampAssignment {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a TimeStamp here");
		String userTimeStamp=input.nextLine();
		Timestamp timestamp=Timestamp.valueOf(userTimeStamp);
		System.out.println(timestamp);
		long timestampMilli=timestamp.getTime();

		System.out.println("Please Enter your choice....\n1.for seconds ago\n2.for minute ago\n3.for hour ago\n4.for day ago\n5.for week ago \n6 for month ago\n7.for year ago");
		System.out.println("Enter a choice ");
		byte choice=input.nextByte();
		switch(choice) {
		case 1:
			System.out.println("Enter how many seconds ago you want the time:");
			long seconds=input.nextInt();
			long millis=timestampMilli-(seconds*1000);
			System.out.println(new Timestamp(millis));
			break;
		case 2:
			System.out.println("Enter how many minutes ago you want the time:");
			long minutes=input.nextLong();
			long minutemilli=timestampMilli-(minutes*60000);
			System.out.println(new Timestamp(minutemilli));
			break;
		case 3:
			System.out.println("Enter how many hours ago you want the time:");
			long hours=input.nextInt();
			long hoursmilli=timestampMilli-(hours*60*60000);
			System.out.println(new Timestamp(hoursmilli));
			break;
		case 4:
			System.out.println("Enter how many days ago you want the time:");
			int days=input.nextInt();
			long perdayms=days*1440*60000;
			long daysmilli=timestampMilli-perdayms;
			System.out.println(new Timestamp(daysmilli));
			break;
		case 5:
			System.out.println("Enter how many weeks ago you want the time:");
			int weeks=input.nextInt();
			long perweekms=weeks*7*1440*60000;
			long weekmillis=timestampMilli-perweekms;
			System.out.println(new Timestamp(weekmillis));
			break;
		case 6:
			System.out.println("Enter how many months ago you want the time:");
			int months=input.nextInt();
			long permonthms=months*30*1440*60000;
			long monthmilli=timestampMilli-permonthms;
			System.out.println(new Timestamp(monthmilli));
			break;
		case 7:
			System.out.println("Enter how many year ago you want the time:");
			int years=input.nextInt();
			long peryearmilli=years*365*1440*60000;
			long yearmilli=timestampMilli-peryearmilli;
			System.out.println(new Timestamp(yearmilli));
			break;
		default:
			System.out.println("Enter a valid timestamp to convert");
			break;
			
			
		}
		
		
	}

}
