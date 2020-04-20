package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        return total() > 100;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.getProduct().getName() + "(x" + line.getQuantity() + "): " + (line.getProduct().getPrice() * line.getQuantity()) + "\n");

        double total = total();

        printBuffer.append("Total: " + total);

        return printBuffer.toString();
    }
    public double total(){
        double total = 0;

        for (OrderLine line : lines)
            total += line.getProduct().getPrice() * line.getQuantity();
        return total;
    }
}