package Stressmeter.Iterator;

public class Question {
	private String question;
	private boolean answer;

	public Question(String q, boolean a) {
		this.question = q;
		this.answer = a;
	}

	public String question() {
		return this.question;
	}

	public boolean answer() {
		return this.answer;
	}
}