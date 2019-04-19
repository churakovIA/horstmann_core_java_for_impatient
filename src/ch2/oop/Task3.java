package ch2.oop;

import java.util.ArrayList;

/**
 * Can you ever have a mutator method return something other than void? Can you
 * ever have an accessor method return void? Give examples when possible.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean vasyaAdded = list.add("vasya");
        System.out.println(vasyaAdded);

//         * we can have a mutator method return sth other than void
//         * for example, ArrayList's add method returns boolean which
//         * indicates whether the operation is successful or not.
//         * I think we can not have an accessor method return void because
//         * it is meaningless to have an object unchanged and return nothing.

    }
}
