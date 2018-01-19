package io.github.jpassport;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JPassport {

    private final Map<String, AuthenticationStrategy> strategies;

    public JPassport() {
        strategies = new ConcurrentHashMap<>();
    }

    public void registerStrategy(String name, AuthenticationStrategy strategy) {
        this.strategies.put(name, strategy);
    }

    public AuthenticationStrategy getStrategy(String name) {
        return this.strategies.get(name);
    }
}
