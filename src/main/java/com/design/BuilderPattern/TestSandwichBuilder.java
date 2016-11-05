package BuilderPattern;

/**
 * Created by sahilk on 04/11/16.
 */
public class TestSandwichBuilder {

    public static void main(String[] args) {
        SandwichMaker sandwichMaker = new SandwichMaker(new MySandwichBuilder());
        sandwichMaker.buildSandwich();
        System.out.println(sandwichMaker.getSandwich().toString());
    }
}
