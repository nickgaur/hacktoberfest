import java.util.*;
class sum
{
	public int add(int a,int b)
	{
		return (a+b);
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	public double add(double a,double b)
	{
		return (a+b);
	}
	public static void main(String args[])
	{
		sum obj=new sum();
		System.out.println(obj.add(5,9));
		System.out.println(obj.add(5,9,11));
		System.out.println(obj.add(5.0,9.0));
	}
}
