package pr;
interface Moveable1
{
	public boolean ismove();
}
interface Rollable1
{
	public boolean isroll();
	
}
 class Tyre implements Moveable1,Rollable1
{
	int width;
	public boolean ismove()
	
	{
	return true;
	}
	public boolean isroll()
	{
	return true;
	}
	public static void main(String[] args)
	{
		Tyre tr=new Tyre();
		System.out.println(tr.ismove());
		System.out.println(tr.isroll());
	}

}
