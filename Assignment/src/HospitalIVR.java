
import java.util.*;
public class HospitalIVR{
	
	public static void main(String[] args){
		HospitalIVR hivr=new HospitalIVR();
		hivr.mainMenu();
	
	}
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Welcome to the Hospital IVR");
		int choice = 0,temp = 0;
		do{
		   switch(choice){
			case 0 : getMainMenu();
				 choice = sc.nextInt();
				 stack.push(choice);
				 break;	
			case 1 : getCovidTestingMenu();
				 temp = sc.nextInt();
				 stack.push(choice);
				 if(temp == 9){
					stack.clear();
					choice = 0;
					break;
				}
				choice = 10;
				stack.push(choice);
				break;
		       case 10: 
		    	String type = "TEST";
				if(temp == 1)
					type =  "New Covid-19 Testing";
				else if(temp == 2)
					type = "COVID-19 Oxygen Support";
				else{
					System.out.println("Invalid option");
					stack.pop();
					choice = (!stack.isEmpty()) ? stack.peek() : 0;
					break;
				}
				getEmergencyMenu(type);
				temp = sc.nextInt();
				if(temp == 1){
					getDetailsAndProceed(sc);
					stack.clear();
					choice = 0;
				}
				else
					choice = goBack(stack);
				break;
			case 2: getEmergencyMenu("MEDICAL EMERGENCY");
				temp = sc.nextInt();
				choice = 20+temp;
				stack.push(choice);
				if(temp == 2){
					stack.clear();
					choice = 0;
				}
				else{
					getDetailsAndProceed(sc);
					stack.pop();
					choice=0;
				}
				break;

			case 3: getVaccinationMenu();
				temp = sc.nextInt();
				if(temp == 9){
                     stack.clear();
                     choice = 0;
                     break;
                }
				choice = 30;
				stack.push(choice);
				break;
			
			case 30: getVaccinationSubMenu();
				 temp = sc.nextInt();
                 if(temp == 4){
					choice = goBack(stack);
				}
				else if(temp == 9){
					stack.clear();
					choice = 0;
				}
				else{
					getDetailsAndProceed(sc);
					stack.clear();
					choice = 0;
					
				}
				break;

			case 4: getDoctorAppointMent();			
				temp = sc.nextInt();
				if(temp == 9){
                       stack.clear();
                        choice = 0;
                        break;
                }
				choice = 40;
				break;

			case 40: getEmergencyMenu("DOCTOR APPOINTMENT");
				temp = sc.nextInt();
				 if(temp == 2){
					 stack.clear();
                     choice = 0;
                 }
				 else{
					getDetailsAndProceed(sc);
					stack.pop();
					stack.clear();
					choice=0;
				}
				break; 
			case 5: System.exit(0);
		    }
		}while(choice != 5 );
		sc.close();

		
	}

	public static void getDetailsAndProceed(Scanner sc){

		System.out.println("Please Enter your name, Mobile and Address Details to proceed");
        sc.nextLine();
		String inp = sc.nextLine();
		System.out.println("Thanks for reaching us. Our support person would be reaching you asap.");
	}
	
	public static void getMainMenu(){
		
		System.out.println("MAIN MENU\n1. COVID-19 TESTING \n2. MEDICAL EMERGENCY \n3. VACCINATION APPOINTMENT \n4. DOCTOR APPOINTMENT \n5. EXIT\n Please Enter your choice!!");
	}


	public static void getCovidTestingMenu(){

		System.out.println("COVID-19 HELP MENU \n1. New Test \n2. Oxygen Support \n9. Back to Main Menu");
		
	}

	public static void getEmergencyMenu(String type){

		System.out.println("HELP MENU FOR "+type+" \n1. Please Enter Details to Proceed further \n2. Go Back");

	}

	public static void getVaccinationMenu(){

		System.out.println("VACCINATION MENU \n1. COVAXIN \n2. COVISHIELD \n3. SPUTNIK \n9. Back to Main Menu");		

	}

	public static void getVaccinationSubMenu(){

		System.out.println("VACCINATION DOSE DETAILS \n1. First Dose \n2. Second Dose \n3. Booster Dose \n4. Go Back \n9. Main Menu \nPlease Enter your choice");
		
	}

	public static void getDoctorAppointMent(){

		System.out.println("DOCTOR APPOINTMENT MENU \n1. Skin \n2. ENT \n3. PhysioTherapy \n9. Back to Main Menu \nPlease enter the type of service");
	}

	public static int goBack(Stack<Integer> stack){
		stack.pop();
		return stack.peek();		

	}

}
