package project;

import java.util.Scanner;

public class users {
		static mobile m1=new mobile("Mi","Black","128gb",23000);
		static boolean b=true;
		static Scanner s=new Scanner(System.in);
		public static void main(String[] args) 
		{
				do {
				System.out.println("\t\t\t\"Welcome to mobile Store\"\n");
				System.out.println("Select The condition\n***********");
				System.out.println("1.Add Sim\n2.Remove Sim\n3.sim Present or Not\n4.Details of sim\n5.Details of mobile\n6.EXIT");
				int condition=s.nextInt();//
				switch (condition)
				{
					case 1:{
								//Add Sim
								System.out.println("Please Select The Sim\n");
								System.out.println("1.Sim1\n2.Sim2 ");
								int sim_choice=s.nextInt();//1
								switch (sim_choice)
								{
								case 1:{//Adding sim 1
										m1.addsim1(new sim("jio","5G",2.5,912345653));
										//System.out.println("Sim 1 added successfully");
									break;}
								case 2:{//Add Sim2
											m1.addSim2(new sim("Airtel","4g",2.0,987654321));
											System.out.println("Sim 2 added successfully");
									break;}	
								
								}
					break;}

					case 2:{
						//Remove Sim
						
								//Remove Sim
								System.out.println("Please Select The Sim\n");
								System.out.println("1.Sim1\n2.Sim2 ");
								int sim_choice=s.nextInt();//1
								switch (sim_choice)
								{
								case 1:{//Remove sim 1
											m1.removeSim1();
											System.out.println("Sim 1 remove successfull");
									break;}
								case 2:{//Remove Sim2
											m1.removeSim2();
											System.out.println("Sim 2 remove successfull");
									break;}	
								
								}
						break;}
					case 3:{
						System.out.println("1.Sim 1 Present \n2.Sim 2 Present");
						int sim= s.nextInt();
						switch(sim) {
						case 1:{
							if (m1.sim1present()) {
								System.out.println("sim 1 is present");
							}
							else
								System.out.println("sim 1 is not present");
						break;}
						case 2:{
							if (m1.sim2present()) {
								System.out.println("sim 2 is present");
							}
							else
								System.out.println("sim 2 is not present");
						break;}
						}
					break;}
					case 4:{
						System.out.println("1.Details of sim1\n2.Details of sim2");
						int sim=s.nextInt();
						switch(sim) {
						case 1:{
							if(m1.sim1present())
								m1.s1.detailsOfim();
							else
								System.out.println("Details of sim 1 is not present");
						break;}
						case 2:{
							if(m1.sim2present())
								m1.s2.detailsOfim();
							else
								System.out.println("Details of sim 2 is not present");
						break;}
						}
					break;}
					case 5:{
						m1.detailsofmobile();
					break;}
					case 6:{
						b=false;
						System.out.println("*** THANK YOU ***");
					break;}
				}
		   
		}while(b);
	}
	}


