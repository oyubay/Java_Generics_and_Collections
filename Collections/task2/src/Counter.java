import java.util.*;

public class Counter<E> {
    private HashMap<E, Integer
            /* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/> counts;

    public Counter(E[] things){
        this.counts = new HashMap<E, Integer>();
        for(int i=0; i<things.length; i++){
            if (counts.containsKey(things[i])){
                int temp = counts.get(things[i]);
                counts.put(things[i], temp++);
            }else{
                counts.put(things[i], 1);
            }
        }
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
    }

    public Integer getCount(E element){
        return counts.get(element);

        /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
        int frequent=0;
        E e=null;
        Set<E> keys = counts.keySet();
        for(E key:keys) {
            Integer oc = counts.get(key);
            if (oc > frequent) {
                frequent = oc;
                e = key;
            }
        }
        return e;




/* TODO
Returns the most frequent key in the HashMap*/
    }
}
