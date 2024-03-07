package com.example.tests;

import java.io.IOException;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import com.example.ServerConfig;
import com.example.models.GetPostcodesResponse;

import static com.example.rest.Postcodes.getPostcodeData;
import static org.testng.Assert.assertEquals;

public class GetPostcode {
    private static final ServerConfig CONFIG = ConfigFactory.create(ServerConfig.class);

    @Test(groups = {"main"})
    public void verifyPostcodeDataIsReturned() throws IOException {
        GetPostcodesResponse response = getPostcodeData(CONFIG.baseUrl(), "LS14HT");        

        assertEquals(response.status, 200);
    }
}
