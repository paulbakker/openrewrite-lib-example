package org.examples.niwslib;

import org.platform.niws.RestClient;
import org.platform.niws.RestClientManager;

public class HelloNiwsClient {
    //RestClientManager is a platform provided type - coming from a platform library.
    private RestClientManager restClientManager;

    public String helloNiws() {
        RestClient exampleService = restClientManager.createClient("example");
        return exampleService.get();
    }
}
