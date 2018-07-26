/**
 * Created by Acer on 26.07.18.
 */
public class Kaplya implements Comparable {
    public double x;
    public int v;
    public Kaplya(double x,int v){
        this.x=x;
        this.v=v;
    }
    public String toString(){
        return "x="+x+" v="+v;
    }

    @Override
    public int compareTo(Object o) throws RuntimeException {
        if (o instanceof Kaplya){
        if (this.x>((Kaplya) o).x)
            return 1;
            else if (this.x<((Kaplya) o).x)
            return -1;
            else return 0;
        }
        throw new RuntimeException();
    }
}
