package intlist;

public class SortedIntList extends IntList {

    @Override
    public void add(final int element){
        int index = 0;
        System.out.println();
        System.out.println(element);
        for(; index < list.size(); index ++){
            if(list.get(index) > element){
                System.out.println(element + "\t" + list.get(index) + "\t" + index);
                break;
            }
        }
        System.out.println(index);
        list.add(index, element);

    }
}
