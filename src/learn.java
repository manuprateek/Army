import java.util.HashSet;

public class learn {
    public void name(){
        HashSet hashSet=new HashSet();
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(11);
        hashSet.add(444);

        for(Object var:hashSet){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        learn obj=new learn();
        obj.name();
    }
}
