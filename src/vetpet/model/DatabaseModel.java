package vetpet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;

public class DatabaseModel {

    private DatabaseMetaData dbm;
    private Connection con;
    private Statement stmt, STMT;
    private ResultSet rs;
    private int curRow;

    /* creates table PELATES if !exists , otherwise connects to it*/
    public void doConnect() throws SQLException {
        //CONNECT TO DATABASE
        con = DriverManager.getConnection("jdbc:derby:vet_database1;create=true;");

        //CHECK IF TABLE ALREADY EXISTS AND ADD A DEFAULT ROW IF IT DOESN'T
        STMT = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        dbm = con.getMetaData();
        ResultSet tables = dbm.getTables(null, null, "PELATES", null);
        if (!tables.next()) {
            String createTable = "CREATE TABLE PELATES (arithmos INT, onomatepwnumo VARCHAR(100),dieuthinsi VARCHAR(100), stathero BIGINT, kinito BIGINT, pontoi INT, xbonus INT, xreos DOUBLE)";
            STMT.executeUpdate(createTable);
//          String insertRow = "INSERT INTO PELATES VALUES (1, 'ΟΝΟΜΑ', 'ΔΙΕΥΘΥΝΣΗ', 0, 0, 0, 0, 0)";
//          STMT.executeUpdate(insertRow);
            STMT.close();
        }
    }

    public void Reload() throws SQLException {
        //EXECUTE SQL, LOAD INTO THE RESULTSET OBJECT
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = stmt.executeQuery("SELECT * FROM PELATES");
        //MOVE CURSOR TO FIRST ROW, ADD ALL THE DATA
        rs.next();
    }
}