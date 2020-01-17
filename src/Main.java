import box.SweetBoxImpl;
import model.Candy;
import model.JellyBean;
import model.LollyPop;

public class Main {
    public static void main(String[] args) throws Exception {
        //Создание коробки
        SweetBoxImpl box = new SweetBoxImpl();
        box.put(new JellyBean<>(31.3, 40, "Cо вкусом малины"));
        box.put(new Candy<>(33.4, 55, "C шоколадом"));
        box.put(new LollyPop<>(35.6, 49, "Cо вкусом колы"));
        ;
        System.out.println("Общий вес собранного подарка-" + box.getWeight());
        System.out.println("Общая стоимость собранного подарка-" + box.getTotalCost());
        System.out.println("Информация обо всех сладостях которые находятся в подарке:");
        box.printAllSweets();
        System.out.println();
        System.out.println("Оптимизация подарка по весу:");
        box.reduceWeight(70.0);
        box.printAllSweets();
        System.out.println("Общий вес собранного подарка-" + box.getWeight());
        System.out.println();
        System.out.println("Оптимизация подарка по цене:");
        box.reducePrice(120);
        box.printAllSweets();
        System.out.println("Общая стоимость собранного подарка-" + box.getTotalCost());

    }
}
