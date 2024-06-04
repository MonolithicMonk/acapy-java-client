/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.aries.api.issue_credential_v2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hyperledger.aries.api.jsonld.VerifiableCredential;
import org.hyperledger.aries.config.GsonConfig;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * V20CredExRecordByFormat
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class V20CredExRecordByFormat {

    public static final String INDY = "indy";
    public static final String LD_PROOF = "ld_proof";

    private JsonObject credProposal;
    private JsonObject credOffer;
    private JsonObject credRequest;
    private JsonObject credIssue;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class LdProof {
        private VerifiableCredential credential;
        private V2CredentialExchangeFree.LDProofVCDetailOptions options;

        /**
         * Assumes that the credential subject is a flat key/value map.
         * @return the credential subject as map
         */
        public Map<String, String> toFlatMap() {
            return credential == null ? Map.of() : credential.subjectToFlatMap();
        }
    }

    /**
     * Gets schema id from indy proposal
     * @return schema id
     */
    public String findSchemaIdInIndyProposal() {
        String result = null;
        if (credProposal != null) {
            JsonElement indy = resolveIndyPayload(credProposal);
            if (indy != null && indy.getAsJsonObject().has("schema_id")) {
                result = indy.getAsJsonObject().get("schema_id").getAsString();
            }
        }
        return result;
    }

    /**
     * Find values in issued indy credential
     * @return credential key/value map
     */
    public Optional<Map<String, String>> findValuesInIndyCredIssue() {
        if (credIssue != null) {
            JsonObject indy = resolveIndyPayload(credIssue);
            if (indy != null) {
                final Set<Map.Entry<String, JsonElement>> attrs = indy.getAsJsonObject("values").entrySet();
                return Optional.of(attrs
                        .stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                e -> e.getValue().getAsJsonObject().get("raw").getAsString())));
            }
        }
        return Optional.empty();
    }

    public boolean hasIndyPayload() {
        return resolveIndyPayload(credProposal) != null
                    || resolveIndyPayload(credOffer) != null
                    ||  resolveIndyPayload(credRequest) != null
                    ||  resolveIndyPayload(credIssue) != null;
    }

    public boolean hasLdProof() {
        return resolveLdPayload(credProposal) != null
                || resolveLdPayload(credOffer) != null
                ||  resolveLdPayload(credRequest) != null
                ||  resolveLdPayload(credIssue) != null;
    }

    public LdProof convertToLdProof(JsonObject jo) {
        return convertToLdProof(jo, LdProof.class);
    }

    public <T> T convertToLdProof(JsonObject jo, Class<T> type) {
        JsonObject ld = jo.getAsJsonObject(LD_PROOF);
        return GsonConfig.defaultConfig().fromJson(ld, type);
    }

    private JsonObject resolveLdPayload(JsonObject jo) {
        return jo != null ? jo.getAsJsonObject(LD_PROOF) : null;
    }

    private JsonObject resolveIndyPayload(JsonObject jo) {
        return jo != null ? jo.getAsJsonObject(INDY) : null;
    }
}
