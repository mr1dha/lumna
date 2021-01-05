package Stressmeter;

import Stressmeter.Iterator.*;
import Stressmeter.States.*;

public class Stressmeter {
	//Iterator Patterm
	public Iterator questions;

	//State Patter
	State noAnswerState;
	State testFinishedState;
	State questionAnsweredState;
	State state;

	public float stressScore;

	public Stressmeter() {
		questions = new QuestionRepository().getIterator();
		noAnswerState = new NoAnswerState(this);
		testFinishedState = new TestFinishedState(this);
		questionAnsweredState = new QuestionAnsweredState(this);

		if (this.questions.getIndex() == 0)
			state = noAnswerState;
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

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getNoAnswerState() {
        return noAnswerState;
    }

    public State getTestFinishedState() {
        return testFinishedState;
    }

    public State getQuestionAnsweredState() {
        return questionAnsweredState;
    }
}