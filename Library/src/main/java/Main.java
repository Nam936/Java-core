import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ListBookService listbook = new ListBookService();
        ArrayList<ListBook> allBook = listbook.getAllBook();
        listbook.show(allBook);


        ListBookService listBookService = new ListBookService();
        ArrayList<ListBook> alltitle = listBookService.getTitle();
        listBookService.show(alltitle);


        ListBookService listBookCategory = new ListBookService();
        ArrayList<ListBook> allcategoey = listBookCategory.getcategory();
        listBookCategory.show(allcategoey);
    }

}