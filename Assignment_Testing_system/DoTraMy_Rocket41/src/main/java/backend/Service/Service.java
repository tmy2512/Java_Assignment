package backend.Service;

import backend.Repository.IUserRepository;
import backend.Repository.Repository;
import entity.Employee;
import entity.Manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Service implements IUserService{
    private IUserRepository iRepo = new Repository();

    @Override
    public List<Employee> getListEById(int projectId) throws SQLException, IOException {
        return iRepo.getListEById(projectId);
    }

    @Override
    public List<Manager> getListMById(int projectId) throws SQLException, IOException {
        return iRepo.getListMById(projectId);
    }

    @Override
    public List<Manager> loginManager(String email, String password) throws SQLException, IOException {
        return iRepo.loginManager(email, password);
    }
}
