package 模式四.单例模式.懒汉式单例模式;

public class Client {
public static void main(String[] args)
 {
	lazySingleton m_instance=lazySingleton.getInstance();
	m_instance.textout();
 }
}
