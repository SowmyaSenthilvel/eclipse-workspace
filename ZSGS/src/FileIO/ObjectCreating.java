package FileIO;

public class ObjectCreating implements Cloneable {
	void stacking() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		try {
			ObjectCreating obj=(ObjectCreating)Class.forName("Object").newInstance();
			obj.stacking();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
