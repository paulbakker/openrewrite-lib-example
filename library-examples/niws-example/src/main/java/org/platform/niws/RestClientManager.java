package org.platform.niws;

/**
 * This would be a platform provided type.
 */
public interface RestClientManager {
    RestClient createClient(String clientName);
}
