package ģʽ��.���󹤳�;
/**
 * ����ˮ����
 * @author voyo
 *
 */
public class NorthFruit implements Fruit {
	/**
	 * ����ˮ���������
	 */
	private String name;
    /**
     * ����ˮ�������ֵ�get������ȡ�ñ���ˮ��������֡�
     * @return ����ˮ��������֡�
     */
	public String getName() {
		return name;
	}

	/**
	 * ����ˮ�������ֵ�set�������������ñ���ˮ��������֡�
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
    /**
     * ����ˮ����Ĺ��췽����
     * @param name
     */
	public NorthFruit(String name) {
		super();
		this.name = name;
	}
	

}
