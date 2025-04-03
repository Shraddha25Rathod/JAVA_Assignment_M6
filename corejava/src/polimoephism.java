
class birds
{
	public void sound()
	{
		System.out.println("Birds make sound");
	}
}
class crow extends birds
{
	public void sound()
	{
		System.out.println("The crow kaaakaaa");
	}
}
class peacock extends birds
{
	public void sound()
	{
		System.out.println("The peacock tehuktehuk");
	}
}
public class polimoephism 
{
	public static void main(String[] args)
	{
		birds B;
		
		B = new crow();
		B.sound();
		
		B = new peacock();
		B.sound();
	}
}
