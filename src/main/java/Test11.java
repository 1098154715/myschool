import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author cxk
 * @date 2020/7/27 15:54
 */
public class Test11 {
    static ArrayList<Integer> a = new ArrayList<Integer>();
    static ArrayList<Integer> a1 = new ArrayList<Integer>();
    static ArrayList<Integer> b = new ArrayList<Integer>();

    static{
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(5);
        a.add(9);
        a.add(0);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");

        a.stream().map((x)->(x+100)).forEach((num)->{
            a1.add(num);});
        a1.forEach(System.out::print);
        a.forEach(System.out::print);
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm1111");
        List<Integer> collect = a.stream().map((x) -> (x + 100)).collect(Collectors.toList());
        collect.forEach(System.out::print);
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        int b = a.stream().reduce((x,y)->x+y).get();
        System.out.println("sum = "+b);
        System.out.println();
    }
}
