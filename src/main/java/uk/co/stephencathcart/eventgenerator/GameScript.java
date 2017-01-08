package uk.co.stephencathcart.eventgenerator;

import uk.co.stephencathcart.eventgenerator.data.Data;
import java.util.Arrays;
import uk.co.stephencathcart.eventgenerator.data.Event;
import uk.co.stephencathcart.eventgenerator.enums.DialogueType;
import uk.co.stephencathcart.eventgenerator.enums.DirectionType;
import uk.co.stephencathcart.eventgenerator.enums.DurationType;
import uk.co.stephencathcart.eventgenerator.enums.LightType;
import uk.co.stephencathcart.eventgenerator.enums.LocationType;
import uk.co.stephencathcart.eventgenerator.enums.MoveSpeedType;
import uk.co.stephencathcart.eventgenerator.enums.ObjectType;
import uk.co.stephencathcart.eventgenerator.enums.ShakeType;
import uk.co.stephencathcart.eventgenerator.enums.SoundType;
import uk.co.stephencathcart.eventgenerator.enums.ToonType;

public class GameScript {

    private final Data gameData;

    public GameScript() {
        this.gameData = new Data();
    }

    public void generateScript() {
        Event event = Event
                .preload()
                .debug()
                .environment().preload(50)
                .sound().play(SoundType.RAIN_LOOP, true, -10f)
                .environment().thunder(10f)
                .build();

        Event event2 = Event
                .preload()
                .debug()
                .talk().start(ToonType.LAURA, DialogueType.ID1, 300f)
                .pause(4f)
                .talk().start(ToonType.ERIN, DialogueType.ID2, 300f)
                .move().creature(LocationType.S1W1, DirectionType.WEST, MoveSpeedType.SLOW)
                .pause(2f)
                .build();

        Event event3 = Event
                .preload()
                .debug()
                .panic().start(ObjectType.BOTTLE3, DurationType.FASTEST)
                .talk().start(ToonType.ERIN, DialogueType.ID2, 10f)
                .decide()
                .build();

        Event event4 = Event
                .preload()
                .debug()
                .camera().smoothness(0.08f, 0.08f)
                .camera().zoom(1.3f)
                .camera().shake(20f, 4f, ShakeType.REDUCING)
                .camera().move(LocationType.S1W1)
                .pause(2f)
                .camera().reset()
                .build();

        Event event5 = Event
                .preload()
                .debug()
                .effect().disableVignette()
                .effect().disableNoise()
                .build();

        Event event6 = Event
                .preload()
                .debug()
                .environment().flies()
                .pause(4f)
                .environment().killFlies()
                .build();

        Event event7 = Event
                .preload()
                .debug()
                .light().on(LightType.PORCHLIGHT)
                .pause(3f)
                .light().off(LightType.PORCHLIGHT)
                .pause(3f)
                .light().flicker(LightType.PORCHLIGHT, 0.1f, 0.2f, 0.1f, 0.2f, 2f)
                .build();

        gameData.setEvents(Arrays.asList(event, event2, event3, event4, event5, event6, event7));
    }

    public Data getGameData() {
        return gameData;
    }
}
