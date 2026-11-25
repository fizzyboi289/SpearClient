package com.spearclient;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SPEAR CLIENT — a client-side utility mod for Minecraft 26.3.
 * This initial project foundation is intentionally lightweight and
 * does not modify server gameplay or send custom packets.
 */
public final class SpearClient implements ClientModInitializer {
    public static final String MOD_ID = "spearclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("SPEAR CLIENT 1.0.0 initialized. Welcome!");
    }
}
