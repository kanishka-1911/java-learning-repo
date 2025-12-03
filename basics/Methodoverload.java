//method overloading: multiple methods in the same class share the same name but differ in:The number of parameters,type of parameters,order of parameters
//changing the num of parameters
class greeting{
    public static void greet(String name) {
    System.out.println("Hello, " + name);
}

public static void greet(String name, String title) {
    System.out.println("Hello, " + title + " " + name);
}
public static void main(String[] args) {
    greet("Thara");
greet("Kanishka","Dr");
}

}
//changing the type of parameter
class div{
    public int Division(int a, int b){
        return a/b;
    }
    public double Division(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        div d=new div();
        System.out.println(d.Division(2,10));
        System.out.println(d.Division(2.0,10.0));
    }
}
//changing the order of parameter
class order{
    public void display(String message, int count) {
    for (int i = 0; i < count; i++) {
        System.out.println(message);
    }
}

public void display(int count, String message) {
    for (int i = 0; i < count; i++) {
        System.out.println(i+1+") "+message);
    }
}
public static void main(String[] args) {
    order od=new order();
    od.display(3,"june");
    od.display("kani",4 );

}
}

