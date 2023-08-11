package project;
import java.util.Scanner;
public class miniapp {
		static Scanner s=new Scanner(System.in);
		static boolean b=true;
		static boolean c=true;
		static boolean d=true;
		static boolean e=true;
		static boolean aa=true;
		static boolean E=true;
		public static void main(String args[])throws Exception
		{
			do{
				System.out.println("\t\t\t------------> *WELCOME TO MY APPLICATION*  <--------------------------");
				System.out.println("select the input");
				System.out.println("\t-->Wait a Min<--");
				Thread.sleep(2000);
				System.out.println("   1.part-1 \n\t===> 1-SwiggyHotel 2-NumbersProgram 3-Exit");
				Thread.sleep(2000);
				System.out.println("   2.part-2 \n\t===> 1-InsertorRemoveSim 2-Add&RemoveBall 3-Exit");
				Thread.sleep(2000);
				System.out.println("   3.AboutUs \n\t===> 1-QSpider 2-Creator 3-Exit");
				Thread.sleep(2000);
				System.out.println("   4.exit");
				System.out.println("\t->NOW CHOOSE WHAT YOU WANT<-");
				int input=s.nextInt();
				switch (input)
					{
				case 1:{
						do{
						System.out.println("select the input");
						Thread.sleep(3000);
						System.out.println("\n1.swiggy(ORDER YOUR FOOD)\n2.number program\n3.IF You Don't Want Anything please Exit");
						int input2=s.nextInt();
						switch (input2)
							{
							case 1:{
										System.out.println("\t\t\"******Welcome to Swiggy******\"\n");
										System.out.println("Select the Hotel\n");
										System.out.println("1.Al-Safa\n2.S.S Hydrabadi\n3.Eat's of Arab\n4.Exit");
										int user_hotel=s.nextInt();//1
										boolean E=true;
										do{
										switch (user_hotel)
										{
										case 1:{
											//We are now inside Al-safa Hotel
													System.out.println("Thank you for selecting Al-Safa\n");
													System.out.println("Please select Your Food\n");
													System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n");
													int food=s.nextInt();//1
													switch (food)//1
													{
														case 1:{
																	//trying to order chicken Biryani
																	double price=180;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(2000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Model\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount=s.nextDouble();
																		if(bill==user_amount)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);//
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 15 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}
																	

														break;}
														case 2:{
																	//trying to order mutton Biryani
																	double price=250;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(3000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Mode\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount=s.nextDouble();
																		if(bill==user_amount)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);//
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 15 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}

														break;}
													}
											break;}
											case 2:{
																	//We are now inside S.S Hydrabadi Hotel
													System.out.println("Thank you for selecting hydrabadi \n");
													System.out.println("Please select Your Food\n");
													System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n");
													int food1=s.nextInt();//1
													switch (food1)//1
													{
														case 1:{
																	//trying to order chickeb Biryani
																	double price=180;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(3000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Mode\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount1=s.nextDouble();
																		if(bill==user_amount1)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);//
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 15 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}

														break;}
														case 2:{
																	//trying to order mutton Biryani
																	double price=300;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(3000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Mode\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount=s.nextDouble();
																		if(bill==user_amount)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);//
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 15 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}

														break;}
													}
											break;}
											case 3:{
																	//We are now inside eats of arab Hotel
													System.out.println("Thank you for selecting arab hotel \n");
													System.out.println("Please select Your Food\n");
													System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n");
													int food3=s.nextInt();//1
													switch (food3)//1
													{
														case 1:{
																	//trying to order chickeb Biryani
																	double price=180;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(3000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Mode\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount=s.nextDouble();
																		if(bill==user_amount)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);//
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 10 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}

														break;}
														case 2:{
																	//trying to order mutton Biryani
																	double price=350;
																	System.out.println("Please Select The Quantity..");
																	int qty=s.nextInt();//2
																	double bill=qty*price;
																	System.out.println("Processing Your Request....");
																	Thread.sleep(3000);
																	System.out.println("Please Enter the Total Bill Amount :"+bill);
																	Thread.sleep(2000);
																	System.out.println("\t\tPlease Select Your Payment Mode\n");
																	System.out.println("1.Google Pay\n2.Phone-Pay\n");
																	int payment_mode=s.nextInt();//1
																	if(payment_mode==1||payment_mode==2)
																	{
																		//Google Pay
																		System.out.println("Enter The Amount");
																		double user_amount=s.nextDouble();
																		if(bill==user_amount)
																		{
																			//Generate OTP
																	double sys_otp=Math.random()*9999+9999;
																			int otp=(int)sys_otp;
																			System.out.println("Enter The OTP");
																			Thread.sleep(3000);
																			System.out.println("Please Enter This otp:"+otp);
																			int user_otp=s.nextInt();
																			if(user_otp==otp)
																			{


																				System.out.println("\t\tOrder Placed Succesfully..\n");
																				System.out.println("\t\tWill Be Delivered in 30 Min"+(char)2+(char)2+(char)2);
																			}

																		}
																	}

														break;}
													}
											break;}
											case 4:{
												System.out.println((char)2+"THANKYOU"+(char)2);
												E=false;
												break;
											}
																	
																	
										
										}
										}while(E);
									break;
									}
							case 2:{
									do{
									System.out.println("\n1.palindrome\n2.strong number\n3.ArmStrong\n4.fibonacci\n5.exit");
									int number=s.nextInt();
									switch (number)
										{
										case 1:{
												System.out.println("enter the number:");
												int palindrome=s.nextInt();
												int rev=0,temp=palindrome;
												while(palindrome>0){
													rev=rev*10+(palindrome%10);
													palindrome=palindrome/10;
												}
												if(rev==temp)
													System.out.println("palindrome");
												else
													System.out.println("The number is not a palindrome");

												break;
												}
										case 2:{
												System.out.println("Enter the number:");
												int given=s.nextInt(),temp=given,product=1,last=0,sum=0;
												while(given>0){
													//product=1;
													last=given%10;//145%10=5,14%10=4,1%10=1
													for(int i=1;i<=last;i++){
														product=product*i;
													}
													sum=sum+product;//120,24,1
													product=1;
													given=given/10;//145/10=14,14/10=1,1/10=0
												}
												String res=(sum==temp)?"The given number is strong":"The given number is not a strong";
												System.out.println(res);
												break;
												}
										case 3:{
												System.out.println("Enter the number");
												int num=s.nextInt();
												int la=0,co=0,su=0,tem=num,pro=1;
												while(num>0){
													        num/=10;
														    co++;
														   }
														   num=tem;
														   while(num>0){
															la=num%10;
															for(int i=1;i<=co;i++){
																pro=pro*la;
															}
																su+=pro;
																pro=1;
																num/=10;
														    }
												String res=(tem==su)?" The given number is ARM STRONG":" The given number is NOT A ARM STRONG";
												System.out.println(res);
												break;
												}
										case 4:{
												System.out.println("enter the number 1:");
												int no1=s.nextInt();
												System.out.println("enter the number 2:");
												int no2=s.nextInt();
												System.out.println("enter the number 3:");
												int no3=s.nextInt();
												for(int i=1;i<=8;i++)
												{
													no3=no1+no2;
													System.out.print(no3+" ");
													no1=no2;
													no2=no3;
												}
												break;
												}
										case 5:{
												System.out.println("thankyou");
												aa=false;
												break;
												}
										}
										}while(aa);
										break;
										}
										case 3:{
												System.out.println("thankyou");
												c=false;
												break;
												}
						
							}
						}while(c);
						break;
						}
				case 2:{
						do{
						System.out.println("select the input");
						System.out.println("1.insert&removesim\n2.ball&bag\n3.exit");
						int input3=s.nextInt();
						switch(input3)
							{
								case 1:{
									users.main(args);
									break;
										}
								case 2:{
										bagball.main(args);
										break;
										}
								case 3:{
										System.out.println("thankyou");
										d=false;
										break;
										}
							}
						
						}while(d);
						break;
						}
				case 3:{
						do{
						System.out.println("--------->"+(char)2+"about us"+(char)2+"<------------");
						System.out.println("select the input");
						System.out.println("1.Q-SPIDER\n2.CREATOR\n3.EXIT");
						int input4=s.nextInt();
						switch(input4)
							{
								case 1:{
									System.out.println("select the input");
									System.out.println("1.DEVELOPMENT\n2.TESTING\n3.DATABASE\n4.EXIT");
									int institude=s.nextInt();
									switch(institude)
										{
											case 1:{
													System.out.println("Development professor name:MR.Tabrez");
													break;
													}
											case 2:{
													System.out.println("Manual Testing professor name:MR.Harsha He is very good person our teaching level also very nice and friendly professor");
													System.err.println("Automation selenium with java professor name is:MR.vijay velan");
													break;
													}
											case 3:{
													System.out.println("Database professor name:MR.Bharath");
													break;
													}
											case 4:{
													System.out.println("thank you");
													break;
													}			
										}
										break;
										}
								case 2:{
										System.out.println((char)2+(char)2+"JEEVA"+(char)2+(char)2);
										break;
										}
								case 3:{
										System.out.println("thank you");
										e=false;
										break;								
										}
							}	
						}while(e);
						break;
						}
						case 4:{
								System.out.println("THANK YOU");
								b=false;
								break;
								}
								
				
					}
				}while(b);
			}
				


	}


