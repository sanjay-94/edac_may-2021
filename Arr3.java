import java.util.*;
public class Arr3
{ 
public static void main(String args[])
{
/*ArrayList<Integer> a= new ArrayList <Integer> (11);	
a.add(10);
a.add(12);
a.add(20);
a.add(30);
a.add(25);
a.add(40);
a.add(32);
a.add(31);
a.add(35);
a.add(50);
a.add(60);
System.out.println(a+" "); 
for(int i=3;i<=8;i++)
System.out.print(a+" ");*/



int input[] =new int[11];
input[0]=10;
input[1]=12;
input[2]=20;
input[3]=30;
input[4]=25;
input[5]=40;
input[6]=32;
input[7]=31;
input[8]=35;
input[9]=50;
input[10]=60;
for(int i=0;i<=10;i++)
{
System.out.println(" "+input[i]+" ");
}
for(int i=3;i<=8;i++)
System.out.print(input[i]+" , ");
System.out.print(" ");
}
}