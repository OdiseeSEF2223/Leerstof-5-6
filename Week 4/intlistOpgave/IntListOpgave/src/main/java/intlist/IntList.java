package intlist;

import java.util.ArrayList;

/** Stores a bunch of Integers */
public class IntList {

    /** Stores alle elements */
    protected ArrayList<Integer> list = new ArrayList<Integer>();

    /** add an element to the list
     * @param element element that will be added
     */
    public void add(final int element){
        list.add(element);
    }

    /** removes an element at position <index> from the list
     * @param index indicates the position of the element to remove
     * @return the element removed
     */
    public Integer remove(final int index){
        if(index < list.size()){
            return list.remove(index);
        } else {
            return null;
        }
    }

    /** finds the smallest element in the list
     * @return the smallest element, null if the list is empty
     */
    public Integer findMin(){
        int minimum = Integer.MAX_VALUE; //the largest possible value
        for(final int element: list){
            if(element < minimum){
                minimum = element; //make element the smallest Integer found yet
            }
        }
        return minimum;
    }

}
