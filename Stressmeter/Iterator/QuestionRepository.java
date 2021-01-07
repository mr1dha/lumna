package Stressmeter.Iterator;

import java.util.ArrayList;

public class QuestionRepository implements Container {
	public ArrayList<Question> questionList;

	public QuestionRepository() {
		questionList = new ArrayList<>();
		this.prepareQuestion();
	}

	@Override
	public Iterator getIterator() {
		return new QuestionIterator();  
	}

	private class QuestionIterator implements Iterator {
		int index = 0;

		@Override
		public boolean hasNext(){
			return index < questionList.size();
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return questionList.get(index++);
			return null;			
		}

		public int getIndex() {
			return index;
		}
	}

	private void prepareQuestion() {
		this.questionList.add(new Question("Apakah kamu sering Overthinking?", true));
		this.questionList.add(new Question("Apakah kamu memiliki teman dekat?", false));
		this.questionList.add(new Question("Apakah kamu sering curhat dengan teman/orang tua?", false));
	}
}