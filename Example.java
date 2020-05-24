import java.util.*;
class Example{
	public static void bubbleSort(int[] x){
		for(int j=0; j<x.length; j++){
			for(int i=0; i<x.length-1; i++){
				if(x[i]<x[i+1]){
					int t=x[i];
					x[i]=x[i+1];
					x[i+1]=t;
				}
			}
		}
	}
	public static void main(String args[]){
		int[] x={12,43,56,98,7,6,55,66,34,2};
		System.out.println(Arrays.toString(x));
		bubbleSort(x);
		System.out.println(Arrays.toString(x));
	}
}
