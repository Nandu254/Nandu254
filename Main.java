class student
{
	int rollno;
	String name;
	double marks;
	void display()
	{
		System.out.println("Roll : "+rollno + "Name : "+name);
	}
}
		public class Main
		{
			public static void main(String[]args)
			{
				student s1=new student();
				s1.rollno=131;
				s1.name="Nandu";
				s1.marks=100;
				s1.display();
			}
		}