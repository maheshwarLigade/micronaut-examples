package helloworld.graal;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class PlayService {
    // create list of plays
    private static final List<Play> PLAYS = Arrays.asList(
            new Play("Tujhe Ahe Tujpashi"),
            new Play("Sundar Mee Honar"),
            new Play("Tee Phularani"),
            new Play("Teen Paishacha Tamasha"),
            new Play("Ek Jhunj Varyashi")
    );
    // to choose random play from PLAYS list
    public Play randomPlay() {
        return PLAYS.get(new Random().nextInt(PLAYS.size()));
    }
}