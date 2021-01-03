package Stressmeter;

import Stressmeter.Iterator.*;
import Stressmeter.States.*;

public class Stressmeter {
	private QuestionRepository questions = new QuestionRepository();

	public Iterator getQuestion() {
		return questions.getIterator();
	}
}