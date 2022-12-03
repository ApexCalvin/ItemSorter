package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        //positive, is the first item passed bigger than the second time passed?

//        if(o1.getId() > o2.getId()) {
//            return 1;
//        } else if (o1.getId() < o2.getId()) {
//            return -1;
//        } else if (Objects.equals(o1.getId(), o2.getId())){
//            return 0;
//        }

        return o1.getPrice().compareTo(o2.getPrice());
    }
}
