package Articles;

import java.util.HashMap;

public class ArticleController {
	static ArticleController articleController;
	private HashMap<String, String> articles;
	private ArticleDisplay display;

	private ArticleController() {
		articles = new HashMap<>();
		display = new ArticleDisplay();
	}

	public static ArticleController getInstance() {
		if (articleController == null ) {
			articleController = new ArticleController();
		}
		return articleController;
	}

	public void addArticle(String slug, String content) {
		articles.put(slug, content);
	}

	public void displayArticle(String slug) {
		display.display(slug, articles.get(slug));
	}
}