public class Loop2 {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result+", ");
        return result;
    }
    public static void main(String[]args){
while(condition())
System.out.println("Inside  'While'");
System.out.println("Exited 'While'");
    }
}
