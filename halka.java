public class halka {
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]=arr1;
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        arr2[0]=6;
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        for(int y:arr2){
            System.out.print( y+" ");
        }
    }
    
}
