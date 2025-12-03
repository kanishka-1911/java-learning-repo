//constructor is a special method that gets called automatically when object is created
//it is used to initialise object(set values)
//it has no return type or void
//it can be overloaded
//ex:if you want to create toy,you need to initialise with color,shape,price
class Cons {
    int x;

    public Cons() {
        x = 5;//even if x is not given a value,in default it is 0
    }

    public static void main(String[] args) {
        Cons obj = new Cons();//default constructor
        System.out.println(obj.x);
    }


}

class Paramterised{
    int age;
    String name;
    public Paramterised(int y,String n){
        age=y;
        name=n;

    }
    public static void main(String[] args) {
        Paramterised obj1=new Paramterised(10,"Kani");
        System.out.println(obj1.age);
        System.out.println(obj1.name);
    }
}