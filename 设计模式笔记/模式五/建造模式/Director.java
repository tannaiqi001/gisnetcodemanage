package ģʽ��.����ģʽ;

public class Director {
private Builder buil;

public void construct(){
	buil=new Concrete();
	buil.buildpart1();
	buil.buildpart2();
	buil.receivereResult();
}
}
