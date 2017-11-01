/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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
package org.drools.workbench.screens.guided.dtable.client.widget.table.model.converters.column.impl;

import org.drools.workbench.models.datamodel.workitems.PortableWorkDefinition;
import org.drools.workbench.models.guided.dtable.shared.model.ActionWorkItemCol52;
import org.drools.workbench.models.guided.dtable.shared.model.BaseColumn;
import org.drools.workbench.screens.guided.dtable.client.widget.table.model.converters.column.BaseColumnConverter;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ActionWorkItemExecuteColumnConverterTest extends BaseActionWorkItemConverterTest {

    @Override
    protected int getExpectedPriority() {
        return 0;
    }

    @Override
    protected BaseColumnConverter getConverter() {
        return new ActionWorkItemExecuteColumnConverter();
    }

    @Override
    protected BaseColumn getColumn() {
        final ActionWorkItemCol52 column = new ActionWorkItemCol52();
        final PortableWorkDefinition pwd = new PortableWorkDefinition();
        pwd.setName(WID_NAME);
        column.setWorkItemDefinition(pwd);
        column.setHeader(HEADER);
        column.setWidth(WIDTH);
        return column;
    }

    @Override
    protected String getExpectedColumnGroup() {
        return WID_NAME + "-exec";
    }
}
