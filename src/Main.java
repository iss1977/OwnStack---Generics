import myStack.OwnStack;
public class Main {

    public static void main(String[] args) {
        OwnStack<String> myStringStack = new OwnStack<String>() ;
        myStringStack.push("Hello");
        myStringStack.push(" my ");
        myStringStack.push(" friend");
        myStringStack.pop("Hello");
        System.out.println(myStringStack.peak());
        System.out.println(myStringStack.peak());System.out.println(myStringStack.peak());

        OwnStack<Integer> myIntegerStack = new OwnStack<Integer>() ;
        myIntegerStack.push(1);
        myIntegerStack.push(2);
        myIntegerStack.push(3);
        System.out.println(myIntegerStack.peak());
        System.out.println(myIntegerStack.peak());
        System.out.println(myIntegerStack.peak());



    }
}
