class HashMapping
{  int HashTbSize;
    int[] Hashtble;

    public HashMapping(){
     HashTbSize = 10 ;
    Hashtble = new int[HashTbSize];
    }
    public int HashFunctions(int n)
    {
    int key = n % HashTbSize;
        return key;
    }
    public int LinearProbing( int d)
    {
        int i = HashFunctions( d);
        int j = 0;
        while(Hashtble[(i+j) % HashTbSize] !=0)
        j=j+1;
        return (i+j) % HashTbSize;

    }
    
    public void Insert( int e) //inserting element e
    { int i= HashFunctions(e);
        if(Hashtble[i]==0)
        {
            Hashtble[i]=e;
        }
        else{
            i=LinearProbing(e);
            Hashtble[i]=e;
        }
    }
    public boolean seraching(int key)
    {
        int i=HashFunctions(key);
        int j=0;
        while(Hashtble[(i+j) % HashTbSize] !=key)
        {
            if(Hashtble[(i+j) % HashTbSize] == 0)
            return false;
            j = j+1;
        }
          return true;      
       }
       public void Display()
       {
           for(int i=0;i<HashTbSize;i++)
           System.out.print(Hashtble[i] +" ");
   
       }
    public static void main(String[] args) {
    HashMapping hp = new HashMapping();
    hp.Insert(22);
    hp.Insert(23);
    hp.Insert(23);
    hp.Insert(10);
    hp.Insert(9);
    hp.Display();
    System.out.println("\nElement Found : "+hp.seraching(9));
    }
}