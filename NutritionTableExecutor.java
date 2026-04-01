class NutritionTableExecutor {
    public static void main(String[] args) {

        NutritionTable n1 = new NutritionTable();

        n1.setFoodName("Rice");
        System.out.println("Food: " + n1.getFoodName());

        n1.setCalories(143);
        System.out.println("Calories: " + n1.getCalories());

        n1.setServingSize("100g");
        System.out.println("Serving Size: " + n1.getServingSize());

        n1.setCarbs(28.0);
        System.out.println("Carbs: " + n1.getCarbs());

        n1.setProtein(2.7);
        System.out.println("Protein: " + n1.getProtein());

        n1.setFat(0.3);
        System.out.println("Fat: " + n1.getFat());

        n1.setCategory("Grains");
        System.out.println("Category: " + n1.getCategory());


        NutritionTable n2 = new NutritionTable();

        n2.setFoodName("Egg");
        System.out.println("Food: " + n2.getFoodName());

        n2.setProtein(6.3);
        System.out.println("Protein: " + n2.getProtein());

        n2.setCalories(155);
        System.out.println("Calories: " + n2.getCalories());

        n2.setFat(11.0);
        System.out.println("Fat: " + n2.getFat());

        n2.setServingSize("1 piece");
        System.out.println("Serving: " + n2.getServingSize());

        n2.setCarbs(1.1);
        System.out.println("Carbs: " + n2.getCarbs());

        n2.setCategory("Protein");
        System.out.println("Category: " + n2.getCategory());


        NutritionTable n3 = new NutritionTable();

        n3.setFoodName("Banana");
        System.out.println("Food Item: " + n3.getFoodName());

        n3.setCalories(89);
        System.out.println("Calories: " + n3.getCalories());

        n3.setCarbs(23.0);
        System.out.println("Carbs: " + n3.getCarbs());

        n3.setServingSize("1");
        System.out.println("Serving Size: " + n3.getServingSize());

        n3.setProtein(1.1);
        System.out.println("Protein: " + n3.getProtein());

        n3.setFat(0.3);
        System.out.println("Fat: " + n3.getFat());

        n3.setCategory("Fruits");
        System.out.println("Category: " + n3.getCategory());


        NutritionTable n4 = new NutritionTable();

        n4.setFoodName("Milk");
        System.out.println("Food: " + n4.getFoodName());

        n4.setServingSize("1 mug");
        System.out.println("Serving: " + n4.getServingSize());

        n4.setCalories(103);
        System.out.println("Calories: " + n4.getCalories());

        n4.setProtein(8.0);
        System.out.println("Protein: " + n4.getProtein());

        n4.setFat(2.4);
        System.out.println("Fat: " + n4.getFat());

        n4.setCarbs(12.0);
        System.out.println("Carbs: " + n4.getCarbs());

        n4.setCategory("Dairy");
        System.out.println("Category: " + n4.getCategory());


        NutritionTable n5 = new NutritionTable();

        n5.setFoodName("Almonds");
        System.out.println("Food: " + n5.getFoodName());

        n5.setCalories(576);
        System.out.println("Calories: " + n5.getCalories());

        n5.setFat(49.0);
        System.out.println("Fat: " + n5.getFat());

        n5.setProtein(21.0);
        System.out.println("Protein: " + n5.getProtein());

        n5.setCarbs(22.0);
        System.out.println("Carbs: " + n5.getCarbs());

        n5.setServingSize("80g");
        System.out.println("Serving Size: " + n5.getServingSize());

        n5.setCategory("Nuts");
        System.out.println("Category: " + n5.getCategory());

    }
}