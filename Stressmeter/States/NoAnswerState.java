package Stressmeter.States;

import Stressmeter.*;
import Stressmeter.Iterator.*;
import java.util.Scanner;

public class NoAnswerState implements State {
	Stressmeter stressmeter;
	Scanner in = new Scanner(System.in);

	public NoAnswerState(Stressmeter stressmeter) {
		this.stressmeter = stressmeter;
	}

	public void increaseStressScore() {
		stressmeter.stressScore += 10.0f;
	}

	@Override
	public void chooseAnswer() {
		Question q = (Question) stressmeter.questions.next();

		System.out.println("-----");
		System.out.println(" Q : "+q.question());
		System.out.println("-----");
		System.out.print("Jawaban kamu (y/n) : ");
		String answer = in.nextLine();

		if(answer.equalsIgnoreCase("y")) {
			if (q.answer())
				increaseStressScore();
		}
		else {
			if (!q.answer())
				increaseStressScore();
		}
		stressmeter.setState(stressmeter.getQuestionAnsweredState());
		stressmeter.nextQuestion();
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