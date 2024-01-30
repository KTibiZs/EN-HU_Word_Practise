import java.sql.*;
public class ImportFromSQL {
    int rows = 0;
    private String[] EN_WORDS;
    private String[] HU_WORDS;

    public String[] getEN_WORDS() {
        return EN_WORDS;
    }

    public String[] getHU_WORDS() {
        return HU_WORDS;
    }


    public void importData() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/word_exersice", "root", "1234")) {
            // counting rows for String array size
            PreparedStatement pstmtRowCounter1 = conn.prepareStatement("SELECT * FROM word_pairs");
            ResultSet rs = pstmtRowCounter1.executeQuery();

            while (rs.next()) {
                rows++;
            }

            // filling up the actual language array
            EN_WORDS = new String[rows];
            HU_WORDS = new String[rows];

            try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT eng FROM word_pairs")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    int index = 0;
                    while (resultSet.next() && index < EN_WORDS.length) {
                        EN_WORDS[index++] = resultSet.getString("eng");
                    }
                }
            }

            try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT hun FROM word_pairs")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    int index = 0;
                    while (resultSet.next() && index < HU_WORDS.length) {
                        HU_WORDS[index++] = resultSet.getString("hun");
                    }
                }
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
