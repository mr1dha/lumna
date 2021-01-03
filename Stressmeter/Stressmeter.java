package Stressmeter;

import Stressmeter.Iterator.*;
import Stressmeter.States.*;

public class Stressmeter {
	//Iterator Patterm
	private static Iterator questions;

	//State Patter
	State noAnswerState;
	State testFinishedState;
	State questionAnsweredState;
	State state;

	private static float stressScore;

	public Stressmeter() {
		questions = new QuestionRepository().getIterator();
		noAnswerState = new NoAnswerState();
		testFinishedState = new TestFinishedState();
		questionAnsweredState = new QuestionAnsweredState();

		if (questions.getIndex() == 0)
			state = noAnswerState;
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

	public void increaseStressScore() {
		stressScore += 10.0f;
	}

	public float calculateStressScoreResult() {
		return stressScore / (questions.getIndex() + 1) * 0.01f;
	}
}