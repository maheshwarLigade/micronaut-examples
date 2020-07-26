package helloworld.graal;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Play{

    private String name;

    public Play(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}