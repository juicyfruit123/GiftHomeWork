package model;

public class JellyBean<T> extends AbstractSweet {
    private T parameter;

    public JellyBean(double weight, int price, T parameter) {
        super(weight, price);
        this.parameter = parameter;
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + "вес-" + super.getWeight() + " цена-" + super.getPrice() + " " +
                parameter;
    }
}


