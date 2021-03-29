public class Students {
    String name;
    int id;
    int age;

    Students(int i, int a) {
        id = i;
        age = a;
    }

    Students(int i, String n) {
        id = i;
        name = n;
    }

    public Students() {

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Students s1 = new Students(1,"sai");
        Students s2 = new Students(2,"ram");
        s1.display();
        s2.display();
    }
}
