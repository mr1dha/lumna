package Stressmeter;

public class Stressmeter {
	private Iterator questions = new QuestionRepository().getIterator();

	public Question getQuestion() {
		return (Question) questions.next();
	}
}