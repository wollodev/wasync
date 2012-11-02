/*
 * Copyright 2012 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.client;

import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Jeanfrancois Arcand
 */
public interface Request {

    public enum METHOD {GET, POST, TRACE, PUT, DELETE, OPTIONS}
    public enum TRANSPORT {WEBSOCKET, SSE, STREAMING, LONG_POLLING}

    List<TRANSPORT> transport();

    METHOD method();

    Map<String, Collection<String>> headers();

    Map<String, Collection<String>> queryString();

    Encoder<?> encoder();

    Decoder<?> decoder();

    String uri();

}