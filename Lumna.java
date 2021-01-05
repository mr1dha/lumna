import Articles.*;
import Stressmeter.*;

class Lumna {
	public static void main(String[] args) {
		ArticleController articleController = ArticleController.getInstance();
		Stressmeter stressmeter = new Stressmeter();

		stressmeter.answerQuestion();
		stressmeter.answerQuestion();
		stressmeter.answerQuestion();
	}
}