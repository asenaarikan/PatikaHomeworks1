package Liste_Sinifi_Yapmak;

public class GenericsMain {
    public static void main(String[] args){
        MyList<Integer> liste= new MyList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Dizideki eleman sayısı= " + liste.size);

//
    }
}
