/**
 *    Copyright 2016-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.dynamic.sql.select.aggregate;

import org.mybatis.dynamic.sql.BasicColumn;

public class Count extends AbstractAggregate<Count> {
    
    private Count(BasicColumn column) {
        super(column);
    }
    
    @Override
    protected String render(String columnName) {
        return "count(" + columnName + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    @Override
    protected Count copy() {
        return new Count(column);
    }
    
    public static Count of(BasicColumn column) {
        return new Count(column);
    }
}
