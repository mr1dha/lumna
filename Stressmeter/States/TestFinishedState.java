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
		System.out.println("No more questions! to answer!");
	}

	@Override
	public void nextQuestion() {
		System.out.println("Out of questions!");
	}

	@Override
	public void showResult() {
		float result = stressmeter.stressScore / (stressmeter.questions.getIndex())* 10f;
		String stressLevel = result >= 85 ? "DANGER" : result >= 75 ? "WARNING" : result >= 50 ? "STANDARD" : "GOOD";
		System.out.println("=============");
		System.out.println("Test Finished");
		System.out.println("Your Stress Level is : "+stressLevel+" ( You "+Math.round(result)+"% get Stressed)");
		System.out.println("=============");
		System.exit(1);
	}
	
}