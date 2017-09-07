/*
 * Copyright (C) 2017 VSCT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.vsct.tock.bot.connector.ga.model.request

import fr.vsct.tock.bot.engine.dialog.EventState
import fr.vsct.tock.translator.UserInterfaceType

/**
 *
 */
data class GARequest(
        val user: GAUser,
        val device: GADevice,
        val surface: GASurface,
        val conversation: GAConversation,
        val inputs: List<GAInput>,
        val isInSandbox: Boolean) {

    fun getEventState(): EventState {
        val ui =
                if (surface.hasAudio()) {
                    if (surface.hasScreen()) {
                        UserInterfaceType.textAndVoiceAssistant
                    } else {
                        UserInterfaceType.voiceAssistant
                    }
                } else {
                    UserInterfaceType.textChat
                }
        return EventState(userInterface = ui)
    }
}
