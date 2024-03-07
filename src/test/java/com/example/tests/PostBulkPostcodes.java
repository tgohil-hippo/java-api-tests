package com.example.tests;

import java.io.IOException;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import com.example.ServerConfig;
import com.example.models.PostBulkPostcodesResponse;

import static com.example.rest.Postcodes.postBulkPostcodes;
import static org.testng.Assert.assertEquals;

public class PostBulkPostcodes {
    private static final ServerConfig CONFIG = ConfigFactory.create(ServerConfig.class);

    @Test(groups = {"main"})
    public void verifyDataForMultiplePostcodesIsReturned() throws IOException {
        PostBulkPostcodesResponse response = postBulkPostcodes(CONFIG.baseUrl(), "LS14HT", "WC1X8HN");        

        assertEquals(response.status, 200);
    }
}
