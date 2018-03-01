package pizzasystem;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecimalFormat df = new DecimalFormat("#.##");
Scanner keyboard = new Scanner (System.in);

// Variables
String name;
char crustType;
String crust= "";
int inch;
double cost=0.0;
final double taxRate = 0.10;
double tax;
double total;
double finalTotal;
int numberOfToppings =0;
int numberOfToppings2 =0;
int numberOfToppings3 = 0;
int numberOfToppings4 = 0;
int numberOfToppingsTotal=0;
String toppings = "Cheese";


System.out.println("What is your name?");
name = keyboard.nextLine();


boolean delivery = false;
int deliveryFee=0;
System.out.println("Do you require delivery? (true or false)");
delivery = keyboard.nextBoolean();
if(delivery == true){
	deliveryFee=4;
	System.out.println("Your delivery charge is $4 (not including tip)");
}
System.out.println("What size of pizza?(inches) 10, 12, 14, 16, or 1000(I'm really hungry)");
inch = keyboard.nextInt();
if(inch==10){
	cost = 9.99;
} else if (inch==12){
	cost = 11.49;
} else if (inch == 14){
	cost = 13.99;
}
else if (inch == 16){
	cost = 15.32;
} else if (inch == 1000){
	cost = 800;
} else if(inch != 10 && inch != 12 && inch != 14 && inch != 16 && inch != 1000){
	System.out.println("Error, defaulted to 10");
	cost = 9.99;
}
keyboard.nextLine();

System.out.println("What type of crust do you want? (H)and-tossed, (T)hin crust, (D)eep-dish (Enter H, T, or D)");
crustType = keyboard.nextLine().charAt(0);

if(crustType == 'H' || crustType == 'h'){
crust = "Hand Tossed";} 
	else if (crustType == 'T' || crustType == 't'){
crust = "Thin Crust";
} else if (crustType == 'D' || crustType == 'd'){
	crust = "Deep-dish";
}
	

//Additional toppings
System.out.println("All pizzas come with cheese");
System.out.println("Additional toppings are $1.25 each");

//Pepperoni
System.out.println("Do you want Pepperoni?(Y/N)");
numberOfToppings = keyboard.nextLine().charAt(0);
if(numberOfToppings =='Y' || numberOfToppings == 'y'){
	numberOfToppings=1;
	toppings += " and Pepperoni ";
}else{
	numberOfToppings=0;
	}

System.out.println("Do you want onion? (Y/N)");
numberOfToppings2 = keyboard.nextLine().charAt(0);
if( numberOfToppings2 == 'Y' || numberOfToppings2 == 'y'){
	numberOfToppings2=1;
	toppings += " and onion";
}else{
	numberOfToppings2 =0;
}
System.out.println("Do you want Bacon?(Y/N)");
numberOfToppings3 = keyboard.nextLine().charAt(0);
if(numberOfToppings3 == 'Y' || numberOfToppings3 == 'y'){
	numberOfToppings3=1;
	toppings += " and Bacon";
	}else{
		numberOfToppings3=0;
	}
System.out.println("Do you want Peppers?(Y/N");
numberOfToppings4 = keyboard.nextLine().charAt(0);
if(numberOfToppings4 == 'Y' || numberOfToppings4 == 'y'){
	numberOfToppings4=1;
	toppings += " and Peppers";
}else{ numberOfToppings4=0;

}

numberOfToppingsTotal = (numberOfToppings) + (numberOfToppings2) + (numberOfToppings3) + (numberOfToppings4);

//Calculate 
total = (cost) + (numberOfToppingsTotal*1.25) + (deliveryFee);
tax= total * taxRate;
finalTotal = total * ( 1 + taxRate);

// Payment 
System.out.println(name + " your order is ready:");
System.out.println(inch + " inch pizza");
System.out.println(crust + ", " + toppings);
System.out.println("Order Cost Before Tax: $" + total);
System.out.println("Total Due: $" + (finalTotal));

}
	
}
	
	

