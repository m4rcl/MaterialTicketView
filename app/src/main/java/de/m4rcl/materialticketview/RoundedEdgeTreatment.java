/*
 * Copyright 2017 The Android Open Source Project
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
 */

package de.m4rcl.materialticketview;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

import androidx.annotation.NonNull;

/**
 * An edge treatment which draws circles at the midpoint of an edge, facing into or out of the shape.
 */
public class RoundedEdgeTreatment extends EdgeTreatment {

    private int size;

    public RoundedEdgeTreatment(int size) {
        this.size = size;
    }

    @Override
    public void getEdgePath(float length, float center, float interpolation, @NonNull ShapePath shapePath) {
        int halfSize = size / 2;
        shapePath.lineTo(center - halfSize, 0);
        shapePath.addArc(center - halfSize, -halfSize, center + halfSize, halfSize, 180, 2 - 180);
        shapePath.lineTo(length, 0);

    }
}
