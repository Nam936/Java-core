import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListBookService {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn;

    public void openConnect() {
        conn = connectDatabase.connect();
    }


    public ArrayList<ListBook> getAllBook() {
        System.out.println("Thông tin sách");
        System.out.println("");
        openConnect();
        //Lấy thông tin book
        String query = "SELECT b.id, b.title, b.image, b.description, b.year_of_publication, p.name as publisher_name, c.name as category_name " +
                "FROM book b INNER JOIN publisher p on b.id_publisher = p.id " +
                "INNER JOIN book_category bc ON b.id = bc.id_book " +
                "INNER JOIN category c ON c.id = bc.id_category";
        ArrayList<ListBook> list = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();

            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String image = result.getString("image");
                String description = result.getString("description");
                int year_pub = Integer.parseInt(result.getString("year_of_publication"));
                String publisher = result.getString("publisher_name");
                String category = result.getString("category_name");

               list.add(new ListBook(id, title, image, description, year_pub,publisher ));
//                System.out.println(id + " - " + title +" - "+ image +" - "+ description +" - "+ year_pub +" - "+ publisher);

            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    public void show(ArrayList<ListBook> list) {
        for (ListBook u : list) {
            System.out.println(u);
        }
    }


    public ArrayList<ListBook> getTitle() {
        System.out.println("");
        System.out.println("Số lượng sách theo tên");
        System.out.println("");
        openConnect();
        //Lấy thông tin title
        String query = "SELECT DISTINCT (title), COUNT(id) as amount " +
                "FROM book " +
                "GROUP BY title " +
                "ORDER BY title ASC";
        ArrayList<ListBook> list = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();

            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("amount");
                String title = result.getString("title");
                System.out.println(id  +"-"+ title);

            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    public ArrayList<ListBook> getcategory() {
        System.out.println("");
        System.out.println("Số lượng sách theo thể loại");
        System.out.println("");
        openConnect();
        //Lấy thông tin title
        String query = "SELECT DISTINCT (title), COUNT(c.id) as amount\n" +
                "FROM book b\n" +
                "INNER JOIN book_category bc on b.id = bc.id_book\n" +
                "INNER JOIN category c ON c.id = bc.id_category\n" +
                "WHERE c.name LIKE 'Action'\n" +
                "GROUP BY title\n" +
                "ORDER BY title ASC";
        ArrayList<ListBook> list = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();

            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("amount");
                String title = result.getString("title");
                System.out.println(id  +"-"+ title);

            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}

