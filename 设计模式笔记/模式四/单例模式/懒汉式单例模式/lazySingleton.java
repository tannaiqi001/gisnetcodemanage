package ģʽ��.����ģʽ.����ʽ����ģʽ;

public class lazySingleton {
/**
 * ˽�й�����
 */
	public lazySingleton() {}
/**
 * ָ��lazysingleton�����һ�����á�	
 */
private static lazySingleton  m_instance=null;

/**
 * ��̬����������һ��m_instance���ã�������ָ��Ψһ��lazySingleton����
 * @return Ψһ��ָ��lazySingleton��������á�
 */
synchronized public static lazySingleton getInstance(){
	if(m_instance==null)
	{
		m_instance= new lazySingleton();
	}
	return m_instance;
}

public void textout(){
	System.out.println("����ͨ��");
}
	

}
