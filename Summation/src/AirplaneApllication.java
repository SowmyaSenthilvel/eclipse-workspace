
public class AirplaneApllication {
//An Airline operates multiple flights from chennai to hyderabad.you need to write a basic ticket booking program for their flights
//1.For simplicity consider there are only two flights,each identified by a unique number sat=y 101,102.Your program should be generic enough to handle any number of flights
//2.Flight seats are categorized under two types namely Economy class and buiseness class.Each flight has 6 buiseness seats and 12 economy seats
//3.To Accomodate laste minute travellers 2 seats under buiseness and 4 ubder economy for tatkal booking
//4.Base price of an econmy class ticket is rs.1000 and for buiseness class ticket is rs.2000
//5.Each booking should be identified by a unique auto generated id this id is unique across all the all the flights
//6.In single booking any number of seats can be booked.
//7.Surge price-- After each successful booking price of the ticket increases by INR 100 for economy clASS AND INR 200  for buiseness class
//8.Tatkal BOoking-- If a ticket is booked under tatkal category ticket price is flat andsurge price is not applicable
//9.Meal cost-- While booking a tickeet under tatkal category provide an option to book meal at an additional cost of INR 200 per messenger
//10.Senior citizen discount-For senior citizen 10% discount will be provided final ticket fare after surge pricing or tatkal charges
}
//11.Normal Ticket Cancellation--> Cancellation is not allowed for any booking id for a flat cancellation fee of INR 200 per seat
//12Tatkal Cancellation--> Cancellation charges for tatkal tickets are flat INR 1000 per seat


//You should handle 1: handle booking
//2:handele cancellation
//3.Print all available seats of each flights
//4.Print seat numbers for which meal is ordered for each flight
//5.print individual and flight summary of all bookings
//6.Exit the program


//Operation 1:
//Enter the flight(101,102) : 101
//Select Category (G-General, T-Tatkal) : G
//Seats Available :buiseness-4 seats economy-8 seats
//Seat Type: (B - Buiseness(2000 INR),(E-Economy(1000INR)) : B
//No of seats required : 2
//Senior citizens(Y-Yes N-NO) : Y
//Meals Required(yes No) :Y
//Total cost:(@B*2000=4000->10% for seniors=3600+meals(200*2)=4000INR
//status: Booking Completed: Booking ID :1

//Operation 1:
//Enter the flight(101,102) : 101
//Select Category (G-General, T-Tatkal) : T
//Seats Available :buiseness-2 seats economy-4 seats
//Seat Type: (B - Buiseness(2000 INR),(E-Economy(1000INR)) : B
//No of seats required : 2
//Senior citizens(Y-Yes N-NO) : Y
//Meals Required(yes No) :Y
//Total cost:(@B*2000=4000->10% for seniors=3600+meals(200*2)=4000INR
//status: Booking Completed: Booking ID :1
