package com.vishnu.udemy.work.FruitBasketEstimation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FruitBasketUtility {
    private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

    public List<FruitBasket> getFruitBasketList() {
        return fruitBasketList;
    }

    public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
        this.fruitBasketList = fruitBasketList;
    }

    public void addToBasket(FruitBasket fbObj) {
        fruitBasketList.add(fbObj);
    }

    public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
        int bill[] = new int[1];

        fruitBasketStream.forEach(item -> {
            int weight = item.getWeightInKgs();
            int price = item.getPricePerKg();

            bill[0] = bill[0] + (price * weight);
        });

        return bill[0];
    }

}

