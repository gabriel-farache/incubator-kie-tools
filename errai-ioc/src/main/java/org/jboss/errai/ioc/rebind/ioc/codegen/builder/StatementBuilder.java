package org.jboss.errai.ioc.rebind.ioc.codegen.builder;

import javax.enterprise.util.TypeLiteral;

import org.jboss.errai.ioc.rebind.ioc.codegen.MetaClassFactory;
import org.jboss.errai.ioc.rebind.ioc.codegen.Scope;
import org.jboss.errai.ioc.rebind.ioc.codegen.Variable;
import org.jboss.errai.ioc.rebind.ioc.codegen.meta.MetaClass;
import org.jboss.errai.ioc.rebind.ioc.codegen.meta.impl.java.JavaReflectionClass;

/**
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public class StatementBuilder extends AbstractStatementBuilder {

    private StatementBuilder(Scope scope) {
        super(scope);
    }

    public static StatementBuilder create() {
        return new StatementBuilder(new Scope());
    }

    public ScopedStatementBuilder loadVariable(String name, MetaClass type) {
        scope.pushVariable(new Variable(name, type));
        return ScopedStatementBuilder.createInScopeOf(this);
    }

    public ScopedStatementBuilder loadVariable(String name, Class type) {
        return loadVariable(name, MetaClassFactory.get(type));
    }

    public ScopedStatementBuilder loadVariable(String name, TypeLiteral literal) {
        return loadVariable(name, MetaClassFactory.get(literal));
    }

    public ObjectBuilder newObject(MetaClass type) {
        return ObjectBuilder.newInstanceOf(type);
    }

    public ObjectBuilder newObject(JavaReflectionClass type) {
        return ObjectBuilder.newInstanceOf(type);
    }

    public ObjectBuilder newObject(Class<?> cls) {
        return ObjectBuilder.newInstanceOf(cls);
    }
}
