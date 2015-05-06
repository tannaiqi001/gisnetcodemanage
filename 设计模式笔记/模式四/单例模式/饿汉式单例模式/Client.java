package 模式四.单例模式.饿汉式单例模式;

public class Client {

	public static void main(String[] args){
  EagerSingleton m_instance=EagerSingleton.getInstance();
	m_instance.textOut();
	}
  
}
