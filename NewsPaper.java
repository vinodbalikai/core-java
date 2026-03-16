class NewsPaper{
	String paperName;
	int price;
	Article article;
	
	public void getNewsPaperDetails(){
		System.out.println("The name of the newspaper is: "+paperName);
		System.out.println("The price of the newspaper is: "+price);
		this.article.getArticleDetails();
	}
}


