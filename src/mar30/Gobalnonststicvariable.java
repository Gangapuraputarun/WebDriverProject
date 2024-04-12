package mar30;

public class Gobalnonststicvariable {
	int x,y,z;
	public void add()
	{
		x=8958;
		y=85461;
		z=x+y;
		System.out.println(z);
	}
	public void divison(){
		x=9875;
		y=76;
		z=x/y;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		Gobalnonststicvariable a =new Gobalnonststicvariable();
		a.add();
		a.divison();

	}

}
