package 模式四.单例模式.饿汉式单例模式;

public class EagerSingleton 
{
/**
 * 私有构造子
 */
	private EagerSingleton(){}
/**
 * 静态常量m_instance ，这是一个EagerSingleton对象的引用。
 */
	private static final EagerSingleton m_instance= new EagerSingleton();
	
/**
 * 静态工厂方法。 返回一个新创建的静态变量，m_instance，该变量是一个EagleSingleton对象的引用。
 * @return 新创建对象的一个引用。
 */
    public static EagerSingleton getInstance(){
		return m_instance;
	}

    public void textOut()
    {
    	System.out.println("测试通过");
    }
}
