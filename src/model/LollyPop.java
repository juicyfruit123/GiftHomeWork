package model;

public class LollyPop<T> extends AbstractSweet {
    private T parameter;

    public LollyPop(double weight, int price, T parametr) {
        super(weight, price);
        this.parameter = parametr;
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + "вес-" + super.getWeight() + " цена-" + super.getPrice() + " "
                + parameter;
    }
}

