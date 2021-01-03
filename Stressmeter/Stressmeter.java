package Stressmeter;

import Stressmeter.Iterator.*;
import Stressmeter.States.*;

public class Stressmeter {
	static Stressmeter stressmeter; //Singleton Pattern
	private static Iterator questions; //Iterator Patterm

	State noAnswerState;	//State Patter
	State testFinishedState;
	State questionAnsweredState;
	State state;

	private Stressmeter() {
		questions = new QuestionRepository().getIterator();
		noAnswerState = new NoAnswerState();
		testFinishedState = new TestFinishedState();
		questionAnsweredState = new QuestionAnsweredState();
		state = noAnswerState;
	}

	public static Stressmeter getInstance() {
		if (stressmeter == null ) {
			stressmeter = new Stressmeter();
		}
		return stressmeter;
	}

	public Question getQuestion() {
		if (questions.hasNext()) {
			return (Question) questions.next();
		}
		return null;
	}

	public void answerQuestion() {
		state.chooseAnswer();
	}

	public void nextQuestion() {
		state.nextQuestion();
	}

	public void finishTest() {
		state.showResult();
	}
}