package pr;
class Author
{
	String authorname;
	int age;
	String place;
	public
	Author(String name,int a,String p)
	
	{
		this.authorname=name;
		this.age=a;
		this.place=p;
	}
	public String getAuthorname()
	{
		return authorname;
	}
	public int getAge ()
	{
		return age;
	}
	public String getPlace()
	{
		return place;
	}
	 
}
class Book
{
	String name;
	int price;
	Author auth;
	Book(String n,int p,Author at)
	{
	this.name=n;
	this.price=p;
	this.auth=at;
	}
	public void showDetail()
	{
	System.out.println("Book is"+name);
	System.out.println("price "+price);
	System.out.println("Author name is "+auth.getAuthorname());
	System.out.println("Author age  is "+auth.getAge());
	System.out.println("Author place is "+auth.getPlace());
	}
}
public class Aggregation {
	public static void main(String args[])
	{
	Author ath=new Author("Me",22,"India");
	Book b=new Book("Java",550,ath);
	b.showDetail();
	}

}
