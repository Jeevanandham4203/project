package project;
import java.util.Scanner;
public class bagball {
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	static Bag bag=new Bag();
	public static void main(String[] args) {
		do{
			System.out.println("\t\t\tWelcome to Indoor Game\n");
			System.out.println("Please Select the Input\n");
			System.out.println("1.Add Ball\n2.Remove Ball\n3.Check Bag is Empty or Not\n4.Show Game\n5.Exit\n");
			int input=s.nextInt();
			switch (input)
			{
			case 1:{//
							//Trying to Add the Ball
							System.out.println("Please Select Your Input\n***************\n");
							System.out.println("1.Basket Ball\n2.Tennis Ball\n");
							int inpu=s.nextInt();
							switch (inpu)
							{
							case 1:{
									//Basket Ball 
									bag.addBall(new BasketBall());
								break;}
							case 2:{
								//Tennis Ball
								bag.addBall(new TennisBall());
								break;}
							
							}
				break;}
				case 2:{
								bag.removeBall();
					break;}
				case 3:{
							if(bag.isBagEmpty())
								System.out.println("Bag is Empty");
							else 
								System.out.println("Bag is Not Empty");
					break;}
				case 4:{
					bag.showGame();
					break;}
				case 5:{
					System.out.println("\t\t\t Thank You");
					b=false;
					break;}
			
			}
		}
		while (b);
	}
}

