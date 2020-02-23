package springboot.lab05;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class WarmGreeter implements Greeter {

    private String greeterName;

//    @Inject
//    public WarmGreeter(@Named("warm") String greeterName){
//        this.greeterName=greeterName;
//    }
    @Inject
    public WarmGreeter(@Named("warmparam") String greeterName){
        this.greeterName=greeterName;
    }

    @Override
    public void greet(){

        System.out.println("Hello, my dear World. I am "+this.greeterName);
    }
}
