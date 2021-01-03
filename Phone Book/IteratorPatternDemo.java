public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        int number = 1;
        System.out.println("[Nama Psikolog dan Nomor Telepon]");
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Psikolog " + number + ": " + name);
            number += 1;
        }
    }
}