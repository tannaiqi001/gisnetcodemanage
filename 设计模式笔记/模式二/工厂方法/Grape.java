package ģʽ��.��������;

public class Grape implements Fruit {
    /**
     *  �Ƿ�����
     */
	private boolean seedLess;
	@Override
	public void grow() {
		// TODO Auto-generated method stub
       System.out.println("����������");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("�����ջ�");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("������ֲ");
	}

	/**
	 * ȡ�������Ƿ�����
	 * @return ������ѷ���true��
	 */
	public boolean isSeedLess() {
		return seedLess;
	}
	/**
	 * ���������Ƿ�����
	 * @param seedLess �Ƿ����ѣ�true ���ѣ�false û��
	 */

	public void setSeedLess(boolean seedLess) {
		this.seedLess = seedLess;
	}

}
