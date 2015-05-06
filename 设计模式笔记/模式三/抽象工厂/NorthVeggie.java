package 模式三.抽象工厂;
/**
 * 北方蔬菜
 * @author voyo
 *
 */
public class NorthVeggie implements veggie {
	/**
	 * 北方蔬菜的名字
	 */
private String name;
/**
 * 北方蔬菜的名字的get方法，用于取得北方蔬菜的名字
 * @return北方蔬菜的名字
 */
public String getName() {
	return name;
}
/**
 * 设置北方蔬菜的名字
 * @param name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * 
 * @param name
 */
public NorthVeggie(String name) {
	super();
	this.name = name;
}

}
