package clientscreen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clientservice.DirectoryService;
import clientservice.ScreenService;

public class WelcomeScreen implements Screen{
	  private String welcomeText = "Welcome to Locked!";
	    private String developerText = "Developer's Name: Kamana Trivedi";

	    private ArrayList<String> options = new ArrayList<>();


	    public WelcomeScreen() {
	        options.add("1. Show Files");
	        options.add("2. Show File Options Menu");
	        options.add("3. Quit");

	    }
	    @Override
	    public void Show()
	    {
	        System.out.println(welcomeText);
	        System.out.println(developerText);
	        System.out.println("\n");

	        for (String s : options)  {
	            System.out.println(s);
	        }

	    }

	    public void GetUserInput(){
	        int selectedOption;
	        while ((selectedOption = this.getOption()) != 3) {
	            this.NavigateOption(selectedOption);
	        }
	    }

	   @Override
	    public void NavigateOption(int option) {
	        switch(option) {

	            case 1: // Show Files
	                this.ShowFiles();
	                break;
	            case 2: // Show Submenu
	            	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
	                ScreenService.getCurrentScreen().Show();
	                ScreenService.getCurrentScreen().GetUserInput();

	                break;
	               
	            default:
	                System.out.println("Invalid Option");
	                break;

	        }

	    }

	    public void ShowFiles() {

	        //TODO: Get the files from the Directory

	        System.out.println("List of Files: ");
	    	DirectoryService.PrintFiles();

	    }

	    private int getOption() {
	        Scanner in = new Scanner(System.in);

	        int returnOption = 0;
	        try {
	            returnOption = in.nextInt();
	        }
	        catch (InputMismatchException ex) {

	        }
	        return returnOption;

	    }
	    
}

