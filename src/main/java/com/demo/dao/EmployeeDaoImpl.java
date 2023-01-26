package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utility.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void save(Employee e) {
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2,  e.getName());
			ps.setString(3, e.getDept());
			ps.setFloat(4, e.getSalary());
			
			int x = ps.executeUpdate();
			if(x != 0) {
				System.out.println("Data Inserted");	
				System.out.println(e.getId() + e.getDept());
			} else {
				System.out.println("Issue with query");
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	@Override
	public List<Employee> retrieveEmployees() {
		Connection conn = DBConnection.getConnection();
		List<Employee> employees = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getFloat(4));
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	@Override
	public List<Employee> updateEmployee(Employee e) {
		Connection conn = DBConnection.getConnection();
		List<Employee> employees = new ArrayList<>();
		try {
			String sq = "UPDATE employee SET name = ?, department = ?, salary = ?, WHERE Id = ?";
			PreparedStatement ps = conn.prepareStatement(sq);
			ps.setString(1, e.getName());
			ps.setString(2,  e.getDept());
			ps.setFloat(3, e.getSalary());
			ps.setInt(4, e.getId());
			int rs = ps.executeUpdate();
			if (rs>0) {
				System.out.println("updated");
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return employees;
	}

}
