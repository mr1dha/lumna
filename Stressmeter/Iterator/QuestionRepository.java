package Stressmeter.Iterator;

import java.util.ArrayList;

public class QuestionRepository implements Container {
	public ArrayList<Question> questions;

	public QuestionRepository() {
		questions = new ArrayList<>();
		this.prepareQuestion();
	}

	@Override
	public Iterator getIterator() {
		return new QuestionIterator();  
	}

	private class QuestionIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext(){
			return index < questions.size();
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return questions.get(index++);
			return null;			
		}

		public int getIndex() {
			return index;
		}
	}

	private void prepareQuestion() {
		this.questions.add(new Question("Apakah kamu cukup tidur?", false));
		this.questions.add(new Question("Apakah kamu memiliki teman dekat?", false));
	}
}