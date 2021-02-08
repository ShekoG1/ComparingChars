package device;

public class Device 
{
 
    public static void main(String[] args) {
        String a = "a";
       char [] x = {'a','n','d'};
       char []  y = {'n','d','a'};
       int c;
       boolean match=false;
       
       c=Character.compare(x[1],y[0]);
       System.out.println(c);
       if(c==0){
       match = true;
       System.out.println(match);
       }else{System.out.println(match);}
        
    } //int arr[] = {5, 1, 61, 324, 998, 4, 66, 76, 234, 222, 723, 564, 344, 1000, 0, 111};
    //bubbleSort(arr);
  
    
    }
 /*public static int[] bubbleSort(int[]arr){
        
       
        int i,j,temp =0;
               
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){     
            if(arr[j]>arr[j+1]){   
            temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;   
          System.out.println("Iteration "+ i);
           printArray(arr);
          }
         }
             
        }
    return arr;
    }
 static void printArray(int[]arr){
    
 
 for(int i=0;i<arr.length;i++){
 System.out.print(arr[i]+" ");
 
 }
 System.out.println("\n");
 }
}
*/
