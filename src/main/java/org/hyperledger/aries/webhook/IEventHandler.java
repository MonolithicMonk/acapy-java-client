/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.webhook;

public interface IEventHandler {

    /**
     * Handler for regular wallets
     * @param topic event type
     * @param payload json payload
     */
    void handleEvent(String topic, String payload);

    /**
     * Handler for multi tenant wallets
     * @param walletId x-wallet-id HTTP header value
     * @param topic event type
     * @param payload json payload
     */
    void handleEvent(String walletId, String topic, String payload);
}
