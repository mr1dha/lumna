package Stressmeter;

import Stressmeter.Iterator.*;
import Stressmeter.States.*;

public class Stressmeter {
	//Iterator Patterm
	private Iterator questions;

	//State Patter
	State noAnswerState;
	State testFinishedState;
	State questionAnsweredState;
	State state;

	float stressScore;

	public Stressmeter() {
		questions = new QuestionRepository().getIterator();
		noAnswerState = new NoAnswerState(this);
		testFinishedState = new TestFinishedState(this);
		questionAnsweredState = new QuestionAnsweredState(this);

		if (this.questions.getIndex() == 0)
			state = noAnswerState;
	}

	public Question getQuestion() {
		if (this.questions.hasNext()) {
			return (Question) this.questions.next();
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
		return stressScore / (this.questions.getIndex() + 1) * 0.01f;
	}
}