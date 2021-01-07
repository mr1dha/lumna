import Articles.*;
import PhoneBook.*;
import Stressmeter.*;
import java.util.Scanner;

class Lumna {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("WELCOME TO LUMNA");
		System.out.println("1. Read some articles\n2. Get Psycholog Phone Book\n3. Stressmeter Test");
		System.out.print("Choose your aim : ");
		int option = Lumna.in.nextInt();

		switch(option) {
			case 1 :
				new Lumna().startReadArticles();
				break;

			case 2:
				new Lumna().startPhoneBook();
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

	void startPhoneBook() {
		NameRepository namesRepository = new NameRepository();
		int number = 1;
		System.out.println("=================================");
		System.out.println("Psychologs Ready to get Contacted");
		System.out.println("=================================");
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String[] name = (String[]) iter.next();
			System.out.println("\Psycholog " + number + ": ");
			System.out.println("Name \t: "+name[0]);
			System.out.println("Contact : " + name[1]);
			number += 1;
		}
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