package ģʽ��.����ģʽ.����ʽ����ģʽ;

public class EagerSingleton 
{
/**
 * ˽�й�����
 */
	private EagerSingleton(){}
/**
 * ��̬����m_instance ������һ��EagerSingleton��������á�
 */
	private static final EagerSingleton m_instance= new EagerSingleton();
	
/**
 * ��̬���������� ����һ���´����ľ�̬������m_instance���ñ�����һ��EagleSingleton��������á�
 * @return �´��������һ�����á�
 */
    public static EagerSingleton getInstance(){
		return m_instance;
	}

    public void textOut()
    {
    	System.out.println("����ͨ��");
    }
}
