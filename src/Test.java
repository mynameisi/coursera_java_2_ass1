import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		// Random rd=new Random();
		// List<Integer> n=new ArrayList<Integer>();
		// for(int i=0;i<100;i++){
		// n.add(rd.nextInt(100));
		// }
		// Collections.sort(n);
		// System.out.println(n);
		// Random rd=new Random();
		// System.out.println(rd.nextInt(100)); //a random number within [0,
		// 100)
		Test A=null;
		Test B=A;
		A=new Test();
		System.out.println(B);
		
	}

	
public static void insertionSort(int[] n){
	for(int i=0;i<n.length;i++){
		//insert the i+1 into the 0..i list,
		//so that it fits the relative order
		//this is achieved by bubble i+1 back by keep swaping
		for(int j=i+1;j>=1 && j<n.length;j--){
			if(n[j]<n[j-1]){
				int temp=n[j];
				n[j]=n[j-1];
				n[j-1]=temp;
			}else{
				break;
			}
		}
	}
}

	public static void selectionSort(int[] n) {
		for (int i = 0; i < n.length; i++) {
			
			//keep a pointer : smallest
			int smallest = i;
			
			//go through the remaining list
			//make the pointer points to the smallest
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[i]) {
					smallest = j;
				}
			}
			
			//sway i and smallest
			int temp = n[i];
			n[i] = n[smallest];
			n[smallest] = temp;
		}
	}

	public static String hasChar(String s, char oldChar, char newChar) {
		char[] sChar = s.toCharArray();
		int i = 0;
		for (char c : sChar) {
			if (c == oldChar) {
				sChar[i] = newChar;
			}
			i++;
		}
		return new String(sChar);
	}

	public static int mystery(String s) {
		char[] letters = s.toCharArray();
		int x = 0;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ' ') {
				letters[i] = '_';
				x++;
			}
		}
		return x;
	}
}
