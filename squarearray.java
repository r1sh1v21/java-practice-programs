/*
Starting with the code in Section 8.6, write a method called powArray
that takes a double array, a, and returns a new array that contains the
elements of a squared. Generalize it to take a second argument and raise
the elements of a to the given power.
*/

class test{
	public static void square(double a[]){
		double b[]= new double[a.length];
		for(int i=0; i<a.length; i++){
			b[i] = Math.pow(a[i], 2.0);
			System.out.println(b[i]);
		}

	}
}

class squarearray{
	public static void main(String args[]){
		double a[] = {1,2,3,4};
		test.square(a);
	}
}