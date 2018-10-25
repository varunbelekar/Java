
interface A{
	void show(int i);
	//void display();
}

/*class Xyz implements A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}*/

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		
		//Anonymous Inner Class
		/*obj=new A(){
			public void show(){
				System.out.println("Hello");
			}
			public void display(){
				System.out.println("display");
			}
		};*/
		
		obj=(i) -> {
			System.out.println("Hello1 "+i);  //Lambda Expression		
		};
		obj.show(10);
		//obj.display();
	}

}
