public class Book {
    public static void main(String[] args) {
        Component myBook = new Section("Homo Deus",601);
        Component firstSection = new Section("Introduction",50);
        Component chapterOne = new Chapter("Hello",20);
        Component chapterTwo = new Chapter("History of humanity",30);
        Component secondSection = new Section("Main",350);
        Component chapterThree = new Chapter("Understanding of the world",47);

        firstSection.add(chapterOne);
        firstSection.add(chapterTwo);
        secondSection.add(chapterThree);

        myBook.add(firstSection);
        myBook.add(secondSection);
        myBook.display();
    }
}
