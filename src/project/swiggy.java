package project;
import java.util.Scanner; 

public class swiggy {
		static Scanner s=new Scanner(System.in);
		public static void main(String[] args) throws Exception
		{
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
						System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n3.exit");
						int food=s.nextInt();//1
						switch (food)//1
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
							case 3:{
								System.out.println((char)2+"THANKYOU"+(char)2);
								break;
							}
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
			
		}
	}



