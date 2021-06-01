package creational.factory;

public class Client_Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmobj=(BMW) Factory.getFactory("BMW");
		bmobj.name();
		
	}

}
