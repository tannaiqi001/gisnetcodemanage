package 模式五.建造模式;

public class Concrete extends Builder {

	private Product product=new Product();
	@Override
	public void buildpart1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildpart2() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product receivereResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
