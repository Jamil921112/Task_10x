package ex_23_Collection_Framework.Set;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventSet;

import java.util.*;

public class Lab_150_SET {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set s2 = new TreeSet();
        Set s4 = new LinkedHashSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("dramod");
        hs.add("pramod");
        System.out.println(hs);

    }


}