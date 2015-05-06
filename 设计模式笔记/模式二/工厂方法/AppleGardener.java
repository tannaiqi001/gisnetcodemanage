package 模式二.工厂方法;

public class AppleGardener implements FruitGardener {
/**
 * 苹果的工厂方法
 */
	@Override
	public Fruit factory() {
		// TODO Auto-generated method stub
		return new Apple();
	}

}
