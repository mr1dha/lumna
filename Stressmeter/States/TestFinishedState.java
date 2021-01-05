package Stressmeter.States;

import Stressmeter.*;
import Stressmeter.Iterator.*;

public class TestFinishedState implements State {
	Stressmeter stressmeter;

	public TestFinishedState(Stressmeter stressmeter) {
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