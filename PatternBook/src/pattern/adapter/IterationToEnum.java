package pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author ramudu
 */
public class IterationToEnum {

    public static void main(String[] args) {
        Enumeration vectorEnum = new Vector().elements();
        Iterator iterator = new EnumerationIterator(vectorEnum);
        System.out.println(iterator.hasNext());
    }
}
