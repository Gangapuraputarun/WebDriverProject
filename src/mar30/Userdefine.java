package mar30;

public class Userdefine {
	public static void addition(int a,int b) {
		int c= a+b;
		System.out.println(c);
		
	}
	public String verifyString(str1,str2){
		String res;
		if(str1.equalsIgnoreCase(str2)) {
			res = "both strings are equal";
		}
		else
		{
			res = "both strings are not equal";
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
