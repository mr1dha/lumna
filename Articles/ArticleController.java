package Articles;

public class ArticleController {
	static ArticleController articleController;
	private ArticleView view;
	private ArticleModel model;

	private ArticleController() {
		view = new ArticleView();
		model = new ArticleModel();
		insertArticle();
	}

	public static ArticleController getInstance() {
		if (articleController == null ) {
			articleController = new ArticleController();
		}
		return articleController;
	}

	public void addArticle(String slug, String content) {
		model.articles.put(slug, content);
	}

	public String[] getSlugs() {
		return model.articles.keySet().toArray(new String[model.articles.size()]);
	}	

	public void displayArticle(String slug) {
		view.display(slug, model.articles.get(slug));
	}

	public void insertArticle() {
		this.addArticle("the-introduction-to-mental-health", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo asperiores architecto, unde, quas laboriosam quaerat nihil, quae libero vel tempore in. Quod ipsa quisquam quia corrupti, ducimus praesentium voluptas velit!");
		this.addArticle("the-reasons-why-you-should-care-abaout-your-mental-health", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo asperiores architecto, unde, quas laboriosam quaerat nihil, quae libero vel tempore in. Quod ipsa quisquam quia corrupti, ducimus praesentium voluptas velit!");
		this.addArticle("excellent-way-to-decrease-stress-level", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo asperiores architecto, unde, quas laboriosam quaerat nihil, quae libero vel tempore in. Quod ipsa quisquam quia corrupti, ducimus praesentium voluptas velit!");
	}
}