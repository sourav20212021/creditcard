package creational.singleton;

public class Singleton {

	private static  Singleton singlobj=null;
	private Singleton() {
		
	}
	
	private synchronized static Singleton getInstance() {
		
		synchronized(Singleton.class) {
			if(singlobj==null) {
				singlobj=new Singleton();
			}
			return singlobj;
		}
	}
}
