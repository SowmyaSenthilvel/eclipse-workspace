package InventoryConsole;

import java.util.ArrayList;
import java.util.Scanner;
public class InventoryMain {
    static ArrayList<CustomerPojo> customer = new ArrayList<>();
    static ArrayList<ShopPojo> fruits = new ArrayList<>();
    static ArrayList<NewOfferPojo> offer = new ArrayList<>();
    void addCustomer() {
        customer.add(new CustomerPojo(101, "Brindha", "999455678", "Tiruppur"));
        customer.add(new CustomerPojo(102, "Priya", "916288983", "Karur"));
        customer.add(new CustomerPojo(103, "kumaran", "122763872", "cbe"));
        customer.add(new CustomerPojo(104, "sai", "999455678", "Madurai"));
        customer.add(new CustomerPojo(105, "Elakkiya", "999455678", "vellakovil"));
        customer.add(new CustomerPojo(106, "viji", "356362772", "chennai"));
    }
    void addFruit() {
        fruits.add(new ShopPojo(101, "Apple", 85, 10));
        fruits.add(new ShopPojo(102, "Orange", 100, 10));
        fruits.add(new ShopPojo(103, "Grapes", 78, 10));
        fruits.add(new ShopPojo(104, "Pine Apple", 67, 10));
        fruits.add(new ShopPojo(105, "Strawberry", 24, 10));
        fruits.add(new ShopPojo(106, "cucumber", 90, 10));
    }
    void addOffer() {
        offer.add(new NewOfferPojo(1, "100rs offer for every purchase above 1000", "5 days from today"));
        offer.add(new NewOfferPojo(2, "200rs offer for every purchase above 1500", "5 days from today"));
    }
    void getInfo() {
        Scanner ip = new Scanner(System.in);
        System.out.println("******Welcome to ZOHO Fruit Shop********");
        System.out.println("Enter your choice");
        System.out.println("1.Login As a Admin");
        System.out.println("2.Login As a Customer");
        System.out.println("3.Exit");
        int choice = ip.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.println("1.To view Customer Details");
                System.out.println("2.To view Available stock");
                System.out.println("3.Purchase Stock");
                System.out.println("4.Sale");
                System.out.println("5.To update offer");
                System.out.println("6.Exit");
                int condition = ip.nextInt();
                switch (condition) {
                    case 1:
                        System.out.println("Id          Name            Phonenumber                 city");
                        System.out.println("**************************************************************");
                        for (int i = 0; i < customer.size(); i++) {
                            System.out.println(customer.get(i).getId() + "    " + customer.get(i).getName() + "     " + customer.get(i).getMobno() + "    " + customer.get(i).getCity());
                        }
                        System.out.println("****************************************************************");
                        break;
                    case 2:
                        System.out.println("Id          Name                   Quantity                  Price");
                        System.out.println("**************************************************************");
                        for (int i = 0; i < fruits.size(); i++) {
                            System.out.println(fruits.get(i).getIid() + "    " + fruits.get(i).getItem_name() + "     " + fruits.get(i).getQty() + "    " + fruits.get(i).getPrice());
                        }
                        System.out.println("****************************************************************");
                        break;
                    case 3:
                        System.out.println("The items need to Purchased ");
                        for (int i = 0; i < fruits.size(); i++) {
                            if (fruits.get(i).getQty() <= 5) {
                                System.out.println(fruits.get(i).getIid() + "    " + fruits.get(i).getItem_name() + "     " + fruits.get(i).getQty() + "    " + fruits.get(i).getPrice());
                            } else {
                                System.out.println(fruits.get(i).getItem_name() + " is aviable.. so this time we need not to purchase");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter the item number yo need to Purchase");
                        System.out.println("Id          Name                   Price");
                        System.out.println("**************************************************************");
                        for (int i = 0; i < fruits.size(); i++) {
                            System.out.println(fruits.get(i).getIid() + "    " + fruits.get(i).getItem_name() + "     " + "    " + fruits.get(i).getPrice());
                        }
                        System.out.println("****************************************************************");
                        int ino = ip.nextInt();
                        System.out.println("Enter the Quantity in KG");
                        int qty = ip.nextInt();
                        for (int i = 0; i < fruits.size(); i++) {
                            if (fruits.get(i).getIid() != ino) {

                            } else {
                                if (fruits.get(i).getIid() == ino) {
                                    if (fruits.get(i).getQty() >= qty) {
                                        double rate = fruits.get(i).getPrice() * qty;
                                        if(rate>=1000&&rate<1500)
                                        {
                                            rate=rate-100;
                                        }
                                        if(rate>=1500)
                                        {
                                            rate=rate-200;
                                        }
                                        System.out.println("Please Pay the amount" + rate);
                                        try {
                                            Thread.sleep(3000);
                                        }
                                        catch(Exception e)
                                        {
                                            System.out.println(e);
                                        }
                                        System.out.println("Thanks for Shopping");
                                        int newqty = fruits.get(i).getQty() - qty;
                                        fruits.get(i).setQty(newqty);
                                    } else {
                                        System.out.println(fruits.get(i).getQty() + "Kg  is available.... so please plan appropriate");
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("OfferId         OfferName                                     Valid");
                        System.out.println("*************************************************************************************************");
                        for (int i = 0; i < offer.size(); i++) {
                            System.out.println(offer.get(i).getOfferno()+ "    " + offer.get(i).getOffer() + "     " + "    " + offer.get(i).getValid());
                        }
                        System.out.println("***************************************************************************************************");
                        System.out.println("Do you want to update offer or valid Period");
                        System.out.println("1.update Offer");
                        System.out.println("2.update valid period");
                        int ch=ip.nextInt();
                        if(ch==1)
                        {
                            System.out.println("Enter offer number to update offer");
                            int ofnum=ip.nextInt();
                            ip.nextLine();
                            for(int i=0;i<offer.size();i++)
                            {
                                if(offer.get(i).getOfferno()==ofnum)
                                {
                                    System.out.println("Enter offer to update");
                                    String newoffer=ip.nextLine();
                                    offer.get(i).setOffer(newoffer);
                                }
                            }
                        }
                        else if(ch==2)
                        {
                            System.out.println("Enter offer number to update valid period of time");
                            int ofnum=ip.nextInt();
                            for(int i=0;i<offer.size();i++)
                            {
                                if(offer.get(i).getOfferno()==ofnum)
                                {
                                    System.out.println("Enter offer to update");
                                    String offer_valid_time=ip.nextLine();
                                    offer.get(i).setOffer(offer_valid_time);
                                }
                            }
                        }
                        break;

                    case 6:
                        System.exit(0);
                }
            } else {
                System.out.println("1.To view available items");
                System.out.println("2.To purchase");
                System.out.println("3.to view offers");
                System.out.println("4.Exit");
                System.out.println("Enter your choice");
                int ch=ip.nextInt();
                switch(ch)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        InventoryMain m = new InventoryMain();
        m.addCustomer();
        m.addFruit();
        m.addOffer();
        m.getInfo();
    }
}