public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("stephen", "king");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book theStand = new Book("The Stand", stephenKing, 1975);
        System.out.println(" Название книги: " + theStand.getTitle() + " Автор:" + theStand.getAuthor().getFullName()
        + " Дата:" + theStand.getPublicationYear());

    }
}