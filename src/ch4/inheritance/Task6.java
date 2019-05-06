package ch4.inheritance;

import java.util.Objects;

/**
 * Suppose that in Section 4.2.2, “The equals Method,” on p. 140, the
 * Item.equals method uses an instanceof test. Implement
 * DiscountedItem.equals so that it compares only the superclass if
 * otherObject is an Item, but also includes the discount if it is a
 * DiscountedItem. Show that this method preserves symmetry but fails to be
 * transitive—that is, find a combination of items and discounted items so that
 * x.equals(y) and y.equals(z), but not x.equals(z).
 */
public class Task6 {
    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("item", 1, 0.05);
        Item y = new Item("item", 1);
        DiscountedItem z = new DiscountedItem("item", 1, 0.1);

        System.out.println("x.equals(y) = " + x.equals(y)); // true
        System.out.println("y.equals(z) = " + y.equals(z)); // true
        System.out.println("x.equals(z) = " + x.equals(z)); // false
    }

    protected static class Item {
        private String description;
        private double price;

        public Item(String description, double price) {
            this.description = description;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || !(o instanceof Item)) return false;
            Item item = (Item) o;
            return Double.compare(item.price, price) == 0 &&
                    Objects.equals(description, item.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(description, price);
        }
    }

    protected static class DiscountedItem extends Item {
        private double discount;

        public DiscountedItem(String description, double price, double discount) {
            super(description, price);
            this.discount = discount;
        }

        @Override
        public boolean equals(Object o) {
            if (!super.equals(o)) return false;
            if (o.getClass() == Item.class) {
                return true;
            }
            DiscountedItem that = (DiscountedItem) o;
            return Double.compare(that.discount, discount) == 0;

/*
            if (this == o) return true;
            if (o instanceof DiscountedItem) {
                DiscountedItem that = (DiscountedItem) o;
                return Double.compare(that.discount, discount) == 0;
            } else if (o.getClass() == Item.class) {
                return super.equals(o);
            } else {
                return false;
            }
*/
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), discount);
        }
    }
}
