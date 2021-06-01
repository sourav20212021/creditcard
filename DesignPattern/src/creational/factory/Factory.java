package creational.factory;

public class Factory {

	public static Car getFactory(String msgname) {
		if(msgname.equalsIgnoreCase("BMW")) {
			return new BMW();
		}
		else if(msgname.equalsIgnoreCase("Honda")) {
			return new Honda();
		}
		else if(msgname.equalsIgnoreCase("Maruti")) {
			return new Maruti();
		}
		return null;
	}
}
