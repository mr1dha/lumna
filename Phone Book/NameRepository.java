public class NameRepository implements Container {
    public String names[][] = { { "Ridha", "0823-0000-0000" }, { "Niara ", "0823-0000-0000" },
            { "Putri", "0823-0000-0000" }, { "Putra", "0823-0000-0000" } };

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