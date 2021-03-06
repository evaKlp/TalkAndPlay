/**
* Copyright 2016 SciFY
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
package org.scify.talkandplay.models.sensors;

/**
 * The Keyboard Sensor holds the key code (i.e 32, 68 etc) and the corresponding
 * character
 *
 * @author christina
 */
public class KeyboardSensor extends Sensor {

    private int keyCode;
    private String keyChar;

    public KeyboardSensor() {
        super();
    }

    public KeyboardSensor(int keyCode, String keyChar, String name) {
        super(name);
        this.keyCode = keyCode;
        this.keyChar = keyChar;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public String getKeyChar() {
        return keyChar;
    }

    public void setKeyChar(String keyChar) {
        this.keyChar = keyChar;
    }

}
