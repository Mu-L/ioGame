/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2023 double joker （262610965@qq.com） . All Rights Reserved.
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
package com.iohao.game.bolt.broker.server.aware;

import com.iohao.game.bolt.broker.server.BrokerServer;

/**
 * BrokerServerAware
 * <pre>
 *     设置与 broker（游戏网关）server
 *
 *     只要 bolt 处理器（逻辑处理器和连接器）实现了该接口，框架会调用 setBrokerServer 方法并赋值
 *
 * </pre>
 *
 * @author 渔民小镇
 * @date 2022-05-16
 */
public interface BrokerServerAware {
    /**
     * set BrokerServer
     *
     * @param brokerServer brokerServer
     */
    void setBrokerServer(BrokerServer brokerServer);
}
