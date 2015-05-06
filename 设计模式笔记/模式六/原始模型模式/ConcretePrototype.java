package 模式六.原始模型模式;

public class ConcretePrototype implements Prototype {
    public    Object clone(){
	try{
		return super.clone();
	   }
	catch(CloneNotSupportedException e)
	   {
		 return null;
    	}
    
                     }
}
