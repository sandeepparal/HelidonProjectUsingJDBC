package com.examplesDemoProjectService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import com.examplesDemoProjectEntity.Student;
import com.examplesDemoProjectRepository.StudentRepository;

@ApplicationScoped
public class StudentService implements StudentRepository {
	
	
	@Inject
	@Named("studentDataSource")
	DataSource ds;
     
	Connection conn=null;
	
	//SAVE
	@Override
	public Student save(Student student) {

		String sql="insert into student (sId,sName,sCity,sGmail)values(?,?,?,?)";
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, student.getsId());
			ps.setString(2, student.getsName());
			ps.setString(3, student.getsCity());
			ps.setString(4, student.getsGmail());
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public Student getStudent(int sId) {
		Student student=null;
		String sql="select * from student where sId=?";
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, sId);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String sName=rs.getString(2);
				String sCity=rs.getString(3);
				String sGmail=rs.getString(4);
				student=new Student(sId,sName,sCity,sGmail);
				System.out.println(student);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean update(Student student, int sId) {
		boolean rowUpdate=false;
	    String sql="update student set sName=?,sGmail=? where sId=?";
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, student.getsName());
			ps.setString(2, student.getsGmail());
			ps.setInt(3,sId );
			rowUpdate= ps.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}

	@Override
	public boolean deleteStudent(int sId) {
		boolean rowDelete=false;
		String sql="Delete from student where sId=?";
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, sId);
			
			rowDelete=ps.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDelete;
	}

	
	@Override
	public List<Student> getAll() {
		List<Student> student=new ArrayList<Student>();
		String sql ="select *from student";
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int sId=rs.getInt("sId");
				String sName=rs.getString("sName");
				String sCity=rs.getString("sCity");
				String sGmail=rs.getString("sGmail");
			    Student student1=new Student(sId, sName, sCity, sGmail);
			    System.out.println(student1);
			    student.add(student1);
			}
		
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		return  student;
	}
	
	
	

}
