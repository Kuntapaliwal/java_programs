import java.sql.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Class.forName("com.mysql.cj.jdbc.Driver");// THIS IS DRIVER CLASS IN FOLDER INSIDE

        final String url = "jdbc:mysql://localhost:3307/hr";// THIS IS DATABASE PATH
        final String username = "root";
        final String password = "password";

        System.out.println("Establishing a connection to the database...\n");
        try (Connection connection = DriverManager.getConnection(url, username, password);) {
            /* Fetching some DB metadata */
            System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion()
                    + "\n");

            System.out.println("USING STATEMENT:: ");
            try (Statement statement = connection.createStatement()) {
                System.out.println("Create operation:");
                String insertSql = """
                        INSERT INTO COUNTRIES (
                            COUNTRY_ID,
                            COUNTRY_NAME,
                            REGION_ID)
                        VALUES (
                            10, 'Canada',5)
                        """;
                int rowsInserted = statement.executeUpdate(insertSql);
                System.out.println(rowsInserted + " rows inserted.");
                System.out.println();

                System.out.println("Read//Retrieve operation:");
                String selectAllSql = """
                        SELECT
                            *
                        FROM
                            Countries
                        """;
                ResultSet result = statement.executeQuery(selectAllSql);
                System.out.println("COUNTRY_ID\tCOUNTRY_NAME\tREGION_ID\t");
                while (result.next()) {
                    int workerId = result.getInt(1);// INDEX STARTS WITH ZERO;
                    String firstName = result.getString("COUNTRY_NAME");
                    int lastName = result.getInt(3);
                    System.out.println(
                            String.format(
                                    "%d\t%s\t%d\t",
                                    workerId,
                                    firstName,
                                    lastName));
                }
                System.out.println();

                System.out.println("Update operation:");
                String updateSql1 = """
                        UPDATE Countries
                        SET
                            Country_NAME = 'India'
                        WHERE
                            Country_NAME = 'Italy'""";
                int rowsUpdated = statement.executeUpdate(updateSql1);
                System.out.println(rowsUpdated + "  rows updated.");
                System.out.println();

                System.out.println("Batch Update operation:");
                String updateSql2 = """
                        UPDATE Countries
                        SET
                            Country_NAME = 'Japan'
                        WHERE
                            Country_NAME = 'Mexico'""";
                statement.addBatch(updateSql1);
                statement.addBatch(updateSql2);
                int[] recordsAffected = statement.executeBatch();
                System.out.println("Status of batch updates:: " + Arrays.toString(recordsAffected));
                System.out.println();

                // Delete Operation using Statement
                String deleteSql = """
                        DELETE FROM Countries
                        WHERE
                            COUNTRY_ID = 10""";
                int rowsDeleted = statement.executeUpdate(deleteSql);
                System.out.println(rowsDeleted + "  rows deleted.");
                System.out.println();
            }

            System.out.println("USING PREPARED STATEMENT:: ");
            System.out.println("Read//Retrieve operation:");
            String selectFormat = """
                    SELECT *
                    FROM
                        Countries
                    WHERE
                        COUNTRY_ID > ?
                    """;
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectFormat)) {
                preparedStatement.setInt(1, 3);
                preparedStatement.setString(2, "Admin");
                ResultSet rs = preparedStatement.executeQuery();
                if (!rs.isBeforeFirst()) {
                    System.out.println("no rows found");
                } else {
                    int columnCount = rs.getMetaData().getColumnCount();
                    System.out.println("Columns and Types::");
                    for (int i = 0; i < columnCount; i++) {
                        System.out.print(rs.getMetaData().getColumnName(i + 1) + ":"
                                + rs.getMetaData().getColumnTypeName(i + 1) + "\t");
                    }
                    System.out.println("\nRecords::");
                    while (rs.next()) {
                        for (int i = 1; i < columnCount + 1; i++) {
                            System.out.print(rs.getObject(i) + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
