/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.call;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class RecordingTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Recording.fetcher("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2008-08-01\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Mon, 22 Aug 2011 20:58:45 +0000\",\"date_updated\": \"Mon, 22 Aug 2011 20:58:45 +0000\",\"duration\": \"6\",\"price\": null,\"sid\": \"REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"encryption_type\": \"public-key\",\"encryption_details\": {\"encryption_public_key_sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"encryption_cek\": \"OV4h6zrsxMIW7h0Zfqwfn6TI2GCNl54KALlg8wn8YB8KYZhXt6HlgvBWAmQTlfYVeLWydMiCewY0YkDDT1xmNe5huEo9vjuKBS5OmYK4CZkSx1NVv3XOGrZHpd2Pl/5WJHVhUK//AUO87uh5qnUP2E0KoLh1nyCLeGcEkXU0RfpPn/6nxjof/n6m6OzZOyeIRK4Oed5+rEtjqFDfqT0EVKjs6JAxv+f0DCc1xYRHl2yV8bahUPVKs+bHYdy4PVszFKa76M/Uae4jFA9Lv233JqWcxj+K2UoghuGhAFbV/JQIIswY2CBYI8JlVSifSqNEl9vvsTJ8bkVMm3MKbG2P7Q==\",\"encryption_iv\": \"8I2hhNIYNTrwxfHk\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Recording.fetcher("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").fetch());
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Recording.deleter("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Recording.deleter("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").delete();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Recording.reader("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\",\"last_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\",\"next_page_uri\": null,\"num_pages\": 1,\"page\": 0,\"page_size\": 50,\"previous_page_uri\": null,\"recordings\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2008-08-01\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Mon, 22 Aug 2011 20:58:45 +0000\",\"date_updated\": \"Mon, 22 Aug 2011 20:58:45 +0000\",\"duration\": \"6\",\"price\": null,\"sid\": \"REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/REaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"encryption_type\": \"public-key\",\"encryption_details\": {\"encryption_public_key_sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"encryption_cek\": \"OV4h6zrsxMIW7h0Zfqwfn6TI2GCNl54KALlg8wn8YB8KYZhXt6HlgvBWAmQTlfYVeLWydMiCewY0YkDDT1xmNe5huEo9vjuKBS5OmYK4CZkSx1NVv3XOGrZHpd2Pl/5WJHVhUK//AUO87uh5qnUP2E0KoLh1nyCLeGcEkXU0RfpPn/6nxjof/n6m6OzZOyeIRK4Oed5+rEtjqFDfqT0EVKjs6JAxv+f0DCc1xYRHl2yV8bahUPVKs+bHYdy4PVszFKa76M/Uae4jFA9Lv233JqWcxj+K2UoghuGhAFbV/JQIIswY2CBYI8JlVSifSqNEl9vvsTJ8bkVMm3MKbG2P7Q==\",\"encryption_iv\": \"8I2hhNIYNTrwxfHk\"}}],\"start\": 0,\"total\": 1,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Recording.reader("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\",\"last_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\",\"next_page_uri\": null,\"num_pages\": 1,\"page\": 0,\"page_size\": 50,\"previous_page_uri\": null,\"recordings\": [],\"start\": 0,\"total\": 1,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json?PageSize=50&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Recording.reader("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").read());
    }
}