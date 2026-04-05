package org.example;
import java.sql.*;
import java.util.*;
public class StudentDAO {

    public StudentDTO getStudentById(int id){
        String sql = "SELECT * FROM students WHERE id = ?";
        StudentDTO student = null;
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int ids = rs.getInt("id");
                String name =rs.getString("name");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String grade  = rs.getString("grade");
                student = new StudentDTO(ids,name,email,age,grade);

            }
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return student;
    }

    public List<StudentDTO> getAllStudent(){
        List<StudentDTO> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps  = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StudentDTO student = new StudentDTO();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setEmail(rs.getString("email"));
                student.setAge(rs.getInt("age"));
                student.setGrade(rs.getString("grade"));
                students.add(student);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public boolean insertStudent(StudentDTO student){
        String sql ="INSERT INTO students(id,name,email,age,grade) VALUES(?,?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,student.getId());
            ps.setString(2,student.getName());
            ps.setString(3,student.getEmail());
            ps.setInt(4,student.getAge());
            ps.setString(5,student.getGrade());
           int rowAffected = ps.executeUpdate();

           return rowAffected>0;
        }
        catch(Exception e ){
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateStudent(StudentDTO student){
       String sql = "UPDATE students SET name = ?, email = ?, age = ?, grade = ? WHERE id = ?";
       try(Connection conn = DatabaseConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1,student.getName());
           ps.setString(2,student.getEmail());
           ps.setInt(3,student.getAge());
           ps.setString(4,student.getGrade());
           ps.setInt(5,student.getId());
         int rowsAffected =   ps.executeUpdate();
         return rowsAffected>0;
       }
       catch(Exception e){
           e.printStackTrace();
           return false;
       }
    }

    public boolean deleteStudent(int id){
        String sql = "DELETE FROM students where id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected>0;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;

        }
    }


}
