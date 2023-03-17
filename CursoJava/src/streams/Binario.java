package streams;
public class Binario 
{

	public static void main(String[] args) 
	{
				int x=13;
				int r=0;
				String b="";
				System.out.println("x:"+x);
				b=Integer.toBinaryString(x);
				System.out.println("b:"+b);
				System.out.println("conferindo:"+Integer.parseInt(b,2));
				System.out.println("......");
				//Operador shift
				r=x<<1;
				System.out.println("r:"+r);
				b=Integer.toBinaryString(r);
				System.out.println("b:"+b);
				System.out.println("conferindo: "+Integer.parseInt(b,2));
				System.out.println("......");
				r=x<<1;
				System.out.println("r: "+r);
				b=Integer.toBinaryString(r);
				System.out.println("b: "+b);
				System.out.println("conferindo: "+Integer.parseInt(b,2));
					
				
				

			}

		

	}