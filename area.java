package function;

class rectangle 
{
	int l, b;
	
	rectangle(int length, int breath)
	{
		l = length;
		b = breath;
	}
	
	public void calculateArea()
	{
		System.out.println("area is"+(l*b));
	}
	
}

public class area
{
	int rect;
	public static void main(String [] args)
	{
		
        rectangle rect = new rectangle(10,20);
        rect.calculateArea();	
	}
}