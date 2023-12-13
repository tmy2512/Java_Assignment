package backend.Repository;

import entity.Employee;
import entity.Manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<Employee> getListEById(int projectId) throws SQLException, IOException;
    List<Manager> getListMById(int projectId) throws SQLException, IOException;
    List<Manager> loginManager(String email, String password) throws SQLException, IOException;


}
