package ģʽ��.��������;

public class Apple implements Fruit {
	/**
	 * ����
	 */
	private int treeAge;

	@Override
	public void grow() {
		// TODO Auto-generated method stub
	System.out.println("ƻ������");	

	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("ƻ���ջ�");

	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("ƻ����ֲ");

	}
/**
 * ȡ������
 * @return ����
 */
	public int getTreeAge() {
		return treeAge;
	}
/**
 * ��������
 * @param treeAge ��������
 */
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
