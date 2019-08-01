package zadanie2;


import java.util.List;

public class ReversList<T> {

    public void reversList(List<T> list) {
        if (list.size() == 1) {
        }else {
            T element = list.remove(0);
            reversList(list);
            list.add(element);
        }
    }


}
