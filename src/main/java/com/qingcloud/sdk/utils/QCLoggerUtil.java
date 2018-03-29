// +-------------------------------------------------------------------------
// | Copyright (C) 2016 Yunify, Inc.
// +-------------------------------------------------------------------------
// | Licensed under the Apache License, Version 2.0 (the "License");
// | you may not use this work except in compliance with the License.
// | You may obtain a copy of the License in the LICENSE file, or at:
// |
// | http://www.apache.org/licenses/LICENSE-2.0
// |
// | Unless required by applicable law or agreed to in writing, software
// | distributed under the License is distributed on an "AS IS" BASIS,
// | WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// | See the License for the specific language governing permissions and
// | limitations under the License.
// +-------------------------------------------------------------------------

package com.qingcloud.sdk.utils;

import com.qingcloud.sdk.constants.QCConstant;

import java.util.logging.Level;
import java.util.logging.Logger;

/** */
public class QCLoggerUtil {

    public static synchronized Logger setLoggerHandler(String loggerName) {
        Logger logger = Logger.getLogger(loggerName);
        if (QCConstant.LOGGER_LEVEL.equals(QCConstant.LOGGER_ERROR)) {
            logger.setLevel(Level.SEVERE);
        } else if (QCConstant.LOGGER_LEVEL.equals(QCConstant.LOGGER_WARNING)) {
            logger.setLevel(Level.WARNING);
        } else if (QCConstant.LOGGER_LEVEL.equals(QCConstant.LOGGER_INFO)) {
            logger.setLevel(Level.INFO);
        } else {
            logger.setLevel(Level.ALL);
        }
        return logger;
    }
}
