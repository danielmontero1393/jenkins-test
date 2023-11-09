public class AutomationClass {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HelloPrinter <NAME>");
            System.exit(1);
        }

        String name = args[0];

        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);

            try {
                int randomTime = (int) (Math.random() * 5) + 1;
                Thread.sleep(randomTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
