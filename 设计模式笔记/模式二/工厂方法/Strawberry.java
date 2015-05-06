package 模式二.工厂方法;

public class Strawberry implements Fruit {

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("草莓生长");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("草莓收获");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("草莓种植");
	}

}
