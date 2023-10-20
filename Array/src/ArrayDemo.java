public class ArrayDemo {
    public int[] removeEvenArrayElement(int[] arr){
        int n=arr.length;
        int oddCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result=new int[oddCount];
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
}
