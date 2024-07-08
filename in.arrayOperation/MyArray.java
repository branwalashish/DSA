public class MyArray{
    private int num[];
    private int c;
    private int incr=0;

    // without any argument the capacity will be 10
    public MyArray()
    {
        num = new int[10];
    }

    	// takes the input as the capacity for the DM Array
	public MyArray(int inintial_Cap) 
    {
		this.num = new int[inintial_Cap];
	}

    // take the initial capacity along with the increment value
	public MyArray(int inintial_Cap, int increment) 
    {
		this.num = new int[inintial_Cap];
		this.incr = increment;
    }
    // shows the size that much buckets are going to be reserved
	public int capacity() 
    {
		return num.length;
	}

    // shows that how many elmnts are prsnt in the array
	public int size() 
    {
		return c;
	}

	// add the elements
	public void add(int data) 
    {

		if (c == num.length) {
			int[] newArray;
			if (incr == 0) {
				newArray = new int[(int) (num.length * 1.6f)];
			} else {
				newArray = new int[num.length + incr];

			}
			for (int i = 0; i < num.length; i++) {
				newArray[i] = num[i];
			}

			num = newArray;
			}
            num[c++] = data;
	}

    // show the elements
	public void display() {
		for (int i = 0; i <= c-1 ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

    
    public void removeFirst() 
    {
		if (size() == 0) 
        {
			System.out.println("List is Empty");
		} else 
        {
			for (int i = 0; i < c; i++) 
            {
				num[i] = num[i + 1];
			}
			c--;
		}
	}

    @Override
    public String toString() 
    {
        if(c==0)
        {
            return "[]";
        }
        String res="[";
       for(int i=0;i<=c-1;i++)
       {
           res=res+num[i]+", ";
       }
       res=res.substring(0,res.length()-2)+"]";
       return res;
    }


}


//remove and remove at specific is pending now 
