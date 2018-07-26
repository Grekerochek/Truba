import java.util.LinkedList;
import java.util.*;

public class Main {

    public static int chislo(int[] a,int[] b,int n){

        int maxV=0,count = 0;

        for (int i = 0; i <b.length-1 ; i++) {
            if (b[i]>maxV)
                maxV=b[i];
        }

        List<Kaplya> list = new LinkedList<>();
        for (int i = 0; i <a.length; i++) {
            list.add(new Kaplya(a[i],b[i]));
        }
        list.sort((a1,a2)->a1.compareTo(a2));
        //System.out.println(list);
        while (!list.isEmpty()) {
            for (Kaplya k : list) {
                k.x += (double) k.v / maxV;
            }
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).x >= list.get(i + 1).x)
                    list.remove(i);
            }
            for (Kaplya k : list) {
                if (k.x >= n){
                    count++;
                    list.remove(k);
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] x = {10, 8, 0, 5, 3};
        int[] v = {2, 4, 1, 1, 3};
        System.out.println("Введите длину трубы:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Число вытекших капель");
        System.out.println(chislo(x,v,n));

    }
}
