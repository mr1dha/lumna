import Articles.*;
import Stressmeter.*;
import java.util.Scanner;

class Lumna {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("WELCOME TO LUMNA");
		System.out.println("1. Read some articles\n2. Get Psycholog Contacts\n3. Stressmeter Test");
		System.out.print("Choose your aim : ");
		int option = Lumna.in.nextInt();

		switch(option) {
			case 1 :
				new Lumna().startReadArticles();
				break;

			case 2:
				//Masukkan kode Kontak Psikoloh di sini!
				break;

			case 3:
				new Lumna().startStressmeterTest(); 
				break;
		}
	}

	void startStressmeterTest() {
		Stressmeter stressmeter = new Stressmeter();
		stressmeter.answerQuestion();
	}

	void startReadArticles() {
		ArticleController articleController = ArticleController.getInstance();
		String[] slugs = articleController.getSlugs();
		int count = 0;

		System.out.println("Most popular articles :");
		for (String slug : slugs) {
			System.out.println(++count+". "+slug);
		}

		System.out.print("\nchoose number : ");
		int select = Lumna.in.nextInt();

		articleController.displayArticle(slugs[select-1]);
	}
}