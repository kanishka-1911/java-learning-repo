//Varargs is a feature in Java 5 that allows a method to accept zero or more arguments of a specified type which are then automaticallly wrapped into an array
// Instead of passing a fixed number of parameters, you use an ellipsis ... which lets the method treat multiple arguments as an array internally.
//It’s ideal when you don’t know how many arguments will be passed to a method!
//  Error: varargs not last
// public void sendMessage(String... messages, int count) {
// invalid: varargs must come last
// }
class arg{
    public void sum(int ... num){
        int sum=0;
        for(int n:num){
            sum+=n;
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        arg obj=new arg();
        obj.sum(1,2,3);
        obj.sum(20,30,40,50);//multiple
        obj.sum();//0 args
    }
}
//example 2
class send {
    public void message(int count, String... msg) {// varargs must come last
        for (int i = 1; i <= count; i++) {
            for (String j : msg) {
                System.out.println(i + ") " + j);
            }
        }
    }

    public static void main(String[] args) {
        send sd = new send();
        sd.message(4, "test");
    }
}