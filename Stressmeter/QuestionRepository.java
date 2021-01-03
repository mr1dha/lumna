package Stressmeter;

import java.util.ArrayList;

public class QuestionRepository implements Container{
	public ArrayList<Question> questions;

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
	}
}