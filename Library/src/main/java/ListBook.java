import lombok.AllArgsConstructor;
        import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ListBook {

    private int id;
    private String title;
    private String image;
    private String description;
    private int year_pub;
    private String publisher;



//    public ListBook(int id, String title, String image, String description, int year_pub) {
//    }


    @Override
    public String toString() {
        return id + " - " + title + " - " + image + " - " + description + " - " + year_pub+" - "+ publisher;
    }
}
