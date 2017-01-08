package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public class PreloadEnvironmental extends AbstractEnvironmental implements Serializable {
    
    private Integer rainParticleCount;
    
    public PreloadEnvironmental(Integer rainParticleCount) {
        super(EnvironmentType.PRELOAD);
        this.rainParticleCount = rainParticleCount;
    }

    public Integer getRainParticleCount() {
        return rainParticleCount;
    }

    public void setRainParticleCount(Integer rainParticleCount) {
        this.rainParticleCount = rainParticleCount;
    }
}
