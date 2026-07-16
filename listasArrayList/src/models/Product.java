package models;

public record Product(Long id, String name, double price) implements Comparable<Product> {

    @Override
    public int compareTo(Product o) {
        // TODO Auto-generated method stub
        return this.id.compareTo(o.id);
    }

}
