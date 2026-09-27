/*
 * FILE 2 OF 4: THE ABSTRACT CLASS
 * ------------------------------------------------------------
 * This class stores the data and IMPLEMENTS the interface, but
 * does NOT implement the interface's method itself - that's left
 * for the subclass to do. This is what makes it "abstract."
 *
 * Rename SomethingBase to match the scenario, e.g. Tickets, Fine,
 * Recipes, Staff, RoadAccidents.
 *
 * Save this file as: SomethingBase.java
 */
 
public abstract class Somethingbase implements iSomething {
 
    // STEP A: Declare a private field for every value mentioned
    // in the question (e.g. customer name, age, price / speed /
    // ingredients / staff number / vehicle type, city...)
    private String fieldOne;
    private int fieldTwo;
 
    // STEP B: Constructor - accepts all those values as parameters
    // and assigns them to the fields using "this."
    public Somethingbase(String fieldOne, int fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }
 
    // STEP C: A public getter for every field, so the subclass
    // (and anything else) can read the values.
    public String getFieldOne() {
        return fieldOne;
    }
 
    public int getFieldTwo() {
        return fieldTwo;
    }
 
    // NOTE: printSomething() from the interface is deliberately
    // NOT written here. Leaving it out is what forces this class
    // to stay abstract, and is why the subclass must implement it.
}