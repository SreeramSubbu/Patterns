package pattern.template;

/**
 *
 * @author ramudu
 */
abstract class AbstractClass {

    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation1();
        concerteOperation1();
        hook();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    
    

    final void concerteOperation1() {
        System.out.println("Concreate Operation");
    }
    
    void hook(){};
}
