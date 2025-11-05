package interfaces;

import java.sql.ResultSet;

public interface UserDAO {
    
    public ResultSet getAll();
    public ResultSet getById();
    public int update();
    public int delete();
    public int insert(String name, String surname);

}
