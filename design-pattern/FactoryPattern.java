public class FactoryPattern {

    public interface Food {
        public String getType();
    }

    public static class Pizza implements Food {
        public String getType() {
            return "The factory returned class Pizza\nSomeone ordered Fast Food!";
        }
    }

    public static class Cake implements Food {
        public String getType() {
            return "The factory returned class Cake\nSomeone ordered a Dessert!";
        }
    }

    public static class FoodFactory {
        public Food getFood(String foodType) {
            Food food = null;
            switch (foodType) {
                case "cake":
                    food = new Cake();
                    break;
                case "pizza":
                    food = new Pizza();
                    // default:
                    // break;

            }
            return food;
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        FoodFactory foodFactory = new FoodFactory();
        String foodType = "pizza";
        Food food = foodFactory.getFood(foodType);
        System.out.println(food.getType());

    }
}