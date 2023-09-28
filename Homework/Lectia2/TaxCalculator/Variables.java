public class Variables {
        public double price, tax, total = 0;
        public int quantity;
        public String message;

        public String getMessage() {
            message = "I want to buy " + quantity + " shirt!";
            return message;
        }
        
}
