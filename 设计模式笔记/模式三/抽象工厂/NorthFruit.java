package 模式三.抽象工厂;
/**
 * 北方水果类
 * @author voyo
 *
 */
public class NorthFruit implements Fruit {
	/**
	 * 北方水果类的名字
	 */
	private String name;
    /**
     * 北方水果类名字的get方法。取得北方水果类的名字。
     * @return 北方水果类的名字。
     */
	public String getName() {
		return name;
	}

	/**
	 * 北方水果类名字的set方法，用于设置北方水果类的名字。
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
    /**
     * 北方水果类的构造方法。
     * @param name
     */
	public NorthFruit(String name) {
		super();
		this.name = name;
	}
	

}
