package ajayS;

public class SwaptwoNumberWithoutThird {
void swap(int x,int y){
	
	System.out.println("before swap X is " + x + " and Y is " + y);
	x= x+y;
	y = x-y;
	x=x-y;
	System.out.println("after swap X is " + x + " and Y is " + y);
}
	
public static void main (String [] args ){
	SwaptwoNumberWithoutThird swaptwoNumberWithoutThird =  new SwaptwoNumberWithoutThird();
	swaptwoNumberWithoutThird.swap(65,89);
}

}
