package genericos;

public class Util {
    public static <T> void print(T data){
        System.out.println("print... "+data);
    }

    public static <T> T duplicate(T data){
        return data;
    }

    public static void otrer(String description){
        System.out.println(description);
    }
}
