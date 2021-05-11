package org.apache.commons;

import org.apache.commons.lang3.RandomStringUtils;

public class ShopItem {

    String category;
    double price;
    String name;
    int quantity;
    String ID;

    public ShopItem(String category, double price, String name, int quantity) {
        this.category = category;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.ID = RandomStringUtils.random(25,String.valueOf(System.currentTimeMillis()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ShopItem shopItem = (ShopItem) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder().append(price, shopItem.price).append(quantity, shopItem.quantity).append(category, shopItem.category).append(name, shopItem.name).append(ID, shopItem.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37).append(category).append(price).append(name).append(quantity).append(ID).toHashCode();
    }



    public String priceToString() {
        return ""+ price;
    }

    public String quantityToString() {
        return ""+ quantity;
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", ID='" + ID + '\'' +
                '}'+"\n";
    }
}
