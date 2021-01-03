package Stressmeter.Iterator;

public class Question {
	private String question;
	private boolean answer;

	public Question(String q, boolean a) {
		this.question = q;
		this.answer = a;
	}

	public String getQuestion() {
		return this.question;
	}

	public boolean getAnswer() {
		return this.answer;
	}
}