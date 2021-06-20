import java.util.*;

 class Arr4
{
public static void main(String args[])
{
    /*	for(int c=0;c<=4;c++)
	{
System.out.println("enter the array");
Scanner a=new Scanner(System.in);
int b=a.nextInt();
	}*/
 int arr[]=new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
for(int i=0;i<=4;i++)
{
System.out.print(" "+arr[i]);

 arr[0]=arr[4];
System.out.print(" "+arr[i]);
}
}
}