package INHERITENCE;
class HeroHonda3
{
       void bikecolour(String a)
       {
    	   String bikecolor=a;
    	   System.out.println("BIKE COLOR-"+a);
       }
}
class HeroHonda2 extends HeroHonda3
{
       void bikeprice(int a)
       {
    	   int bikerate=a;
    	   System.out.println("BIKE PRICE-"+bikerate);
       }
}
class HeroHonda1 extends HeroHonda2
{
       void bikecc(int a)
       {
    	   int bikecc=a;
    	   System.out.println("BIKE CC-"+a);
       }
}
class HeroHonda extends HeroHonda1
{    
	   void bikename(String a)
	   {
		    String name =a;
		    System.out.println("BIKE NAME-"+a);
	   }    
} 
public class multilevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HeroHonda hh=new HeroHonda();
        hh.bikename("HeroHonda");
        hh.bikecc(125);
        hh.bikeprice(150000);
        hh.bikecolour("RED");
	}
}
