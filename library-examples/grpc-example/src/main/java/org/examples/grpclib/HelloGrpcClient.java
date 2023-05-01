package org.examples.grpclib;

/**
 * Fake gRPC client - all we care about for the example.
 * All we care about for the example is the properties file.
 */
public class HelloGrpcClient {
    public String helloGrpc() {
        return "hi, grpc";
    }
}
