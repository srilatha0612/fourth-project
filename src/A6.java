public class A6 implements Printable {
    public static void main(String[] args) {
        System.out.println("hello");

    }

    @Override
    public void print() {
        A6 obj=new A6();
        obj.print();
    }
}
