public class BinarySearch{
    public int BSearch(int[] x , int n , int k)
    {
        int p=0;
        int h=n-1;
        while(p<=h)
        {
            int m=(p+h)/2;
            if(k==x[m])
            return m;
            else if(k < x[m])
            h=m-1;
            else if(k>x[m])
            p=m+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch ln= new BinarySearch();
        int[] x={25,13,05,19,98};
        int i=ln.BSearch(x,x.length,05);
        System.out.println("we are Searching !!!");
        System.out.println("At INDEX :"+i);
    }
}