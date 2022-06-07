package Dao;


import java.sql.SQLException;

public interface Reimbmethod {
    boolean approverequest() throws SQLException;
    boolean denyrequest() throws SQLException;
}
