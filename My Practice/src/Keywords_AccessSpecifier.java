
class M{
	void methodA() {
		System.out.println("class M method");
	}
}
class N extends M{
	void methodA(){
		System.out.println("class N method");
		
	}
	void methodN() {
		System.out.println("Method N");
	}
}
public class Keywords_AccessSpecifier {
	public static void main(String[] args) {
		N n=new N();
		M m=new N();
		n.methodA();
		n.methodN();
		m.methodA();
		M mm=new M();
		mm.methodA();
		


	}

}
