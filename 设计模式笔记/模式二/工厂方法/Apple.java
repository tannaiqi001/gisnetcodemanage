package 模式二.工厂方法;

public class Apple implements Fruit {
	/**
	 * 树龄
	 */
	private int treeAge;

	@Override
	public void grow() {
		// TODO Auto-generated method stub
	System.out.println("苹果生长");	

	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("苹果收获");

	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("苹果种植");

	}
/**
 * 取得树龄
 * @return 树龄
 */
	public int getTreeAge() {
		return treeAge;
	}
/**
 * 设置树龄
 * @param treeAge 树的年龄
 */
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
