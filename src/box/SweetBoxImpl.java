package box;

import model.AbstractSweet;

public class SweetBoxImpl implements Box {
    private static final int STORAGE_LIMIT = 10_000;
    private AbstractSweet[] box = new AbstractSweet[STORAGE_LIMIT];
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void put(AbstractSweet sweet) throws Exception {
        if (size == STORAGE_LIMIT) {
            throw new Exception();
        } else {
            box[size] = sweet;
            size++;
        }
    }


    @Override
    public void delete(int index) {
        box[index] = box[size - 1];
        box[size - 1] = null;
        size--;
    }

    @Override
    public void deleteLastElement() {
        box[size - 1] = null;
        size--;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (int i = 0; i < size; i++) {
            weight += box[i].getWeight();
        }
        return weight;
    }

    @Override
    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += box[i].getPrice();
        }
        return totalCost;
    }

    @Override
    public void printAllSweets() {
        for (int i = 0; i < size; i++) {
            System.out.println(box[i].toString());
        }
    }

    public void reduceWeight(double weight) {
        sortArr(box);
        double boxWeight = getWeight();
        do {
            boxWeight -= box[0].getWeight();
            delete(0);
        } while (!(boxWeight < weight));
    }
    public void reducePrice(int  price) {
        sortArr(box);
        int boxPrice = getTotalCost();
        do {
            boxPrice -= box[0].getPrice();
            delete(0);
        } while (!(boxPrice < price));
    }

    private void sortArr(AbstractSweet[] arr) {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getWeight() > arr[j + 1].getWeight()) {
                    AbstractSweet tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
