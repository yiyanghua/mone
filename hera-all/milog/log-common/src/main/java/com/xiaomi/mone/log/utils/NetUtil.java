/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiaomi.mone.log.utils;

import com.xiaomi.mone.log.common.NetUtils;

/**
 * @author shanwb
 * @date 2021-08-16
 */
public class NetUtil {

    private static final String HERA_K8S_ENV = "hera.buildin.k8s";

    public static String getLocalIp() {
        String localIp = System.getenv("host.ip") == null ? NetUtils.getLocalHost() : System.getenv("host.ip");
        return localIp;
    }

    public static String getHeraK8sEnv() {
        return System.getenv(HERA_K8S_ENV);
    }

}
