package myStack;

import java.util.LinkedList;

public class OwnStack<X> {
    private LinkedList<X> myStack;
    public OwnStack(){
            myStack = new LinkedList<X>();
    }

    public void push(X newElement){
        myStack.push(newElement);
    }

    public void pop(X newElement){
        myStack.remove(newElement);
    }

    public X peak (){
        X myElement;
        if (myStack.size()==0)
            return null;
        myElement= myStack.getFirst();
        return myElement;
    }

    public void size(X newElement){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OwnStack{");
        for (X elem: X) {

        }
        sb.append("myStack=").append(myStack);
        sb.append('}');
        return sb.toString();
    }
}
