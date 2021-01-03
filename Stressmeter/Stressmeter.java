package Stressmeter;

public class Stressmeter {
	private QuestionRepository questions = new QuestionRepository();

	public Iterator getQuestion() {
		return questions.getIterator();
	}
}