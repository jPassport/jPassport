package io.github.jpassport;


import io.github.jpassport.exceptions.AuthenticationException;

import java.util.function.BiConsumer;

public interface AuthenticationStrategy {
    String getStrategyName();

    /**
     * Attempts to authenticate with this strategy.
     *
     * @param information The information required for authentication.
     * @param response    A BiConsumer. One of the values in the consumer has to be null.
     */
    void authenticate(AuthenticationRequest information, BiConsumer<AuthenticationResponse, AuthenticationException> response);
}
