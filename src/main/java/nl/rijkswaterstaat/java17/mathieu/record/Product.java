package nl.rijkswaterstaat.java17.mathieu.record;

public record Product(long id, String name, String description) {
    public Product {
        Validation.checkThat(name!= null &&!name.isBlank(), "name must not be null or blank");
    }

    protected Product(Long id, String name){
        this(id, name, name);
    }
}
