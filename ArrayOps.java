public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
   

 public static int findMissingInt (int [] array) {
        int[] arr=new int[]{3,0,1};
        int[] myArr=new int [arr.length+1];
        int arrSum=0;
        int myArrSum=0;
        for(int i=0;i<myArr.length;i++){
            myArr[i]=i;
            myArrSum=myArrSum+i;
        }
        for(int j=0;j<arr.length;j++){
            arrSum=arrSum+arr[j];
        }
        int theMissingInt=myArrSum-arrSum;
        System.out.println(theMissingInt);
        return theMissingInt;
    }

    
    public static int secondMaxValue(int [] array) {
     int [] newArr= new int [array.length-1];
     int max=array[0];
     int count=0;

        for (int i=1; i<array.length; i++){
            if (array[i]==array[0]){
                max=array[i];
            } else { 
                break;
            }
        }
        if(max==array[array.length-1]) { 
            return array[0];
        }else {for (int i=1; i<array.length;i++){ 
               if (max<array[i]){
             newArr[count]=max;
             max=array[i];
             count++;
             
         }else{
             if(array[i]!=max){
              newArr[count]=array[i];
              count++;
             }
         }
     }
     int secondMax=newArr[0];
         for( int j=1; j<newArr.length;j++){ 
             if (secondMax<newArr[j]){ 
                 secondMax=newArr[j];
             }
         }
         
   
         return secondMax;
        }
    }
     }
     
    


     public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int j=0; 
        int i=0;
        int a=0;
        int count=0;
        if (array1.length<=array2.length){ 
            a=array2.length;
        }else{ 
            a=array1.length;
        }
        while (i<array1.length){
            while (j<array2.length){ 
                if( array1[i]!=array2[j]){ 
                    j++;
                    if (j>=array2.length){ 
                        return false;
                    } 
                }else{ 
                    i++;
                    j=0;
                    count++;
                    break;
                }
            }
        }
        if(count==a){
            return true;
        }else{ 
            return false;

        } 

    public static boolean isSorted(int [] array) {
        int i=1; int first=array[0]; int count=0;
        while (i<array.length){ 
            if (first<=array[i]){ 
                first=array[i];
                i++; 
                count++;
            
            }else{
                break;
            }
        }
        if(count==array.length-1){ 
            return true;
        }

               i=1;
               first=array[0];
               count=0;
            while (i<array.length){
                if(first>=array[i]){
                    first=array[i];
                    i++;
                    count++;
                }else{ 
                    break;
                }
               }
               
        if(count==array.length-1){ 
            return true;
        }else {
            return false;
        }

}
