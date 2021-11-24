package vn.techmaster;

public enum Season {
    SPRING ("Mùa xuân"),
    SUMMER ("Mùa hè"),
    AUTUMN ("Mùa thu"),
    WINTER ("Mùa đông");

    private String value;

    Season (String value){ //Constructor
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
