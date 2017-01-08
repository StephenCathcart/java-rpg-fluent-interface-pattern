/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.stephencathcart.eventgenerator.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import uk.co.stephencathcart.eventgenerator.actions.Actionable;
import uk.co.stephencathcart.eventgenerator.actions.CameraAction;
import uk.co.stephencathcart.eventgenerator.actions.DebugAction;
import uk.co.stephencathcart.eventgenerator.actions.DecisionAction;
import uk.co.stephencathcart.eventgenerator.actions.EffectAction;
import uk.co.stephencathcart.eventgenerator.actions.EnvironmentAction;
import uk.co.stephencathcart.eventgenerator.actions.LightAction;
import uk.co.stephencathcart.eventgenerator.actions.MoveAction;
import uk.co.stephencathcart.eventgenerator.actions.MusicAction;
import uk.co.stephencathcart.eventgenerator.actions.PanicAction;
import uk.co.stephencathcart.eventgenerator.actions.PauseAction;
import uk.co.stephencathcart.eventgenerator.actions.SoundAction;
import uk.co.stephencathcart.eventgenerator.actions.TalkAction;
import uk.co.stephencathcart.eventgenerator.camera.MoveCamera;
import uk.co.stephencathcart.eventgenerator.camera.SetupCamera;
import uk.co.stephencathcart.eventgenerator.camera.ShakeCamera;
import uk.co.stephencathcart.eventgenerator.camera.ZoomCamera;
import uk.co.stephencathcart.eventgenerator.effect.NoiseEffect;
import uk.co.stephencathcart.eventgenerator.effect.VignetteEffect;
import uk.co.stephencathcart.eventgenerator.enums.DialogueType;
import uk.co.stephencathcart.eventgenerator.enums.DirectionType;
import uk.co.stephencathcart.eventgenerator.enums.DurationType;
import uk.co.stephencathcart.eventgenerator.enums.FilterType;
import uk.co.stephencathcart.eventgenerator.enums.LightType;
import uk.co.stephencathcart.eventgenerator.enums.LocationType;
import uk.co.stephencathcart.eventgenerator.enums.MoveSpeedType;
import uk.co.stephencathcart.eventgenerator.enums.MusicType;
import uk.co.stephencathcart.eventgenerator.enums.ObjectType;
import uk.co.stephencathcart.eventgenerator.enums.ShakeType;
import uk.co.stephencathcart.eventgenerator.enums.SoundType;
import uk.co.stephencathcart.eventgenerator.enums.ToonType;
import uk.co.stephencathcart.eventgenerator.environment.FliesEnvironmental;
import uk.co.stephencathcart.eventgenerator.environment.PreloadEnvironmental;
import uk.co.stephencathcart.eventgenerator.environment.RainEnvironmental;
import uk.co.stephencathcart.eventgenerator.environment.ThunderEnvironmental;
import uk.co.stephencathcart.eventgenerator.light.FlickerIlluminant;
import uk.co.stephencathcart.eventgenerator.light.OffIlluminant;
import uk.co.stephencathcart.eventgenerator.light.OnIlluminant;
import uk.co.stephencathcart.eventgenerator.sound.FilterAudible;
import uk.co.stephencathcart.eventgenerator.sound.MuteAudible;
import uk.co.stephencathcart.eventgenerator.sound.PauseAudible;
import uk.co.stephencathcart.eventgenerator.sound.PlayAudible;
import uk.co.stephencathcart.eventgenerator.sound.PreloadAudible;
import uk.co.stephencathcart.eventgenerator.sound.StopAudible;
import uk.co.stephencathcart.eventgenerator.talk.StartTalkable;
import uk.co.stephencathcart.eventgenerator.talk.StopTalkable;

public class Event implements Serializable {

    private Integer eventId;
    private List<Actionable> actions;

    private Event() {
    }

    private Event(List<Actionable> actions) {
        this.actions = actions;
    }

    public void rebuild() {
        if (actions != null) {
            Integer actionId = 0;
            for (Actionable actionable : actions) {
                actionable.setActionId(++actionId);
            }
        }
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public List<Actionable> getActions() {
        return actions;
    }

    public static IAction preload() {
        return new Event.EventBuilder();
    }

    public interface IAction {

        IAction debug();

        IAction pause();

        IAction pause(Float duration);

        ITalk talk();

        IMove move();

        IPanic panic();

        IAction decide();

        IMusic music();

        ISound sound();

        IEnvironment environment();

        ICamera camera();

        IEffect effect();

        ILight light();

        Event build();
    }

    public interface ITalk {

        IAction start(ToonType toon, DialogueType dialogue, Float duration);

        IAction stop();
    }

    public interface IMove {

        IAction ginny(LocationType location, DirectionType direction, MoveSpeedType speed);

        IAction maddy(LocationType location, DirectionType direction, MoveSpeedType speed);

        IAction creature(LocationType location, DirectionType direction, MoveSpeedType speed);
    }

    public interface IPanic {

        IAction start(ObjectType object, DurationType duration);
    }

    public interface IMusic {

        IAction preload(MusicType music);

        IAction play(MusicType music, Boolean isLooping, Float volume);

        IAction stop(MusicType music);

        IAction pause(MusicType music);

        IAction unpause(MusicType music);

        IAction mute(MusicType music);

        IAction unmute(MusicType music);
    }

    public interface ISound {

        IAction play(SoundType sound, Boolean isLooping, Float volume);

        IAction playAt(SoundType sound, Boolean isLooping, Float volume, LocationType location);

        IAction stop(SoundType sound);

        IAction addFilter(SoundType sound, FilterType filterType, Float frequency, Float detune, Float q, Float gain, Float mix);

        IAction removeFilters(SoundType sound);
    }

    public interface IEnvironment {

        IAction preload(Integer rainParticles);

        IAction rain(Float volume);

        IAction stopRain();

        IAction thunder(Float volume);

        IAction stopThunder();

        IAction flies();

        IAction killFlies();

        IAction fade();
    }

    public interface ICamera {

        IAction smoothness(Float moveSmoothness, Float zoomSmoothness);

        IAction move(LocationType location);

        IAction reset();

        IAction shake(Float magnitude, Float duration, ShakeType shakeType);

        IAction zoom(Float zoom);
    }

    public interface IEffect {

        IAction vignette(Float distance, Float speed);

        IAction disableVignette();

        IAction noise(Float intensity, Float color);

        IAction disableNoise();
    }

    public interface ILight {

        IAction on(LightType light);

        IAction off(LightType light);

        IAction flicker(LightType light, Float onTimeMin, Float onTimeMax, Float offTimeMin, Float offTimeMax, Float duration);
    }

    private static class EventBuilder implements IAction, ITalk, IMove, IPanic, IMusic, ISound, IEnvironment, ICamera, IEffect, ILight {

        private final List<Actionable> actions;

        public EventBuilder() {
            this.actions = new ArrayList<>();
        }

        /* Debug */
        @Override
        public IAction debug() {
            this.actions.add(new DebugAction());
            return this;
        }

        /* Pause */
        @Override
        public IAction pause() {
            this.actions.add(new PauseAction(null));
            return this;
        }

        @Override
        public IAction pause(Float duration) {
            this.actions.add(new PauseAction(duration));
            return this;
        }

        /* Talk */
        @Override
        public ITalk talk() {
            return this;
        }

        @Override
        public IAction start(ToonType toon, DialogueType dialogue, Float duration) {
            this.actions.add(new TalkAction(new StartTalkable(toon, dialogue, duration)));
            return this;
        }

        @Override
        public IAction stop() {
            this.actions.add(new TalkAction(new StopTalkable()));
            return this;
        }

        /* Move */
        @Override
        public IMove move() {
            return this;
        }

        @Override
        public IAction ginny(LocationType location, DirectionType direction, MoveSpeedType speed) {
            this.actions.add(new MoveAction(ToonType.ERIN, location, direction, speed));
            return this;
        }

        @Override
        public IAction maddy(LocationType location, DirectionType direction, MoveSpeedType speed) {
            this.actions.add(new MoveAction(ToonType.LAURA, location, direction, speed));
            return this;
        }

        @Override
        public IAction creature(LocationType location, DirectionType direction, MoveSpeedType speed) {
            this.actions.add(new MoveAction(ToonType.CREATURE, location, direction, speed));
            return this;
        }

        /* Panic */
        @Override
        public IPanic panic() {
            return this;
        }

        @Override
        public IAction start(ObjectType object, DurationType duration) {
            this.actions.add(new PanicAction(object, duration));
            return this;
        }

        /* Decision */
        @Override
        public IAction decide() {
            this.actions.add(new DecisionAction());
            return this;
        }

        /* Music */
        @Override
        public IMusic music() {
            return this;
        }

        @Override
        public IAction preload(MusicType music) {
            this.actions.add(new MusicAction(music, new PreloadAudible()));
            return this;
        }

        @Override
        public IAction play(MusicType music, Boolean isLooping, Float volume) {
            this.actions.add(new MusicAction(music, new PlayAudible(isLooping, volume)));
            return this;
        }

        @Override
        public IAction stop(MusicType music) {
            this.actions.add(new MusicAction(music, new StopAudible()));
            return this;
        }

        @Override
        public IAction pause(MusicType music) {
            this.actions.add(new MusicAction(music, new PauseAudible(true)));
            return this;
        }

        @Override
        public IAction unpause(MusicType music) {
            this.actions.add(new MusicAction(music, new PauseAudible(false)));
            return this;
        }

        @Override
        public IAction mute(MusicType music) {
            this.actions.add(new MusicAction(music, new MuteAudible(true)));
            return this;
        }

        @Override
        public IAction unmute(MusicType music) {
            this.actions.add(new MusicAction(music, new MuteAudible(false)));
            return this;
        }

        /* Music */
        @Override
        public ISound sound() {
            return this;
        }

        @Override
        public IAction play(SoundType sound, Boolean isLooping, Float volume) {
            this.actions.add(new SoundAction(sound, new PlayAudible(isLooping, volume)));
            return this;
        }

        @Override
        public IAction playAt(SoundType sound, Boolean isLooping, Float volume, LocationType location) {
            this.actions.add(new SoundAction(sound, new PlayAudible(isLooping, volume, 0f, 0f))); // TODO
            return this;
        }

        @Override
        public IAction stop(SoundType sound) {
            this.actions.add(new SoundAction(sound, new StopAudible()));
            return this;
        }

        @Override
        public IAction addFilter(SoundType sound, FilterType filterType, Float frequency, Float detune, Float q, Float gain, Float mix) {
            this.actions.add(new SoundAction(sound, new FilterAudible(true, filterType, frequency, detune, q, gain, mix)));
            return this;
        }

        @Override
        public IAction removeFilters(SoundType sound) {
            this.actions.add(new SoundAction(sound, new FilterAudible(false)));
            return this;
        }

        /* Environment */
        @Override
        public IEnvironment environment() {
            return this;
        }

        @Override
        public IAction preload(Integer rainParticles) {
            this.actions.add(new EnvironmentAction(new PreloadEnvironmental(rainParticles)));
            return this;
        }

        @Override
        public IAction rain(Float volume) {
            this.actions.add(new EnvironmentAction(new RainEnvironmental(true)));
            return this;
        }

        @Override
        public IAction stopRain() {
            this.actions.add(new EnvironmentAction(new RainEnvironmental(false)));
            return this;
        }

        @Override
        public IAction thunder(Float volume) {
            this.actions.add(new EnvironmentAction(new ThunderEnvironmental(true, volume)));
            return this;
        }

        @Override
        public IAction stopThunder() {
            this.actions.add(new EnvironmentAction(new ThunderEnvironmental(false)));
            return this;
        }

        @Override
        public IAction flies() {
            this.actions.add(new EnvironmentAction(new FliesEnvironmental(true)));
            return this;
        }

        @Override
        public IAction killFlies() {
            this.actions.add(new EnvironmentAction(new FliesEnvironmental(false)));
            return this;
        }

        @Override
        public IAction fade() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /* Camera */
        @Override
        public ICamera camera() {
            return this;
        }

        @Override
        public IAction smoothness(Float moveSmoothness, Float zoomSmoothness) {
            this.actions.add(new CameraAction(new SetupCamera(moveSmoothness, zoomSmoothness)));
            return this;
        }

        @Override
        public IAction move(LocationType location) {
            this.actions.add(new CameraAction(new MoveCamera(true, location)));
            return this;
        }

        @Override
        public IAction reset() {
            this.actions.add(new CameraAction(new MoveCamera(false)));
            return this;
        }

        @Override
        public IAction shake(Float magnitude, Float duration, ShakeType shakeType) {
            this.actions.add(new CameraAction(new ShakeCamera(magnitude, duration, shakeType)));
            return this;
        }

        @Override
        public IAction zoom(Float zoom) {
            this.actions.add(new CameraAction(new ZoomCamera(zoom)));
            return this;
        }

        /* Effect */
        @Override
        public IEffect effect() {
            return this;
        }

        @Override
        public IAction vignette(Float distance, Float speed) {
            this.actions.add(new EffectAction(new VignetteEffect(true, distance, speed)));
            return this;
        }

        @Override
        public IAction disableVignette() {
            this.actions.add(new EffectAction(new VignetteEffect(false)));
            return this;
        }

        @Override
        public IAction noise(Float intensity, Float color) {
            this.actions.add(new EffectAction(new NoiseEffect(true, intensity, color)));
            return this;
        }

        @Override
        public IAction disableNoise() {
            this.actions.add(new EffectAction(new NoiseEffect(false)));
            return this;
        }

        /* Light */
        @Override
        public ILight light() {
            return this;
        }

        @Override
        public IAction on(LightType light) {
            this.actions.add(new LightAction(light, new OnIlluminant()));
            return this;
        }

        @Override
        public IAction off(LightType light) {
            this.actions.add(new LightAction(light, new OffIlluminant()));
            return this;
        }

        @Override
        public IAction flicker(LightType light, Float onTimeMin, Float onTimeMax, Float offTimeMin, Float offTimeMax, Float duration) {
            this.actions.add(new LightAction(light, new FlickerIlluminant(onTimeMin, onTimeMax, offTimeMin, offTimeMax, duration)));
            return this;
        }

        /* Build */
        @Override
        public Event build() {
            Integer actionId = 0;
            for (Actionable actionable : actions) {
                actionable.setActionId(++actionId);
            }
            return new Event(actions);
        }
    }
}
