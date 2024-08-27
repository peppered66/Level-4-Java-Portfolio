
public class Main {

	public static void main(String[] args) {
		Password one = new Password("William");		
		one.encrypt();
		System.out.println(one);
		System.out.println(one.isEncrypted());

		one.decrypt();
		System.out.println(one);
		System.out.println(one.isEncrypted());
		
		Secret hush = new Secret("Benjamin");
	      hush.encrypt();
	      System.out.println(hush);
		  System.out.println(hush.isEncrypted());
	      
	      hush.decrypt();
	      System.out.println(hush);
	      System.out.println(hush.isEncrypted());

	}

}
