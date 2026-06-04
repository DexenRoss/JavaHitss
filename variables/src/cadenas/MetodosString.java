package cadenas;

public class MetodosString {
    public static void main(String[] args) {
        String cadena= "Hola Mundo desde Java";
        String a = "hola ", b = "hola";
        System.out.println("length() -> "+cadena.length());
        System.out.println("chartAt(int) -> "+cadena.charAt(cadena.length()-1));
        System.out.println("toUpperCase() -> "+cadena.toUpperCase());
        System.out.println("toLowerCase() -> "+cadena.toLowerCase());
        System.out.println("equals() -> "+a.equals(b)+" "+b.equals(cadena)+" "+a.equals(b.toUpperCase())+" "+a.equalsIgnoreCase(b.toUpperCase()));
        System.out.println("starWith() -> "+cadena.startsWith("Hola"));
        System.out.println("endsWith() -> "+cadena.endsWith("a"));
        System.out.println("contains() -> "+cadena.contains(" de"));
        System.out.println("substring(int) -> "+cadena.substring(5));
        System.out.println("substring(int,int) -> "+cadena.substring(5,10));
        System.out.println("replace() -> "+cadena.replace("a", "@"));
        System.err.println("a -> "+a + "hola");
        System.out.println("trim() -> "+a.trim() +"hola");
        System.out.println("split() -> "+cadena.split(" "));
        String[] elementos = cadena.split(" ");
        for (String e : elementos) {
            System.out.println(e);
        }
        System.out.println("cadena: "+cadena);
        System.out.println("indexOf() -> "+cadena.indexOf("a"));
        System.out.println("lastIndexOf() -> "+cadena.lastIndexOf("a"));
    }
}
