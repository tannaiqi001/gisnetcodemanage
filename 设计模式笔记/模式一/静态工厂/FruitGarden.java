package ģʽһ.��̬����;

public class FruitGarden {
	/**
	 * ��̬��������
	 */

	public static Fruit factory(String which) throws BadFruitException {
		if(which.equalsIgnoreCase("ƻ��"))
		{
			return new Apple();
		}else if(which.equalsIgnoreCase("����"))
		{
			return new Grape();
		}else if(which.equalsIgnoreCase("��ݮ"))
		{
			return new Strawberry();
		}else
		{
			throw new BadFruitException("�����������ڷ�Χ");
		}
	}
}
