package Stressmeter.States;

import Stressmeter.*;
import Stressmeter.Iterator.*;

public class QuestionAnsweredState implements State {
	Stressmeter stressmeter;

	public QuestionAnsweredState(Stressmeter stressmeter) {
		this.stressmeter = stressmeter;
	}
	
	@Override
	public void chooseAnswer() {
		System.out.println("Question not validated yet!");
	}

	@Override
	public void nextQuestion() {
		if (stressmeter.questions.hasNext()) {
			stressmeter.setState(stressmeter.getNoAnswerState());
			stressmeter.answerQuestion();
		}
		stressmeter.setState(stressmeter.getTestFinishedState());
		stressmeter.finishTest();
	}

	@Override
	public void showResult() {
		System.out.println("Result Not Ready!");	
	}

}