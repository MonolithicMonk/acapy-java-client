/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.jsonld;

import org.hyperledger.aries.api.jsonld.VerifiableCredential.VerifiableIndyCredential;
import org.hyperledger.aries.config.GsonConfig;
import org.hyperledger.aries.util.FileLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonldSerialisationTest {

    @Test
    void testGsonSerialisation() {
        final String json = FileLoader.load("json-ld/verifiableCredentialUnsigned.json");
        final VerifiableIndyCredential vc = GsonConfig.defaultConfig().fromJson(json, VerifiableIndyCredential.class);
        String vcString = GsonConfig.prettyPrinter().toJson(vc);
        assertEquals(json, vcString);
    }
}
