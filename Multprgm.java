public class Multprgm {
	
	int[] array = new int[5];
	
	public static void array_square(int a){
		a = ((a)*(a));
		System.out.println("Square is: " +a);
	}
	
	public static int[] fill_array(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 20);
			System.out.println("Value: " +arr[i]);
		}
		return arr;
	}
	

	public static void main(String[] args) {
		//initialize Array
		Multprgm mp = new Multprgm();
		
		fill_array(mp.array);
		
		for(int i = 0; i < mp.array.length; i++){
			array_square(mp.array[i]);
		}

	}

	
}
