package 模式二.工厂方法;

public class Grape implements Fruit {
    /**
     *  是否有籽
     */
	private boolean seedLess;
	@Override
	public void grow() {
		// TODO Auto-generated method stub
       System.out.println("葡萄在生长");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("葡萄收获");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("葡萄种植");
	}

	/**
	 * 取得葡萄是否有籽
	 * @return 如果有籽返回true。
	 */
	public boolean isSeedLess() {
		return seedLess;
	}
	/**
	 * 设置葡萄是否有籽
	 * @param seedLess 是否有籽，true 有籽，false 没籽
	 */

	public void setSeedLess(boolean seedLess) {
		this.seedLess = seedLess;
	}

}
