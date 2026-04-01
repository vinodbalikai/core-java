class NutritionTable {

	private String foodName;
	private int calories;
	private double protein;
	private double fat;
	private double carbs;
	private String servingSize;
	private String category;

	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
	public String getFoodName(){
		return this.foodName;
	}

	public void setCalories(int calories){
		this.calories = calories;
	}
	public int getCalories(){
		return this.calories;
	}

	public void setProtein(double protein){
		this.protein = protein;
	}
	public double getProtein(){
		return this.protein;
	}

	public void setServingSize(String servingSize){
		this.servingSize = servingSize;
	}
	public String getServingSize(){
		return this.servingSize;
	}

	public void setFat(double fat){
		this.fat = fat;
	}
	public double getFat(){
		return this.fat;
	}

	public void setCarbs(double carbs){
		this.carbs = carbs;
	}
	public double getCarbs(){
		return this.carbs;
	}

	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return this.category;
	}

}