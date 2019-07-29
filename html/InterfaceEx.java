interface X
{
	int a = 10;
	void add();
	void sub();
}

interface Y
{
	int b = 5;
	void mul();
	void div();
}

interface Z extends X,Y{

}

class Calculator implements Z
{
	public void add()
	{
		System.out.println(X.a+Y.b);
	}
	public void sub()
	{
		System.out.println(Z.a-Z.b);
	}
	public void mul()
	{
		System.out.println(X.a*Y.b);
	}
	public void div()
	{
		System.out.println(X.a/Y.b);
	}
}

public class InterfaceEx
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();

		X x1 = c;
		x1.add();
		x1.sub();
		System.out.println("--------");

		Y y1 = c;
		y1.mul();
		y1.div();
		System.out.println("--------");

		Z z1 = c;
		z1.add();
		z1.sub();
		z1.mul();
		z1.div();
		System.out.println("--------");
	}
}