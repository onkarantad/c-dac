package data_structure.ds1_array;

public class Array {
    private int[] items;
    private int count;   // initialized to zero

    Array(int length){
        items=new int[length];
    }

    public void print(){
        for (int i=0 ; i<count ; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        //if array is ful , resize it
        if (items.length == count){
            //create a new array (twice the size)
            int[] newItems = new int[count*2];
            // copy all existing items
            for (int i=0 ; i<count ; i++){
                newItems[i]=items[i];
            }
            //set items to new array
            items=newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate the index
        if (index < 0 || index >=count )
            throw new IllegalArgumentException();
        // shift items to left
        for (int i = index ; i<count ; i++)
            items[i] = items[i+1];
        count--;

        // array =>    1   2   3   4   5
        // index =>    0   1   2   3   4
    }

    public int indexOf(int item){
        // if we find it return index
        // otherwise -1
        for (int i=0 ; i<count ; i++)
            if (items[i] == item)
                return i;
            return -1;
    }





}


