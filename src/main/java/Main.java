import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
    List<Integer> myList = new ArrayList<Integer>();

    for(int i=0; i<10; i++)
        myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();

        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        //traversing through forEach method of Iterable with anonymous class

        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer ii) {
                System.out.println(ii);
            }
        });
    }


}
