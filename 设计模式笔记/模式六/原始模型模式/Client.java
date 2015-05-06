package 模式六.原始模型模式;

public class Client {
/*private Prototype pro;
public Prototype operation(Prototype example){
	return (Prototype)example.clone();
}*/
public static void main(String [] args){
	Prototype pro=new ConcretePrototype();
	Prototype another=(Prototype)pro.clone();
	
	
}
}
