package 模式二.工厂方法;

public class GrapeGardener implements FruitGardener {

	/**
	 * 葡萄的工厂方法
	 */
	@Override
	public Fruit factory() {
		// TODO Auto-generated method stub
		return new Grape();
	}

}
