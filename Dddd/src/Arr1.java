import java.util.Arrays;
//Q. [1,2,3,-4,-1,4]
//out put :  [-4,1,-1,2,3,4]

public class Arr1 {
public static void main(String[] args) {
	int x[] = {1,2,3,-4,-1,4};
	int position = 0;
	int count=0;
	int j=0;
	
	Arrays.sort(x);
	for (int i=0;i<x.length-1;i++) {
			if(x[i]>0) {
				position = i;
				break;
			}
	}
	int temp[] = new int[x.length];	
	for(int i=0;i<x.length;i++) {
		if(i%2==0) {
			if(x[i]<0) {
				temp[i] = x[i];				
			} 
			else {								
				if(x[j]<0) {					
					temp[i]=x[j];
				}
				else {
					temp[i]=x[j+1];
					count++;
				}
			 }
		}
		else {
			temp[i] = x[position+count];
			count++;
			j=i;
		}
	}
	System.out.println(Arrays.toString(temp));	
}
}
