package ģʽ��.���󹤳�;

public class NorthGardener implements Gardener {
	public Fruit  createFruit(String name){
		return new NorthFruit(name);
	}
	public veggie  createVeggie(String name){
		return new NorthVeggie(name);
	}

}
