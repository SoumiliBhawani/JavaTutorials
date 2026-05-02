public class calculateDiscount {
        public static void main(String[] args) {
            double itemPrice = 15.50;
            int quantity = 3;
            double discount = 0.10;


            // Calculate total and discounted price
            // Print: Total: $46.5
            // Print: After discount: $41.85
            double total=itemPrice* quantity;
            double discounted=total*discount;
            double finalPrice= total -discounted;
            System.out.println("Total:"+" "+"$"+ total);
            System.out.println("After discount:"+" "+"$"+finalPrice);
        }
    }

