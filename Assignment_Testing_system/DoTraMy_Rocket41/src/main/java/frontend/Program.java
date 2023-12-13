package frontend;

import java.io.IOException;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException, IOException {
        Function menu = new Function();
        menu.menu();
    }
}
