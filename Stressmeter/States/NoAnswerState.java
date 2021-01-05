package Stressmeter.States;

import Stressmeter.*;
import Stressmeter.Iterator.*;

public class NoAnswerState implements State {
	Stressmeter stressmeter;

	public NoAnswerState(Stressmeter stressmeter) {
		this.stressmeter = stressmeter;
	}

	@Override
	public void chooseAnswer() {
		Question q = stressmeter.getQuestion();
		
		if (q != null ) {
			System.out.println(q.question());
			System.out.println(q.answer());
		}
		else {
			System.out.println("Out of Question\nTest Finished");
			System.out.println("Your Stress Score is = " + stressmeter.calculateStressScoreResult());
		}
	}

	@Override
	public void nextQuestion() {
		System.out.println("Answer the current question first!");
	}

	@Override
	public void showResult() {
		System.out.println("Result not availble right now!");
	}
}