package ģʽ��.���󹤳�;
/**
 * �ȴ��߲���
 * @author voyo
 *
 */
public class TropicalVeggie implements veggie {
	/**
	 * �ȴ��߲���
	 */
    private String name;
    /**
     * �ȴ��߲˵����ֵ�get����������ȡ���ȴ��߲˵����֡�
     * @return
     */
	public String getName() {
		return name;
	}
    /**
     * �ȴ��߲˵����ֵ�set���������������ȴ��߲˵�����
     * @param name Ҫ���õ��ȴ��߲˵����֡�
     */
	public void setName(String name) {
		this.name = name;
	}
	
	public TropicalVeggie(String name) {
		super();
		this.name = name;
	}
    
	


}
