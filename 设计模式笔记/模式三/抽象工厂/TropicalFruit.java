package 模式三.抽象工厂;

public class TropicalFruit implements Fruit {
	/**
	 * 热带水果类
	 */
    private String name;
    /**
     * 热带水果的名字的get方法，用于取得热带水果的名字。
     * @return
     */
	public String getName() {
		return name;
	}
    /**
     * 热带水果的名字的set方法，用于设置热带水果的名字
     * @param name 要设置的热带蔬菜的名字。
     */
	public void setName(String name) {
		this.name = name;
	}
	public TropicalFruit(String name) {
		super();
		this.name = name;
	}

}
