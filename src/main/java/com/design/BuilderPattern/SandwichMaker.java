package BuilderPattern;

/**
 * Created by sahilk on 04/11/16.
 */
public class SandwichMaker {

    private SandwichBuilder sandwichBuilder;

    public SandwichMaker(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    //The builder pattern separates the construction of a complex object from its representation so
    // that the same construction process can create different representations.
    public void buildSandwich(){
        sandwichBuilder.createNewSandwich();
        sandwichBuilder.applyBread();
        sandwichBuilder.applyVegetables();
        sandwichBuilder.addMeatAndCheese();
    }

    public Sandwich getSandwich(){
       return sandwichBuilder.getSandwich();
    }
}
