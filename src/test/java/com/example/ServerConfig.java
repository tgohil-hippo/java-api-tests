package com.example;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({
    "system:env",
    "classpath:envs/${env}.env",
    "classpath:envs/custom.env"
})
public interface ServerConfig extends Config {
    @Key("BASE_URL")
    String baseUrl();
}