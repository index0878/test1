package codegym;

//import java.sql.Connection;
//import java.sql.SQLException;

public class TestDemo1 {

	public static void main(String[] args) {
//		 Connection conn = null;
//		 try{
//		 	conn.commit();
//		 }catch(SQLException e){
//		 	System.out.println("catch SQLException");
//		 }catch(Exception e1){
//		 	e1.printStackTrace();
//		 }finally{
//		 	try {
//		 		conn.close();
//		 	} catch (SQLException e) {
//		 		e.printStackTrace();
//		 	}
//		 }
		
		User user = new User();
//		user.setName("Amy");
		System.out.println(user.getName().orElse("Ryan"));
			
		
	}

}
