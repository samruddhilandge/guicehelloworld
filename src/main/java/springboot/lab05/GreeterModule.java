package springboot.lab05;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
//import com.google.inject.Module;

public class GreeterModule extends AbstractModule {

    @Override
    protected void configure(){
//
//            bind(String.class).annotatedWith(Names.named("cool")).toInstance("coolGreeter");
//            bind(String.class).annotatedWith(Names.named("warm")).toInstance("warmGreeter");
//            bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class);
//            bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class);
//
        bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class);
        bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class);
        bind(String.class).annotatedWith(Names.named("coolparam")).toInstance("XXX");
        bind(String.class).annotatedWith(Names.named("warmparam")).toInstance("YYY");

    }
}
