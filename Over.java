import java.io.*;
public class Over{
public static void main(String as[]){

int val1=30;
int val2=35;
int result=addValues(val1,val2);
System.out.println("Addition of two numbers " +result);

String s1="13";
String s2="12";
int result1=addValues(s1,s2);
System.out.println("Float of Values " + result1);

}
//this is a sample comment
private static int addValues(int i1,int i2)
{
return i1 + i2;
}
private static int addValues(String f1,String f2)
{
int value1=Integer.parseInt(f1);
int value2=Integer.parseInt(f2);
return value1+value2;

}








}
