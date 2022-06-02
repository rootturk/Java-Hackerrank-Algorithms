public class JavaSingleton {
    public static void main(String[] args) {
        Singleton x = Singleton.getSingleInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getSingleInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getSingleInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}

class Singleton{
    private static Singleton _singleton=null;
    public String str;

    private Singleton(){
        str = "Hello I am a singleton! Let me say hello world to you";
    }

    static Singleton getSingleInstance(){
        if(_singleton==null)
            _singleton = new Singleton();
        return _singleton;
    }
}
