/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.issue_credential_v2;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;
import org.hyperledger.aries.api.issue_credential_v1.CredentialExchangeRole;

import javax.annotation.Nullable;

@Data @Builder
public class V2IssueCredentialRecordsFilter implements AcaPyRequestFilter {
    @Nullable private String connectionId;
    @Nullable private CredentialExchangeRole role;
    @Nullable private V2CredExRecordState state;
    @Nullable private String threadId;

    public enum V2CredExRecordState {

        /**
         * @since 0.7.4
         */
        @SerializedName("abandoned")
        ABANDONED,

        @SerializedName("credential-issued")
        CREDENTIAL_ISSUED,

        @SerializedName("credential-received")
        CREDENTIAL_RECEIVED,

        @SerializedName("credential-revoked")
        CREDENTIAL_REVOKED,

        @SerializedName("done")
        DONE,

        @SerializedName("offer-received")
        OFFER_RECEIVED,

        @SerializedName("offer-sent")
        OFFER_SENT,

        @SerializedName("proposal-received")
        PROPOSAL_RECEIVED,

        @SerializedName("proposal-sent")
        PROPOSAL_SENT,

        @SerializedName("request-received")
        REQUEST_RECEIVED,

        @SerializedName("request-sent")
        REQUEST_SENT
    }
}
