package 模式三.抽象工厂;

public class TropicalGardener implements Gardener {
public Fruit createFruit(String name){
	return new TropicalFruit(name);
}
public veggie createVeggie(String name){
	return new TropicalVeggie(name);
}
}
