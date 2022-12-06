
class Bulb implements ESwitchIF
{
   String brand;
   float price;
  public Bulb(String brand,float price)
  {
	  super();
	  this.brand=brand;
	  this.price=price;
  }
  public void switchON()
  {
	  System.out.println("Given implementation in child class");
	  System.out.println(brand+" "+"Bulb produces light");
  }
  public void switchOFF()
  {
	  System.out.println("Given implementation for switchoff method");
	  System.out.println("Now Bulb is turning OFF");
  }
  public void show()
  {
	  System.out.println("Bulb brand is "+brand);
	  System.out.println("Bulb price is "+price);
  }
	public static void main(String[] args) 
	{
       Bulb b=new Bulb("Havells",120);
       b.show();
       b.switchON();
       b.switchOFF();
	}

}
