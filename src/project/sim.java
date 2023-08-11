package project;
public class sim {
	String operator_name;
	double call_rate;
	String bandwidth;
	long ph_no;
	sim(String string, String string2, double d, int i){
	}
	sim(String opname,double cr,String bw,long ph_no){
		operator_name=opname;
		this.bandwidth=bw;
		call_rate=cr;
		this.ph_no=ph_no;
	}
	public void detailsOfim() {
		System.out.println("sim name"+operator_name);
		System.out.println("sim bandwidth"+bandwidth);
		System.out.println("sim callrate"+call_rate);
		System.out.println("sim phone number"+ph_no);
	}
}
class mobile{
	String name,color,storage;
	long price;
	sim s1;
	sim s2;
	mobile(){
	}
	mobile(String name,String color,String storage,long price){
		this.name=name;
		this.color=color;
		this.storage=storage;
		this.price=price;
	}
	public void addsim1(sim s1) {
		if(this.s1==null) {
			this.s1=s1;
			System.out.println("sim 1 insect sucessfully");
		}
		else
			System.out.println("alredy sim 1 is insected");
	}
	public void addsim2(sim s2) {
		if(this.s2==null) {
			this.s2=s2;
			System.out.println("sim 2 insect sucessfully");
		}
		else
			System.out.println("alredy sim 2 is insected");
	}
	public void removesim1(sim s1) {
		if(this.s1!=null) {
			this.s1=s1;
			System.out.println("sim 1 removed successfully");
		}
		else
			System.out.println("sim 1 is not available");
	}
	public void removesim2(sim s2) {
		if(this.s2!=null) {
			this.s2=s2;
			System.out.println("sim 2 removed successfully");
		}
		else
			System.out.println("sim 2 is not available");
	}
	public boolean sim1present() {
		if(this.s1!=null) {
			return true;
		}
		else
			return false;
	}
	public boolean sim2present() {
		if(this.s2!=null) {
			return true;
		}
		else
			return false;
	}
	public void detailsofmobile() {
		System.out.println("Mobile name:"+this.name);
		System.out.println("Mobile color"+this.color);
		System.out.println("Mobile Storage"+this.storage);
		System.out.println("Mobile Price"+this.price);
	}
	public void addSim2(sim sim) {
		// TODO Auto-generated method stub
		
	}
	public void removeSim1() {
		// TODO Auto-generated method stub
		
	}
	public void removeSim2() {
		// TODO Auto-generated method stub
		
	}
	
}
