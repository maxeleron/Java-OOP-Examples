//Ось представлений поліморфізм підтипів.
class A {
    void printClassName() {
        System.out.print("A");
    }
}
 
class B extends A  {
    void printClassName() {
        System.out.print("B");
    }
}
 
class C extends B  {
    void printClassName() {
        System.out.print("C");
    }
}
 
class Test {
    public static void main(String[] args) {
        A example = new C ();
        example.printClassName();
    }
}
