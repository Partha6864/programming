class Driver
{
	public static void main(String[]args) 
	{
		Account ob=new Account(1234,"Sita");
		ob.setpsd(7694);
		System.out.println(ob.getpsd());
		//comments
	}
}
class Account
{
  private int psd;
  String Acholder;
  Account(int psd,String Acholder)
  {
	  this.psd=psd;
	  this.Acholder=Acholder;
  }
  public void setpsd(int psd)
  {
	  this.psd=psd;
	  System.out.println("Change Password");
  }
  public int getpsd()
  {
	  return psd;
  }
}