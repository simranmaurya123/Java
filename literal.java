import java.lang.*;

class literal
{

	public static void main(String arg[])

	{

	byte b1=10;
	byte b2=0b1010;
	byte b3=012;
	byte b4=0XA;

	long l=1_111_111_111_111_111L;
	System.out.println("long : " +l);

	float f=1_255_473.56F;
	double d=12.56;

	System.out.println("float: " +f);
	System.out.println("double: " + d);	

	System.out.println("integer form:" +b1);
	System.out.println("binary code was 0b1010 converted into: "+b2);
	System.out.println("octal converted into number: "+b3);
	System.out.println("Hexadecimal converted into integer: " +b4);

	}
}