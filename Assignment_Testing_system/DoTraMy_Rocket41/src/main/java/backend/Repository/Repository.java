package backend.Repository;

import entity.Employee;
import entity.Manager;
import utils.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repository implements IUserRepository{
    JDBCUtils jdbcUtils = new JDBCUtils();

    @Override
    public List<Employee> getListEById(int projectId) throws SQLException, IOException {
        Connection cnn = jdbcUtils.getConnection();

        PreparedStatement preparedStatement = cnn.prepareStatement("select id, fullName, email, roleU from User where projectId = ? and roleU like '%employee%'");
        preparedStatement.setInt(1, projectId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Employee> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
        }
        return list;
    }

    @Override
    public List<Manager> getListMById(int projectId) throws SQLException, IOException {
        Connection cnn = jdbcUtils.getConnection();

        PreparedStatement preparedStatement = cnn.prepareStatement("select id, fullName, email, roleU  from User where projectId = ? and roleU like '%manager%'");
        preparedStatement.setInt(1, projectId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Manager> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(new Manager(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
        }
        return list;
    }

    @Override
    public List<Manager> loginManager(String email, String password) throws SQLException, IOException {
        Connection cnn = jdbcUtils.getConnection();

        PreparedStatement preparedStatement = cnn.prepareStatement("select email, passWordU  from User where email = ? AND passWordU = ? AND roleU like '%manager%'");
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Manager> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(new Manager(resultSet.getString(1), resultSet.getString(2)));
        }
        return list;
    }
}
