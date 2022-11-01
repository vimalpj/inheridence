package INHERITENCE;
class showroom
{
   // int Model;
   // String Name;
	public  void Honda(int a,String b) 
	{
		// TODO Auto-generated method stub
		//Model=a;
		//Name=b;
		System.out.println(a+b);            
	}	
	
       	
}
class showroom1 extends showroom
{
    String name;
    int model;
    void Tvs(String a,int b) 
    {
	// TODO Auto-generated method stub
	name=a;
	model=b;
	System.out.println(name+"-"+model+"cc");
    }	
}
public class singel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        showroom1 Hero=new showroom1();
        Hero.Honda(125,"Splender");
        Hero.Tvs("appache",1260);
	}
}
