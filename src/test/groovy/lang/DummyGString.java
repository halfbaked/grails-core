/*
 * Copyright 2003-2011 the original author or authors.
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
package groovy.lang;

/**
 * A hand crafted example GString
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @version $Revision$
 */
public class DummyGString extends GString {

    private String[] strings;
    private MetaClass metaClass;

    public DummyGString(Object[] values) {
        this(values, new String[]{"Hello ", "!"});
    }

    public DummyGString(Object[] values, String[] strings) {
        super(values);
        this.strings = strings;
    }

    public String[] getStrings() {
        return strings;
    }

    public MetaClass getMetaClass() {
        return metaClass;
    }

    public void setMetaClass(MetaClass metaClass) {
        this.metaClass = metaClass;
    }

    public Object invokeMethod(String name, Object arguments) {
        return metaClass.invokeMethod(this, name, arguments);
    }
}