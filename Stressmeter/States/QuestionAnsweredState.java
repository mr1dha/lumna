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

	}

	@Override
	public void nextQuestion() {

	}

	@Override
	public void showResult() {
		
	}

}