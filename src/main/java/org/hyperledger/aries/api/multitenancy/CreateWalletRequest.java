/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateWalletRequest {

    /**
     * Agent config key-value pairs
     */
    @Singular
    private Map<String, Object> extraSettings;

    /**
     * Image url for this wallet. This image url is publicized (self-attested) to other agents as part of forming a
     * connection.
     */
    private String imageUrl;

    /** Key management method to use for this wallet. */
    private KeyManagementMode keyManagementMode;

    /**
     * Label for this wallet. This label is publicized (self-attested) to other agents as part of forming a connection.
     */
    private String label;

    /** {@link org.hyperledger.aries.api.multitenancy.WalletDispatchType} */
    private WalletDispatchType walletDispatchType;

    /** Master key used for key derivation. */
    private String walletKey;

    /** Wallet key derivation method */
    private WalletKeyDerivation walletKeyDerivation;

    /** Wallet name */
    private String walletName;

    /** Type of wallet to create */
    private WalletType walletType;

    /** List of Webhook URLs associated with this sub wallet */
    private List<String> walletWebhookUrls;
}
