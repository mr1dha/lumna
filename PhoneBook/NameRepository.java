package PhoneBook;

public class NameRepository implements Container {
    public String names[][] = { { "Ridha", "0823-0000-0001" }, { "Rico ", "0823-0000-0002" },
            { "Halim", "0823-0000-0003" }, { "Otong", "0823-0000-0004" } };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}