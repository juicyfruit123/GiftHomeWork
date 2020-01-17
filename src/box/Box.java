package box;

import model.AbstractSweet;

public interface Box {
    void put(AbstractSweet sweet) throws Exception;

    void delete(int index);

    void deleteLastElement();

    int getWeight();

    int getTotalCost();

    void printAllSweets();


}
