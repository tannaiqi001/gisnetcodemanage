package 模式二.工厂方法;

public class Client {
	public static void main (String [] args){
		FruitGardener fruitgardener1,fruitgardener2,fruitgardener3;
		fruitgardener1=new AppleGardener();
		fruitgardener2=new GrapeGardener();
		fruitgardener3=new StrawberryGardener();
		
		Fruit fruit1,fruit2,fruit3;;
		fruit1=fruitgardener1.factory();
		fruit2=fruitgardener2.factory();
		fruit3=fruitgardener3.factory();
		
		fruit1.plant();
		fruit1.grow();
		fruit1.harvest();
		
		fruit2.plant();
		fruit2.grow();
		fruit2.harvest();
		
		fruit3.plant();
		fruit3.grow();
		fruit3.harvest();
		
		
	}

}
