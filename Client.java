package clientmain;
import cliententities.*;
import clientscreen.WelcomeScreen;
import clientservice.DirectoryService;
import clientservice.ScreenService;

public class Client {
	 public static void main(String[] args) {

	    	WelcomeScreen welcome = new WelcomeScreen();
	    	welcome.Show();
	    	welcome.GetUserInput();
	        DirectoryService.PrintFiles();
	        ScreenService.getCurrentScreen().GetUserInput();
	     
	    }

}