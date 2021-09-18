import java.util.*;
class Example{
	 public static void main(String args[]){
		int[] ar={34,65,56,43,45,65,43,23,45,49};
		int[] br={10,20,30,40};
		
		 int[] cr=mergeTwoArrays(ar,br);
		 
		 System.out.println(Arrays.toString(ar));
		 System.out.println(Arrays.toString(br));
		 System.out.println(Arrays.toString(cr));
		 
		 }  
		 
		 
		 public static int[] mergeTwoArrays(int[] xr,int[] yr){
			int x1=xr.length;
			int y1=yr.length;
			 int[] cr= new int [x1+y1];
			 for(int i=0; i<x1; i++){
				 cr[i]=xr[i];
			 }
			for(int i=0; i<y1; i++){
				 cr[xr.length+i]=yr[i];
		    }
		    return cr;
		 }
}
