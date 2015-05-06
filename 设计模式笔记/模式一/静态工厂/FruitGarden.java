package 模式一.静态工厂;

public class FruitGarden {
	/**
	 * 静态工厂方法
	 */

	public static Fruit factory(String which) throws BadFruitException {
		if(which.equalsIgnoreCase("苹果"))
		{
			return new Apple();
		}else if(which.equalsIgnoreCase("葡萄"))
		{
			return new Grape();
		}else if(which.equalsIgnoreCase("草莓"))
		{
			return new Strawberry();
		}else
		{
			throw new BadFruitException("所给参数不在范围");
		}
	}
}
