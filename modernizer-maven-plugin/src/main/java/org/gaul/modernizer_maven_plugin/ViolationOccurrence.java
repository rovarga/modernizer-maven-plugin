/*
 * Copyright 2014-2025 Andrew Gaul <andrew@gaul.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gaul.modernizer_maven_plugin;

public final class ViolationOccurrence {
    private final String owner;
    private final int lineNumber;
    private final Violation violation;

    ViolationOccurrence(String owner, int lineNumber, Violation violation) {
        this.owner = Utils.checkNotNull(owner);
        this.lineNumber = lineNumber;
        this.violation = Utils.checkNotNull(violation);
    }

    public String getOwner() {
        return owner;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public Violation getViolation() {
        return violation;
    }

    @Override
    public String toString() {
        return owner + " " + lineNumber + " " + violation;
    }
}
