package INHERITENCE;
class father 
{    
	        int age=55;
		    int weight=65;
		    String name ="jayaram";
	void father1()
	   {
		    String name ="jayaram";
		  System.out.println("FATHER AGE-"+age);
		    System.out.println("FATHER WEIGHT-"+weight);
		    System.out.println("FATHER NAME-"+name);
	   }    
} 
class son1 extends  father
{    
	   void son2(String a,int b,int c)
	   {
		    String name =a;
		    int age=b;
		    int weight=c;   
		    System.out.println("son NAME-"+a);
		    System.out.println("son AGE-"+b);
		    System.out.println("son WEIGHT-"+c);
		    
	   }    
} 
class son2 extends  father
{    
	   void son3(String a,int b,int c)
	   {
		    String name =a;
	 	    int age=b;
		    int weight=c;
		    System.out.println("son2 NAME-"+a);
		    System.out.println("son2 AGE-"+b);
		    System.out.println("son2 WEIGHT-"+c);
		    
	   }   
}
public class hierarchical {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
        son1 ss=new son1();
        son2 sk=new son2();
        ss.son2("Balan", 29, 70);
        sk.son3("vimal",27,56);
        ss.father1();
	}
}
