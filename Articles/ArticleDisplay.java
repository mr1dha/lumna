package Articles;

public class ArticleDisplay {

	public void display(String slug, String content) {
		System.out.println("============================================");
		System.out.println(slugToTitle(slug));
		System.out.println("============================================");
		System.out.println(content);
		System.out.println("============================================");
	}

	public String slugToTitle(String slug) {
		return slug.replace("-", " ");
	}
}