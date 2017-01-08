##Java Fluent Interface Pattern for Game Scripts

###Overview

Recently I decided to create an interactive 2D horror game (similar to the Telltale games or Until Dawn). During the prototyping phase I thought it would be interesting to be able to code the scenes / game script similar to how a film script would be written; such as *Erin moves to the window* or *The camera starts to shake*. The game engine would then automatically perform these events.

I then programmed the game engine at this point to read input from a JSON string, parsing each *Event* and then performing the necessary action. For example, if the JSON events for one scene were *Move*, *Talk*, *Light*, the main engine would pass these *Events* to the relevant *Move System*, *Talk System* and *Light System* - the individual Events contained further information such as move to where, how fast and what character should move.

This worked fine, the only thing left was to be able to easily generate the JSON script. As Java is my primary language I started to look at builder patterns to see if I could encapsulate my game logic in some sort of Domain Specific Language. The only problem I found with the basic builder pattern is that I still needed knowledge of what events are allowed to join together. It would be nice if I could get feedback on errors in the script at compile-time along with useful intellisense prompts.

I stumbled across a [blog](http://blog.crisp.se/2013/10/09/perlundholm/another-builder-pattern-for-java)  by Per Lundholm describing fluent interface design in Java. The idea is to chain interfaces together to prevent the user from chaining incompatable types. Below is an example of this:

```javascript
EmailMessage
	.from("gojko@example.com")
	.to("me@crisp.se")
	.subject("hello comrade")
	.content("Some content")
.build();
```

I used this as a building block an started adding my own *Event* types and chaining logic. Below are some examples of the result. 

>**Note:** While the code in this repository is working correctly, this is an early version of my system. This version demonstrates the basic principles and can be used as a building block for other game generation scripts.



###Talk / Move Event

```javascript
Event event = Event
		.preload()
		.debug()
		.talk().start(ToonType.LAURA, DialogueType.ID1, 300f)
		.pause(4f)
		.talk().start(ToonType.ERIN, DialogueType.ID2, 300f)
		.move().creature(LocationType.S1W1, DirectionType.WEST, MoveSpeedType.SLOW)
		.pause(2f)
.build();
```

###Environment Event

```javascript
Event event = Event
		.preload()
		.debug()
		.environment().flies()
		.pause(4f)
		.environment().killFlies()
.build();
```

###Effects Event

```javascript
Event event = Event
		.preload()
		.debug()
		.effect().disableVignette()
		.effect().disableNoise()
.build();
```

###Camera Event

```javascript
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
```

###Light Event

```javascript
Event event7 = Event
	.preload()
	.debug()
	.light().on(LightType.PORCHLIGHT)
	.pause(3f)
	.light().off(LightType.PORCHLIGHT)
	.pause(3f)
	.light().flicker(LightType.PORCHLIGHT, 0.1f, 0.2f, 0.1f, 0.2f, 2f)
.build();
```


###Run Arguments
- [0] Directory of Generated Script
- [1] Enable JSON Pretty Print
- [2] Enable Debug Events in Script
```javascript
C:/Directory/script.json true true
```

###Example of Generated JSON Script
A full example script can be found [here](https://github.com/StephenCathcart/java-rpg-fluent-interface-pattern/blob/master/script.json)
```javascript
{
   "events" : [
      {
         "eventId" : 1,
         "actions" : [
            {
               "actionId" : 1,
               "type" : "DEBUG"
            },
            {
               "actionId" : 2,
               "type" : "ENVIRONMENT",
               "environmental" : {
                  "type" : "PRELOAD",
                  "rainParticleCount" : 50
               }
            },
            {
               "actionId" : 3,
               "type" : "SOUND",
               "sound" : "rain_loop",
               "audible" : {
                  "type" : "PLAY",
                  "isLooping" : true,
                  "volume" : -10.0,
                  "positionX" : null,
                  "positionY" : null
               }
            },
            {
               "actionId" : 4,
               "type" : "ENVIRONMENT",
               "environmental" : {
                  "type" : "THUNDER",
                  "isActive" : true,
                  "volume" : 10.0
               }
            }
         ]
      },
      ...
```