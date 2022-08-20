package pr;
class Bank
{
	public
	  float getRateOfInterest()
	  {
		return 0;
	 }
}
class SBI extends Bank
{
	public
	  float getRateOfInterest()
	  {
		return 8.4f;
	  }
}
class ICICI extends Bank
{
	public
	  float getRateOfInterest()
	  {
		return 7.3f;
	  }
}
class AXIS extends Bank
{
	public
	  float getRateOfInterest()
	  {
		return 9.7f;
		
	  }
}
public class TestPolymorphism {
	public static void main(String[] args)
	{
		Bank b=new Bank();
		
		System.out.println(b instanceof Bank);
		b=new SBI();
		System.out.println("SBI rate of intrest= "+b.getRateOfInterest());
	    
		b=new ICICI();
		System.out.println("ICICI rate of intrest= "+b.getRateOfInterest());
		
		b=new AXIS();
		System.out.println("AXIS rate of intrest= "+b.getRateOfInterest());
			
	
	}

}
