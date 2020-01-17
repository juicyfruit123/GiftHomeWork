package model;

public class Candy<T> extends AbstractSweet {
    private T parameter;

    public Candy(double weight, int price, T parametr) {
        super(weight, price);
        this.parameter = parametr;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + "вес-" + super.getWeight() + " цена-" + super.getPrice() + " "
                + parameter;
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }
}
