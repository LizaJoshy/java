package hierarchical;

public class Child extends School {
	public void display2(String name)
	{
		System.out.println(name);
		
	}
	public static void main(String args[])
	{
		Child s = new Child ();
		s.display("st xaviers");
		s.display2("liza");
		
		
	}
	}

