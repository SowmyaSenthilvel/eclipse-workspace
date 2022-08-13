import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		Scanner input=new Scanner(System.in);
		String date=input.nextLine();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(date+" "+date1);
		
	}

}
