import Articles.*;
import Stressmeter.*;
import Stressmeter.Iterator.*;
import Stressmeter.States.*;

class Lumna {
	public static void main(String[] args) {
		ArticleController articleController = ArticleController.getInstance();
		Stressmeter stressMeter = new Stressmeter();

		for (Iterator i = stressMeter.getQuestion(); i.hasNext();) {
			Question q = (Question) i.next();
			System.out.println(q.getQuestion());
			System.out.println(q.getAnswer());
		}

	}
}