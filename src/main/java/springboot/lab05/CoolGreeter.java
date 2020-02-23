package springboot.lab05;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CoolGreeter implements Greeter {

    private String greeterName;

    @Inject
    public CoolGreeter( @Named("coolparam") String greeterName){
        this.greeterName=greeterName;
    }

    @Override
    public void greet(){

        System.out.println("Hey World. Me "+this.greeterName);
    }

}
