public class Hello {

    public static void main(String[] args) {
	if (args.length > 0 && args[0]!= null)
	// Prints "Hello ~first argument~!" to the terminal window.
		System.out.println("Hello " + args[0] + "!");
	else
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
	
    }

}
