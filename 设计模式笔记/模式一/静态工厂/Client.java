package ģʽһ.��̬����;

public class Client {
public static void main(String[] args)
{
	Fruit fruit1,fruit2,fruit3,fruit4;
 try
 {
	 fruit1=FruitGarden.factory("ƻ��"); //$NON-NLS-1$
	 fruit2=FruitGarden.factory("����"); //$NON-NLS-1$
	 fruit3=FruitGarden.factory("��ݮ"); //$NON-NLS-1$
	 //fruit4=FruitGarden.factory("");
	 fruit1.plant();
	 fruit1.grow();
	 fruit1.harvest();
	 
	 fruit2.plant();
	 fruit2.grow();
	 fruit2.harvest();
	 
	 fruit3.plant();
	 fruit3.grow();
	 fruit3.harvest();
 }catch(BadFruitException e)
 {
	 e.printStackTrace();
 }
}
}
