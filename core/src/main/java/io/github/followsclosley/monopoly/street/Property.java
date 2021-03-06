package io.github.followsclosley.monopoly.street;

public class Property extends RealEstate {

    private int houseCount = 0;
    private final int[] rentTable;

    public Property(String name, int price, Color color, int... rentTable) {
        super(name, price);
        this.rentTable = rentTable;
    }

    @Override
    public int getRent() {
        return rentTable[houseCount];
    }
}