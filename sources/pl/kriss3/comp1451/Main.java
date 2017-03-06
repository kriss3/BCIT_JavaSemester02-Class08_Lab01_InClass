package pl.kriss3.comp1451;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		run();
	}
	
	private static void run()
	{
		
		ArrayList<Animal> anim = new ArrayList<>();
		anim.add(new Cat());
		anim.add(new Husky());
		
		Object[] animObj = anim.toArray();
		
		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Husky();
		
		
		for(Object a : animObj)
		{
			Animal n = (Animal)a;
			n.eat();
			n.speak();
			n.move();
		}
		
		System.out.println();
		
		
		for(int i=0; i<animals.length; i++)
		{
			animals[i].eat();
			animals[i].move();
			animals[i].speak();
		}
		
		
		System.out.println("finish");
		
	}
}
