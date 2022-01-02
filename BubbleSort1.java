public class BubbleSort1 {

    public void SortingAlgo(int a[]){
        for(int i=0;i<a.length-1;i++){
            
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1] =temp;
                }
            }
        }
    }

    public void Display(int a[]){
        System.out.println("Sorted array is :");
        for(int i=0;i<a.length;++i){
            System.out.print(a[i]+ " ");
            ;
        }
    }
    public static void main(String[] args) {
        BubbleSort1 bs=new BubbleSort1();
        int[] a ={40,50,90,70,60};
        bs.SortingAlgo(a);
        bs.Display(a);   
    }
}