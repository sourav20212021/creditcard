package creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable{

	private static final long serialVersionUID = -8940196742313994740L; 
	
	private static  Singleton singlobj=null;
	private Singleton() {
		
	}
	
	public synchronized static Singleton getInstance() {
		
		synchronized(Singleton.class) {
			if(singlobj==null) {
				singlobj=new Singleton();
			}
			return singlobj;
		}
	}
	
	protected Object readResolve() {
	    return getInstance();
	}
}
