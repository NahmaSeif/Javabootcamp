import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserServices {
		
	
	public static String validateUsers(String username,String password) {

		 User[] users= null;
		 try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
			
			
			int numOfAttempt = 0;
			while(numOfAttempt <5) {
			for(User e: users) {
				if( (username.equalsIgnoreCase(e.getUsername())) && (password.equals(e.getPassword())) ){
					return "Welcome" + e.getName();
				}
				numOfAttempt++;
			
			}
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
			return "Invalid User";
		
		
	}
}
