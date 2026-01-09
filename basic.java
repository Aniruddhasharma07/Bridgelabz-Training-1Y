class Basics{
    static int a = 10;
    int b = 20;
    static void f1(){
        int x = 5;
    }
    static void f2(){
        int y = 15;
    }
    public static void main(String args[]){
        f1();
        f2();
        Basics ob = new Basics();
        int z = ob.b;
    }
}
