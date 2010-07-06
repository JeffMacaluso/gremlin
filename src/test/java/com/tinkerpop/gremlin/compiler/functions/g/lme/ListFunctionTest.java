package com.tinkerpop.gremlin.compiler.functions.g.lme;

import com.tinkerpop.gremlin.compiler.Atom;
import com.tinkerpop.gremlin.compiler.functions.Function;
import com.tinkerpop.gremlin.compiler.operations.Operation;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class ListFunctionTest extends TestCase {

    public void testEmptyList() {
        Function function = new ListFunction();
        Atom atom = function.compute(new ArrayList<Operation>());
        assertEquals(((List) atom.getValue()).size(), 0);
    }
}