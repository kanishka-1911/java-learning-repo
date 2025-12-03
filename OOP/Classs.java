//class is a template or blueprint that contains properties(var)&behaviour(method)
class Dragon {
    String name;//data
    int firePower;

    void breatheFire() {//methods
        System.out.println(name + " breathes fire with power " + firePower);
    }
    public static void main(String[] args) {
        //two dragos with diff properties (instance of class)
        Dragon dg=new Dragon();//obj1
        dg.name="rocho";
        dg.firePower=100;
        dg.breatheFire();
        Dragon dg2=new Dragon();//obj2
        dg2.name="blazer";
        dg2.firePower=50;
        dg2.breatheFire();

    }
}
class Main{
     int x=10;
    public static void main(String[] args) {
       Main ob1=new Main();
       Main ob2=new Main();
       System.out.println(ob1.x);//accessing data in the class
       System.out.println(ob2.x);
    }
}
       


