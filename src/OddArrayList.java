import java.util.ArrayList;
import java.util.Collection;

public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(int i, int i1, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override
    public void add(int index, Integer element){
        if(isOdd(element)) {
            super.add(index,element);
        }

    }
    @Override
    public boolean add(Integer element){
        if (isOdd(element)){
            return super.add(element);
        } else {
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c);
    }

    public static boolean isOdd(Integer element){
        return Math.abs(element) % 2 ==1;
    }
}
