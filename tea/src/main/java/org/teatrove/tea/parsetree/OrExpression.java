/*
 *  Copyright 1997-2011 teatrove.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.teatrove.tea.parsetree;

import org.teatrove.tea.compiler.SourceInfo;
import org.teatrove.tea.compiler.Token;

/**
 * OrExpression defines a logical "or" operation with short-circuit 
 * semantics. The type of an OrExpression is Boolean, and it operates only
 * on expressions that return Booleans.
 * 
 * @author Brian S O'Neill
 */
public class OrExpression extends BinaryLogicalExpression {
    private static final long serialVersionUID = 1L;

    public OrExpression(SourceInfo info,
                        Token token,
                        Expression left,
                        Expression right) {
        super(info, token, left, right);
    }

    public Object accept(NodeVisitor visitor) {
        return visitor.visit(this);
    }
}
