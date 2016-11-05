package com.design.CreationalDesignPattern.BuilderPattern;

/**
 * Created by sahilk on 04/11/16.
 */
public class Sandwich {

    private BreadType breadType;
    private boolean hasMayo;
    private boolean hasVegetables;
    private MeatType meatType;

    public boolean isHasVegetables() {
        return this.hasVegetables;
    }

    public void setHasVegetables(boolean hasVegetables) {
        this.hasVegetables = hasVegetables;
    }

    public BreadType getBreadType() {
        return this.breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public boolean isHasMayo() {
        return this.hasMayo;
    }

    public void setHasMayo(boolean hasMayo) {
        this.hasMayo = hasMayo;
    }

    public MeatType getMeatType() {
        return this.meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sandwich)) {
            return false;
        }

        Sandwich sandwich = (Sandwich) o;

        if (this.hasMayo != sandwich.hasMayo) {
            return false;
        }
        if (this.hasVegetables != sandwich.hasVegetables) {
            return false;
        }
        if (this.breadType != sandwich.breadType) {
            return false;
        }
        return this.meatType == sandwich.meatType;

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType=" + breadType +
                ", hasMayo=" + hasMayo +
                ", hasVegetables=" + hasVegetables +
                ", meatType=" + meatType +
                '}';
    }

    @Override
    public int hashCode() {
        int result = this.breadType != null ? this.breadType.hashCode() : 0;
        result = 31 * result + (this.hasMayo ? 1 : 0);
        result = 31 * result + (this.hasVegetables ? 1 : 0);
        result = 31 * result + (this.meatType != null ? this.meatType.hashCode() : 0);
        return result;
    }
}
