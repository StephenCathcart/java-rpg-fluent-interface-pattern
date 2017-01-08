package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SoundType {
    
    /* Buttons */
    BUTTON1,
    BUTTON2,
    BUTTON3,
    BUTTON4,
    BUTTON5,
    BUTTON6,
    BUTTON7,
    BUTTON8,
    BUTTON9,
    BUTTON10,
    BUTTON11,
    BUTTON12,
    
    /* Events */
    EVENT1,
    EVENT2,
    EVENT3,
    EVENT4,
    EVENT5,
    EVENT6,
    EVENT7,
    EVENT8,
    EVENT9,
    EVENT10,
    EVENT11,
    EVENT12,
    EVENT13,
    EVENT14,
    EVENT15_LOOP,
    EVENT16_LOOP,
    EVENT17_LOOP,
    EVENT18_LOOP,
    EVENT19_LOOP,
    EVENT20,
    
    /* Misc */
    BELL1,
    BELL2,
    BELLS_LOOP,
    BUSH1,
    BUSH2_LOOP,
    CHAINSAW_IDLE_LOOP,
    CHAINSAW_LOOP,
    CHAINSAW_ON,
    CHAINSAW_PREPARE,
    CLOSE_DOOR1,
    CLOSE_DOOR2,
    CLOSE_DRAWER,
    CLOSE_METAL_DOOR,
    CLOSE_METAL_LOCKER,
    CLOSE_WARDROBE,
    CREEPY_CAT,
    DOOR_SLUM1,
    DOOR_SLUM2,
    ELEVATOR_CLOSE,
    ELEVATOR_LOOP,
    ELEVATOR_OPEN,
    FAUCET_DROPS,
    FLASHLIGHT_OFF,
    FLASHLIGHT_ON,
    FURNITURE_MOVEMENT1,
    FURNITURE_MOVEMENT2,
    HEARTBEAT_LOOP1,
    HEARTBEAT_LOOP2,
    IMPACT_MEAT1,
    IMPACT_MEAT2,
    IMPACT_METAL1,
    IMPACT_METAL2,
    IMPACT_WOOD1,
    IMPACT_WOOD2,
    INSECTS_1,
    INSECTS_2,
    IRON_BAR_ATTACK1,
    IRON_BAR_ATTACK2,
    KNIFE1,
    KNIFE2,
    KNOCKING1,
    KNOCKING2,
    LIGHTS_OFF,
    LIGHTS_ON,
    METAL_ITEM_DROPS1,
    METAL_ITEM_DROPS2,
    METAL_ITEM_ROLLING,
    OPEN_DOOR1,
    OPEN_DOOR2,
    OPEN_DRAWER,
    OPEN_METAL_DOOR,
    OPEN_METAL_LOCKER,
    OPEN_WARDROBE,
    PADLOCK,
    PADLOCK_LOOP,
    PISTOL1,
    PISTOL2,
    RADIO_NOISE,
    RADIO_OFF,
    RADIO_ON,
    RAIN_LOOP,
    SCRATCHING,
    SHORT_CIRCUIT_LIGHT,
    SHORT_CIRCUIT_LIGHT_LOOP,
    SLIDING_METAL_DOOR,
    SWINGING,
    THUNDER1,
    THUNDER2,
    TV_NOISE,
    TV_OFF,
    TV_ON,
    VYNIL_LOOP,
    WIND1,
    WIND2,
    WINDOW,
    WOOD_CREAKING,
    
    /* Steps */
    STEP_BLOOD1,
    STEP_BLOOD2,
    STEP_DRY_LEAVES1,
    STEP_DRY_LEAVES2,
    STEP_ENEMY1,
    STEP_ENEMY2,
    STEP_ENEMY3,
    STEP_ENEMY4,
    STEP_METAL_LADDER1,
    STEP_METAL_LADDER2,
    STEP_WOOD1,
    STEP_WOOD2,
    STEP_WOOD3,
    STEP_WOOD4,
    STEPS_UP,
    
    /* Voices */
    BABY_CRYING1,
    BREATHING_EVIL_GUY1,
    BREATHING_EVIL_GUY2,
    BREATHING_FEMALE1,
    BREATHING_FEMALE2,
    BREATHING_MALE1,
    BREATHING_MALE2,
    BREATHING_PSYCHO1,
    BREATHING_PSYCHO2,
    DEAD_CHILDREN_CHANT,
    DEAD_VOICES,
    ENEMY1_DAMAGED,
    ENEMY1_DEATH,
    ENEMY1_LIGHT_ATTACK,
    ENEMY1_STRONG_ATTACK,
    ENEMY2_DAMAGED,
    ENEMY2_DEATH,
    ENEMY2_LIGHT_ATTACK,
    ENEMY2_STRONG_ATTACK,
    ENEMY3_DAMAGED,
    ENEMY3_DEATH,
    ENEMY3_LIGHT_ATTACK,
    ENEMY3_STRONG_ATTACK,
    GHOST1_DAMAGED,
    GHOST1_DEATH,
    GHOST1_LIGHT_ATTACK,
    GHOST1_STRONG_ATTACK,
    GHOST2_DAMAGED,
    GHOST2_DEATH,
    GHOST2_LIGHT_ATTACK,
    GHOST2_STRONG_ATTACK,
    MADNESS_VOICES1,
    MADNESS_VOICES2,
    SCREAM_FEMALE1,
    SCREAM_FEMALE2,
    SCREAM_FEMALE3,
    SCREAM_MALE1,
    SCREAM_MALE2,
    WEEPING_FEMALE,
    WEEPING_MALE;

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
