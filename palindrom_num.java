package misce1;

public class palindrom_num {

	public static void main(String[] args) 
	{
int num =153;
int a=num;
int c=0;
while(a>0) 
{
	int b=a%10;
	c=(c*10)+(b);// for armstrong c=c+(b*b*b)
	a=a/10;
	
}
if(num==c)
{
	System.out.println("armstrong");
}
else
{
	System.out.println("not armstrong");
}
	}

}
