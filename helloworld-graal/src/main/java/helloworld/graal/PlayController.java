package helloworld.graal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class PlayController {

    private final PlayService playService;

    public PlayController(PlayService playService) {
        this.playService = playService;
    }

    @Get("/randomplay")
    public Play randomPlay() {
        return playService.randomPlay();
    }
}