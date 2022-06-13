interface animal{
	void eat();
}
class goat implements animal
{
	
	private String animal_type = "Goat";
	public goat()
	{
		System.out.print("\nNew "+this.animal_type+ " created ");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("\t This "+this.animal_type+ " is eating \n");

	}
	
}
class cow implements animal
{
	
	private String animal_type = "Cow";
	public cow()
	{
		System.out.print("\n New "+this.animal_type+ " created");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("\t This "+this.animal_type+ " is eating \n");

	}
	
}
class dog implements animal
{
	
	private String animal_type = "Dog";
	public dog()
	{
		System.out.print("\n New "+this.animal_type+ " created ");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("\t This "+this.animal_type+ " is eating \n");

	}
	
}
public class animal_interface {
	
	public static void main(String args[])
	{
		System.out.print("   \t****************************\n      \t Animal interface classes \n          \t203j11 \n   \t***************************\n\n");
		goat g = new goat();
		g.eat();
		cow c = new cow();
		c.eat();
		dog d = new dog();
		d.eat();
	}
}
