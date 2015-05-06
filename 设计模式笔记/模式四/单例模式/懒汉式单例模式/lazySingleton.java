package 模式四.单例模式.懒汉式单例模式;

public class lazySingleton {
/**
 * 私有构造子
 */
	public lazySingleton() {}
/**
 * 指向lazysingleton对象的一个引用。	
 */
private static lazySingleton  m_instance=null;

/**
 * 静态方法。返回一个m_instance引用，该引用指向唯一的lazySingleton对象。
 * @return 唯一的指向lazySingleton对象的引用。
 */
synchronized public static lazySingleton getInstance(){
	if(m_instance==null)
	{
		m_instance= new lazySingleton();
	}
	return m_instance;
}

public void textout(){
	System.out.println("测试通过");
}
	

}
