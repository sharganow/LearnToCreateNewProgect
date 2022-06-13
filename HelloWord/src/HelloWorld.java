/**
 * A program that prints <code>Hello world!  </code>
 *
 * @author Andrey Sharganov
 * @version 1.0
 * */
public class HelloWorld {
    /**
     * Program entry point.
     *
     * @param cmdLineArgs command-line arguments
     * */
    public static void main(String[] cmdLineArgs){
        System.out.println("Hello world!!!" + cmdLineArgs[1] + cmdLineArgs.length);
    }
}
