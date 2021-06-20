import java.util.*;
class Array
{
public static void main(String args[])
{
int [] a=new int[10];
/*a.add=1;
a.add=2;
a.add=3;
a.add=4;
a.add=5;
a.add=6;
a.add=7;
a.add=8;
for(int i=0;i<=9;i++)
{
System.out.println(" enter the elements of array");
Scanner b=new Scanner(System.in);
int c=b.nextInt();
}*/
a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
a[4]=5;
a[5]=6;
a[6]=7;
a[7]=8;
a[8]=9;
a[9]=10;
for(int i=0;i<=9;i++)
{
System.out.print(" "+a[i]);

int d=10/2;
System.out.print(" "+d);
}

for(int i=0;i<=4;i++)
{
System.out.print(" "+a[i]);
}
 

for(int i=5;i<=9;i++)
{
for(int i=0;i<=4;i++)
{
System.out.print(" "+a[i]);
}
}
}
}