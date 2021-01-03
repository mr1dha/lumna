package Stressmeter.States;

public class NoAnswerState implements State {

	@Override
	public void chooseAnswer() {

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