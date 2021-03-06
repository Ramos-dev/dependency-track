/*
 * This file is part of Dependency-Track.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.dependencytrack.model;

import alpine.model.IConfigProperty.PropertyType;

public enum ConfigPropertyConstants {

    GENERAL_BASE_URL("general", "base.url", null, PropertyType.URL, "URL used to construct links back to Dependency-Track from external systems"),
    EMAIL_SMTP_ENABLED("email", "smtp.enabled", "false", PropertyType.BOOLEAN, "Flag to enable/disable SMTP"),
    EMAIL_SMTP_FROM_ADDR("email", "smtp.from.address", null, PropertyType.STRING, "The from email address to use to send output SMTP mail"),
    EMAIL_SMTP_SERVER_HOSTNAME("email", "smtp.server.hostname", null, PropertyType.STRING, "The hostname or IP address of the SMTP mail server"),
    EMAIL_SMTP_SERVER_PORT("email", "smtp.server.port", null, PropertyType.INTEGER, "The port the SMTP server listens on"),
    EMAIL_SMTP_USERNAME("email", "smtp.username", null, PropertyType.STRING, "The optional username to authenticate with when sending outbound SMTP mail"),
    EMAIL_SMTP_PASSWORD("email", "smtp.password", null, PropertyType.ENCRYPTEDSTRING, "The optional password for the username used for authentication"),
    EMAIL_SMTP_SSLTLS("email", "smtp.ssltls", "false", PropertyType.BOOLEAN, "Flag to enable/disable the use of SSL/TLS when connecting to the SMTP server"),
    EMAIL_SMTP_TRUSTCERT("email", "smtp.trustcert", "false", PropertyType.BOOLEAN, "Flag to enable/disable the trust of the certificate presented by the SMTP server"),
    SCANNER_DEPENDENCYCHECK_ENABLED("scanner", "dependencycheck.enabled", "true", PropertyType.BOOLEAN, "Flag to enable/disable OWASP Dependency-Check"),
    SCANNER_NPMAUDIT_ENABLED("scanner", "npmaudit.enabled", "true", PropertyType.BOOLEAN, "Flag to enable/disable NPM Audit"),
    SCANNER_OSSINDEX_ENABLED("scanner", "ossindex.enabled", "false", PropertyType.BOOLEAN, "Flag to enable/disable Sonatype OSS Index"),
    SCANNER_OSSINDEX_API_USERNAME("scanner", "ossindex.api.username", null, PropertyType.STRING, "The API username used for OSS Index authentication"),
    SCANNER_OSSINDEX_API_TOKEN("scanner", "ossindex.api.token", null, PropertyType.ENCRYPTEDSTRING, "The API token used for OSS Index authentication"),
    FORTIFY_SSC_ENABLED("integrations", "fortify.ssc.enabled", "false", PropertyType.BOOLEAN, "Flag to enable/disable Fortify SSC integration"),
    FORTIFY_SSC_SYNC_CADENCE("integrations", "fortify.ssc.sync.cadence", "60", PropertyType.INTEGER, "The cadence (in minutes) to upload to Fortify SSC"),
    FORTIFY_SSC_URL("integrations", "fortify.ssc.url", null, PropertyType.URL, "Base URL to Fortify SSC"),
    FORTIFY_SSC_USERNAME("integrations", "fortify.ssc.username", null, PropertyType.STRING, "The username to authenticate to Fortify SSC with"),
    FORTIFY_SSC_PASSWORD("integrations", "fortify.ssc.password", null, PropertyType.ENCRYPTEDSTRING, "The password to use when authenticating to Fortify SSC"),
    KENNA_ENABLED("integrations", "kenna.enabled", "false", PropertyType.BOOLEAN, "Flag to enable/disable Kenna Security integration"),
    KENNA_SYNC_CADENCE("integrations", "kenna.sync.cadence", "60", PropertyType.INTEGER, "The cadence (in minutes) to upload to Kenna Security"),
    KENNA_TOKEN("integrations", "kenna.token", null, PropertyType.ENCRYPTEDSTRING, "The token to use when authenticating to Kenna Security"),
    KENNA_CONNECTOR_ID("integrations", "kenna.connector.id", null, PropertyType.STRING, "The Kenna Security connector identifier to upload to");


    private String groupName;
    private String propertyName;
    private String defaultPropertyValue;
    private PropertyType propertyType;
    private String description;

    ConfigPropertyConstants(String groupName, String propertyName, String defaultPropertyValue, PropertyType propertyType, String description) {
        this.groupName = groupName;
        this.propertyName = propertyName;
        this.defaultPropertyValue = defaultPropertyValue;
        this.propertyType = propertyType;
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getDefaultPropertyValue() {
        return defaultPropertyValue;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public String getDescription() {
        return description;
    }

}
