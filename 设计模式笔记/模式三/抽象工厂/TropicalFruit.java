package ģʽ��.���󹤳�;

public class TropicalFruit implements Fruit {
	/**
	 * �ȴ�ˮ����
	 */
    private String name;
    /**
     * �ȴ�ˮ�������ֵ�get����������ȡ���ȴ�ˮ�������֡�
     * @return
     */
	public String getName() {
		return name;
	}
    /**
     * �ȴ�ˮ�������ֵ�set���������������ȴ�ˮ��������
     * @param name Ҫ���õ��ȴ��߲˵����֡�
     */
	public void setName(String name) {
		this.name = name;
	}
	public TropicalFruit(String name) {
		super();
		this.name = name;
	}

}
