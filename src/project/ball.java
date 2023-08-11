package project;
public class ball 
{
	//states
	private double radius;
	
	//Const
	ball(){
		//L.I
	}
	ball(double radius){
		//L.I
		this.radius=radius;
	}
	//Behaviours
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
}
class BasketBall extends ball 
{
	//states
	String game="BasketBall";

	//Const
	BasketBall(){
		super(15);
		//L.I
	}
	
}
class TennisBall extends ball 
{
	//States
	String game="Tennis";
	//Const
	TennisBall(){
		super(5);
		//L.I
	}
}
class Bag 
{
	//Aggregation(Lazy Instantiation)
	ball ball;					//here ball acts like ref

	Bag(){
		//L.I
	}

	//Behaviours
	public void addBall(ball ball){
	
		if(this.ball==null){
			//adding the ball into the bag
			this.ball=ball;
			System.out.println("Ball Added Succesfully");
		}else{
			//Already ball is Present
			System.out.println("Already Ball Is Present Inside The Bag");
		}
	}
	public void removeBall(){
		
		if(this.ball!=null){
			//If Bag Contains Ball
			this.ball=null;
			System.out.println("Ball Removed Succesfully");
		}else{
			//Bag Does'nt Contains Ball
			System.out.println("Thier is No Ball To Remove");
		}
	}
	public boolean isBagEmpty()	{
		//true means bag is empty
		if(this.ball==null){
			return true;
		}else{
			return false;
		}
	}
	public void showGame(){
		
		if(this.ball==null){
			System.out.println("No Game is Being Played");
		}else if(this.ball instanceof BasketBall){
			//Basket Ball is Present
			BasketBall basket_ball=(BasketBall)ball;
			System.out.println("Currently "+basket_ball.game+" is Being Played");
		}else if(this.ball instanceof TennisBall){
			//Tennis Ball is Presnt
			TennisBall tennis_ball=(TennisBall)ball;
			System.out.println("Currently "+tennis_ball.game+" is Being Played");
		}
	}
}

