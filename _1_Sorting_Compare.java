
import java.sql.Time;
import java.util.Random;

import javax.management.modelmbean.RequiredModelMBean;





public class _1_Sorting_Compare {
	public static void main (String[] args) {

int arraysize= 10000;
int maxNum = arraysize*5;
int MonteCarloNumber =1000;


double  insertionTotal=0;
double bubbleTotal=0;

for (int i = 0; i < MonteCarloNumber; i++) {
	
		int[] myArray = new int[arraysize];
	//get random value to initialize the array
	Random rand = new Random();
	for (int x = 0; x < myArray.length; x++){
		myArray[x] = rand.nextInt(maxNum);
	}
	//		for (int i = 0; i < myArray.length; i++) {
	//			System.out.printf("%d\t", myArray[i]);
	//		}
	System.out.println();
	


	double t1=	System.currentTimeMillis();
	insertionSort(myArray);
	double t2 =System.currentTimeMillis() - t1;
	System.out.println(" The required time for insertion sort is : "  + t2);
	System.out.println();
	
	insertionTotal=insertionTotal+t2;

	
}





for (int i = 0; i < MonteCarloNumber; i++) {
	
	

	int[] myArray = new int[arraysize];
	//get random value to initialize the array
	Random rand = new Random();
	for (int x = 0; x < myArray.length; x++){
		myArray[x] = rand.nextInt(maxNum);
	}
	//		for (int i = 0; i < myArray.length; i++) {
	//			System.out.printf("%d\t", myArray[i]);
	//		}
	System.out.println();
	


	double t1=	System.currentTimeMillis();
	insertionSort(myArray);
	double t2 =System.currentTimeMillis() - t1;
	System.out.println(" The required time for insertion sort is : "  + t2);
	System.out.println();


	
	int[] myArray2 = new int[arraysize];
	//get random value to initialize the array
	Random rand2 = new Random();
	for (int x = 0; x < myArray2.length; x++){
		myArray2[x] = rand2.nextInt(maxNum);
	}
	
	
	

	double t3=	System.currentTimeMillis();
	bubbleSort(myArray2);
	double t4 =System.currentTimeMillis() - t3;

	System.out.println(" The required time for bubble sort is : "  + t4);

	bubbleTotal=bubbleTotal+t4;
	
}


System.out.println("The averaged for insertion sort is :  " + insertionTotal/MonteCarloNumber);

System.out.println("The averaged for buble sort is :  " + bubbleTotal/MonteCarloNumber);
  
	}


	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j-1;
			while ( (i > -1) && ( array [i] > key ) ) {
				array [i+1] = array [i];
				i--;
			}
			array[i+1] = key;
		}
	}



	public static void bubbleSort(int array[]) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {

					int temp;
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;

				}
			}
		}
	}


}


