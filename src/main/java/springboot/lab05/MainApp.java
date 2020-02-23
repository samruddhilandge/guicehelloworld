package springboot.lab05;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;


import javax.inject.Named;

public class MainApp {

    @Inject
    @Named("CoolGreeter")
    private Greeter coolGreeter;

    @Inject
    @Named("WarmGreeter")
    private Greeter warmGreeter;

    public static void main(String args[]){

        MainApp mainApp=new MainApp();
        Module module=new GreeterModule();
        Injector injector= Guice.createInjector(module);
        injector.injectMembers(mainApp);

        mainApp.coolGreeter.greet();
        mainApp.warmGreeter.greet();
    }
}
