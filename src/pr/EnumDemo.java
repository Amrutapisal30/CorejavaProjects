package pr;
enum Student
{
John(11), Bella(10), Sam(13), Viraaj(9);
public int age; //age of students
int getage() 
{
	return age; 
}

Student(int age)
{
this.age= age;
}
}
public class EnumDemo {
	public static void main( String args[] )
	{
	Student S;
System.out.println("Age of Viraaj is " +Student.Viraaj.getage()+ "years");
	}
}
