
public class Arr2 {
public static void main(String[] args) {
	int x[] = {2,6,3,9,11};
	for(int i=0;i<x.length-1;i++) {
		int a = x[i];
		int b = x[i+1];
		int sum = a+b;
		if(sum==9) {
			System.out.println(a+ ","+b);
		}
	}
}
}
