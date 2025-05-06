package me.hubailmn.programming.two.Lab5;

import lombok.Getter;
import lombok.Setter;
import me.hubailmn.utils.CC;

@Getter
@Setter
public class Product {

    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;

        if (price <= 0 || quantity <= 0) {
            System.out.println(CC.colorize("Error: price or quantity cant be negative or zero.", CC.Color.BRIGHT_RED));
            this.price = 0;
            this.quantity = 0;
            return;
        }

        this.price = price;
        this.quantity = quantity;
    }

    public double calculateCost() {
        return price * quantity;
    }

    @Override
    public String toString() {

        if (getPrice() == 0 || getQuantity() == 0) {
            return CC.BRIGHT_RED + "Invalid Product! The price or quantity of \"" + getName() + "\" either negative or zero." + CC.RESET;
        }

        return String.format("""
                        %sProduct Info:%s
                            - name: %s%s%s
                            - price %s$%s%s
                            - quantity: %s%s%s
                            - Total Cost: %s$%s%s
                        """,
                CC.BRIGHT_PURPLE, CC.RESET,
                CC.BRIGHT_YELLOW, getName(), CC.RESET,
                CC.BRIGHT_GREEN, getPrice(), CC.RESET,
                CC.BRIGHT_BLUE, getQuantity(), CC.RESET,
                CC.BRIGHT_GREEN, calculateCost(), CC.RESET);

    }
}
