package backend.Controller;

import backend.Service.IUserService;
import backend.Service.Service;
import entity.Employee;
import entity.Manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Controller {
    private IUserService iService = new Service();
    public List<Employee> getListEById(int projectId) throws SQLException, IOException {
        return iService.getListEById(projectId);
    }
    public List<Manager> getListMById(int projectId) throws SQLException, IOException {
        return iService.getListMById(projectId);
    }
    public List<Manager> loginManager(String email, String password) throws SQLException, IOException {
        return iService.loginManager(email, password);
    }
}
