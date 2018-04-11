
public class Bicycle5 extends Vehicle5{

	int num_gears;
	public Bicycle5() {
		this(30,10);

	}
   public Bicycle5(float mspeed, int ngears) {
	    super(mspeed,2); 
	    num_gears = ngears;

	  }

	public String toString() {
		return super.toString()+"\nnum of gears\t"+num_gears;
	}
	public static void main(String[] args) {

//		Bicycle5 bd = new Bicycle5(30,10);
//		System.out.println(bd);
//		Vehicle5 atv  = new Vehicle5(45,3);
//		System.out.println(atv);
//		Bicycle5[] varray = new Bicycle5[3];
		//---------------create a vehicle array of size 3 and make 2 bicycle objects one vehicle object
		Vehicle5[] varray = new Vehicle5[3]; // or Object[] varray = new Object[3]; prodcuces same result
		//Bicycle5[] varray = new Bicycle5[3] casting is required vararray2
		varray[0] = new Bicycle5(10,2);
		varray[1] = new Bicycle5(3,2);
		varray[2] = new Vehicle5();
		System.out.println("My Array");
		for(int i=0; i<varray.length;i++) {
			System.out.println("\nThe Array is\n"+i+varray[i]);
		}
//		System.out.print("\nspeed and wheels"+atv);
//		System.out.print("\nspeed and wheels"+bd);
		
	}

}
