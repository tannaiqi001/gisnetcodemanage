package 模式二.工厂方法;

public class StrawberryGardener implements FruitGardener {

	/**
	 * 草莓的工厂方法
	 */
	@Override
	public Fruit factory() {
		// TODO Auto-generated method stub
		return new Strawberry();
	}

}
