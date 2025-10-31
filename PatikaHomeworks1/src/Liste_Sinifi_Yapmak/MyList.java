package Liste_Sinifi_Yapmak;

public class MyList<T> {

    public T size;
    private T content;

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content= content;
    }

    public static <T> void add(int i) {
    }

    public static <T> void printArray(T[] array){

        for (T element: array) {
            System.out.println(element);
        }
    }
}
//
