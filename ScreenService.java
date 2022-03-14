package clientservice;
import clientscreen.WelcomeScreen ;
import clientscreen.Screen;
import clientscreen.UserInteraction;

public class ScreenService {
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static UserInteraction FileOptionsScreen = new UserInteraction();



    public static Screen CurrentScreen = (Screen) WelcomeScreen;

    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }


}
