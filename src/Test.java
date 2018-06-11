public class Test {
    public static void main(String[] args) {
        MultiArray tab = new MultiArray(2,2);
        tab.print();
        System.out.println();
        tab.randomize();
        tab.print();
        System.out.println();
        System.out.println("max: "+tab.max());
        System.out.println("min: "+tab.min());




    }
}
