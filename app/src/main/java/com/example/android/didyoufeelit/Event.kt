/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.didyoufeelit

/**
 * {@Event} represents an earthquake event.
 */
class Event
/**
 * Constructs a new [Event].
 *
 * @param eventTitle is the title of the earthquake event
 * @param eventNumOfPeople is the number of people who felt the earthquake and reported how
 * strong it was
 * @param eventPerceivedStrength is the perceived strength of the earthquake from the responses
 */(
    /** Title of the earthquake event  */
    val title: String,
    /** Number of people who felt the earthquake and reported how strong it was  */
    val numOfPeople: String,
    /** Perceived strength of the earthquake from the people's responses  */
    val perceivedStrength: String
)