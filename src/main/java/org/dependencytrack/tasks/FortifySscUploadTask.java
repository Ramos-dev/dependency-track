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
package org.dependencytrack.tasks;

import alpine.event.framework.Event;
import alpine.logging.Logger;
import org.dependencytrack.event.FortifySscUploadEvent;
import org.dependencytrack.integrations.fortifyssc.FortifySscUploader;

public class FortifySscUploadTask extends VulnerabilityManagementUploadTask {

    private static final Logger LOGGER = Logger.getLogger(FortifySscUploadTask.class);

    /**
     * {@inheritDoc}
     */
    public void inform(Event e) {
        if (e instanceof FortifySscUploadEvent) {
            final FortifySscUploadEvent event = (FortifySscUploadEvent) e;
            LOGGER.debug("Starting Fortify Software Security Center upload task");
            super.inform(event, new FortifySscUploader());
            LOGGER.debug("Fortify Software Security Center upload complete");
        }
    }
}
