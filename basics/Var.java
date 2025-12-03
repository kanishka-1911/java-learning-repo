
class varEx {
    public void sumNum(int a, int b) {
        int sum = a + b;//local var:def inside a method or cons
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        varEx obj = new varEx();
        obj.sumNum(10, 30);
    }
}
//instance var:def outside a method but inside a class
class emp{
    int id;//instance
    String name;
    double salary;
    public void empPrint(int id,String name,double salary){//parameters are local.you can give diff name to var.in that case you donr need to use this.
        this.id=id;//this is used to avoid name conflicts
        this.name=name;//ins var can be accessed inside method
        this.salary=salary;
        System.out.println("the salary of "+name+" is "+salary+",whose id is "+id);
    }
    public static void main(String[] args) {
        emp objt=new emp();
        objt.empPrint(30,"kani",35000.00);
    }
}

class VariableDemo {
    int instanceVar = 10;               // Instance variable
    static int staticVar = 20;          // Static variable

    public void showValues() {
        int localVar = 5;               // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.instanceVar = 100;//accessed using onject
        obj2.instanceVar = 200;

        VariableDemo.staticVar = 999;   // Changing static variable

        obj1.showValues();
        obj2.showValues();
    }
}

