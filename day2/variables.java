package day2;
class test{
	   static int data =30;// static variable(class level scope and can be used in other classes also)
}
public class variables {
	int myVariable1 =20; //instance variable(class level scope but only be used in same class where declared)
	int myVariable2 =30;

	   
	   public static void main(String args[]){
	      int a = 100;// local variables (method level scope)
	      variables obj = new variables();
	      
	      System.out.println("Value of instance variable myVariable: "+(obj.myVariable1+obj.myVariable2));
	      System.out.println("Value of static variable data: "+test.data);
	      System.out.println("Value of local variable a: "+a);

}}