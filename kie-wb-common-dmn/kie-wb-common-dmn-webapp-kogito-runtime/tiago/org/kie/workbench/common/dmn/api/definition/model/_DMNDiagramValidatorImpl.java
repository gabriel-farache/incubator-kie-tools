package org.kie.workbench.common.dmn.api.definition.model;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintViolation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.impl.metadata.ValidationGroupsMetadata;
import com.google.gwt.validation.client.impl.Group;
import com.google.gwt.validation.client.impl.GroupChain;
import com.google.gwt.validation.client.impl.PathImpl;
import javax.validation.Path.Node;
import com.google.gwt.validation.client.impl.GroupChainGenerator;
import com.google.gwt.validation.client.impl.GwtBeanDescriptor;
import com.google.gwt.validation.client.impl.metadata.BeanMetadata;
import com.google.gwt.validation.client.impl.GwtValidationContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.validation.ValidationException;

public class _DMNDiagramValidatorImpl extends com.google.gwt.validation.client.impl.AbstractGwtSpecificValidator<org.kie.workbench.common.dmn.api.definition.model.DMNDiagram> implements _DMNDiagramValidator {
  private static final java.util.List<String> ALL_PROPERTY_NAMES = 
      java.util.Collections.<String>unmodifiableList(
          java.util.Arrays.<String>asList("additionalAttributes","class","defaultNamespace","definitions","id","nsContext","parent","stunnerCategory","stunnerLabels"));
  private final BeanMetadata beanMetadata =
      new BeanMetadata(
          org.kie.workbench.common.dmn.api.definition.model.DMNDiagram.class,
          javax.validation.groups.Default.class);
  
  private final com.google.gwt.validation.client.impl.PropertyDescriptorImpl definitions_pd =
      new com.google.gwt.validation.client.impl.PropertyDescriptorImpl(
          "definitions",
          org.kie.workbench.common.dmn.api.definition.model.Definitions.class,
          true,beanMetadata);
  private final com.google.gwt.validation.client.impl.PropertyDescriptorImpl id_pd =
      new com.google.gwt.validation.client.impl.PropertyDescriptorImpl(
          "id",
          org.kie.workbench.common.dmn.api.property.dmn.Id.class,
          true,beanMetadata);
  private final com.google.gwt.validation.client.impl.GwtBeanDescriptor<org.kie.workbench.common.dmn.api.definition.model.DMNDiagram> beanDescriptor = 
      com.google.gwt.validation.client.impl.GwtBeanDescriptorImpl.builder(org.kie.workbench.common.dmn.api.definition.model.DMNDiagram.class)
          .setConstrained(false)
          .put("definitions", definitions_pd)
          .put("id", id_pd)
          .setBeanMetadata(beanMetadata)
          .build();
  
  
  public <T> void validateClassGroups(
      GwtValidationContext<T> context,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      Set<ConstraintViolation<T>> violations,
      Class<?>... groups) {
    validateAllNonInheritedProperties(context, object, violations, groups);
  }
  
  public <T> void expandDefaultAndValidateClassGroups(
      GwtValidationContext<T> context,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      Set<ConstraintViolation<T>> violations,
      Group... groups) {
    ArrayList<Class<?>> justGroups = new ArrayList<Class<?>>();
    for (Group g : groups) {
      if (!g.isDefaultGroup() || !getBeanMetadata().defaultGroupSequenceIsRedefined()) {
        justGroups.add(g.getGroup());
      }
    }
    Class<?>[] justGroupsArray = justGroups.toArray(new Class<?>[justGroups.size()]);
    validateAllNonInheritedProperties(context, object, violations, justGroupsArray);
    if (getBeanMetadata().defaultGroupSequenceIsRedefined()) {
      for (Class<?> g : beanMetadata.getDefaultGroupSequence()) {
        int numberOfViolations = violations.size();
        validateAllNonInheritedProperties(context, object, violations, g);
        if (violations.size() > numberOfViolations) {
          break;
        }
      }
    }
    else {
    }
  }
  
  public <T> void expandDefaultAndValidatePropertyGroups(
      GwtValidationContext<T> context,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      String propertyName,
      Set<ConstraintViolation<T>> violations,
      Group... groups) {
    ArrayList<Class<?>> justGroups = new ArrayList<Class<?>>();
    for (Group g : groups) {
      if (!g.isDefaultGroup() || !getBeanMetadata().defaultGroupSequenceIsRedefined()) {
        justGroups.add(g.getGroup());
      }
    }
    Class<?>[] justGroupsArray = justGroups.toArray(new Class<?>[justGroups.size()]);
    validatePropertyGroups(context, object, propertyName, violations, justGroupsArray);
    if (getBeanMetadata().defaultGroupSequenceIsRedefined()) {
      for (Class<?> g : beanMetadata.getDefaultGroupSequence()) {
        int numberOfViolations = violations.size();
        validatePropertyGroups(context, object, propertyName, violations, g);
        if (violations.size() > numberOfViolations) {
          break;
        }
      }
    }
  }
  
  public <T> void expandDefaultAndValidateValueGroups(
      GwtValidationContext<T> context,
      Class<org.kie.workbench.common.dmn.api.definition.model.DMNDiagram> beanType,
      String propertyName,
      Object value,
      Set<ConstraintViolation<T>> violations,
      Group... groups) {
    ArrayList<Class<?>> justGroups = new ArrayList<Class<?>>();
    for (Group g : groups) {
      if (!g.isDefaultGroup() || !getBeanMetadata().defaultGroupSequenceIsRedefined()) {
        justGroups.add(g.getGroup());
      }
    }
    Class<?>[] justGroupsArray = justGroups.toArray(new Class<?>[justGroups.size()]);
    validateValueGroups(context, beanType, propertyName, value, violations, justGroupsArray);
    if (getBeanMetadata().defaultGroupSequenceIsRedefined()) {
      for (Class<?> g : beanMetadata.getDefaultGroupSequence()) {
        int numberOfViolations = violations.size();
        validateValueGroups(context, beanType, propertyName, value, violations, g);
        if (violations.size() > numberOfViolations) {
          break;
        }
      }
    }
  }
  
  public <T> void validatePropertyGroups(
      GwtValidationContext<T> context,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      String propertyName,
      Set<ConstraintViolation<T>> violations,
      Class<?>... groups) throws ValidationException {
    if (propertyName.equals("definitions")) {
      validateProperty_getdefinitions(context, violations, object, object.getDefinitions(), false, groups);
      validateProperty_definitions(context, violations, object, _definitions(object), false, groups);
    } else if (propertyName.equals("id")) {
      validateProperty_getid(context, violations, object, object.getId(), false, groups);
      validateProperty_id(context, violations, object, _id(object), false, groups);
    } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
      throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of org.kie.workbench.common.dmn.api.definition.model.DMNDiagram");
    }
  }
  
  public <T> void validateValueGroups(
      GwtValidationContext<T> context,
      Class<org.kie.workbench.common.dmn.api.definition.model.DMNDiagram> beanType,
      String propertyName,
      Object value,
      Set<ConstraintViolation<T>> violations,
      Class<?>... groups) {
    if (propertyName.equals("definitions")) {
      boolean valueTypeMatches = false;
      if ( value == null || value instanceof org.kie.workbench.common.dmn.api.definition.model.Definitions) {
        valueTypeMatches = true;
        validateProperty_getdefinitions(context, violations, null, (org.kie.workbench.common.dmn.api.definition.model.Definitions) value, false, groups);
      }
      if ( value == null || value instanceof org.kie.workbench.common.dmn.api.definition.model.Definitions) {
        valueTypeMatches = true;
        validateProperty_definitions(context, violations, null, (org.kie.workbench.common.dmn.api.definition.model.Definitions) value, false, groups);
      }
      if(!valueTypeMatches)  {
        throw new ValidationException(value.getClass() +" is not a valid type for "+ propertyName);
      }
    } else if (propertyName.equals("id")) {
      boolean valueTypeMatches = false;
      if ( value == null || value instanceof org.kie.workbench.common.dmn.api.property.dmn.Id) {
        valueTypeMatches = true;
        validateProperty_getid(context, violations, null, (org.kie.workbench.common.dmn.api.property.dmn.Id) value, false, groups);
      }
      if ( value == null || value instanceof org.kie.workbench.common.dmn.api.property.dmn.Id) {
        valueTypeMatches = true;
        validateProperty_id(context, violations, null, (org.kie.workbench.common.dmn.api.property.dmn.Id) value, false, groups);
      }
      if(!valueTypeMatches)  {
        throw new ValidationException(value.getClass() +" is not a valid type for "+ propertyName);
      }
    } else  if (!ALL_PROPERTY_NAMES.contains(propertyName)) {
      throw new java.lang.IllegalArgumentException( propertyName +" is not a valid property of org.kie.workbench.common.dmn.api.definition.model.DMNDiagram");
    }
  }
  
  public BeanMetadata getBeanMetadata() {
    return beanMetadata;
  }
  
  public GwtBeanDescriptor<org.kie.workbench.common.dmn.api.definition.model.DMNDiagram> getConstraints(ValidationGroupsMetadata validationGroupsMetadata) {
    beanDescriptor.setValidationGroupsMetadata(validationGroupsMetadata);
    return beanDescriptor;
  }
  
  private final <T> void validateProperty_definitions(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      final org.kie.workbench.common.dmn.api.definition.model.Definitions value,
      boolean honorValid,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("definitions");
    Node leafNode = myContext.getPath().getLeafNode();
    PathImpl path = myContext.getPath().getPathWithoutLeafNode();
    boolean isReachable;
    try {
      isReachable = myContext.getTraversableResolver().isReachable(object, leafNode, myContext.getRootBeanClass(), path, java.lang.annotation.ElementType.FIELD);
    } catch (Exception e) {
      throw new ValidationException("TraversableResolver isReachable caused an exception", e);
    }
    if (isReachable) {
      if (honorValid && value != null) {
        boolean isCascadable;
        try {
          isCascadable = myContext.getTraversableResolver().isCascadable(object, leafNode, myContext.getRootBeanClass(), path, java.lang.annotation.ElementType.FIELD);
        } catch (Exception e) {
          throw new ValidationException("TraversableResolver isCascadable caused an exception", e);
        }
        if (isCascadable) {
           if (!context.alreadyValidated(value)) {
            violations.addAll(myContext.getValidator().validate(myContext, value, groups));
          }
        }
      }
    }
  }
  
  private final <T> void validateProperty_getdefinitions(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      final org.kie.workbench.common.dmn.api.definition.model.Definitions value,
      boolean honorValid,
      Class<?>... groups) {
  }
  
  private final <T> void validateProperty_id(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      final org.kie.workbench.common.dmn.api.property.dmn.Id value,
      boolean honorValid,
      Class<?>... groups) {
    final GwtValidationContext<T> myContext = context.append("id");
    Node leafNode = myContext.getPath().getLeafNode();
    PathImpl path = myContext.getPath().getPathWithoutLeafNode();
    boolean isReachable;
    try {
      isReachable = myContext.getTraversableResolver().isReachable(object, leafNode, myContext.getRootBeanClass(), path, java.lang.annotation.ElementType.FIELD);
    } catch (Exception e) {
      throw new ValidationException("TraversableResolver isReachable caused an exception", e);
    }
    if (isReachable) {
      if (honorValid && value != null) {
        boolean isCascadable;
        try {
          isCascadable = myContext.getTraversableResolver().isCascadable(object, leafNode, myContext.getRootBeanClass(), path, java.lang.annotation.ElementType.FIELD);
        } catch (Exception e) {
          throw new ValidationException("TraversableResolver isCascadable caused an exception", e);
        }
        if (isCascadable) {
           if (!context.alreadyValidated(value)) {
            violations.addAll(myContext.getValidator().validate(myContext, value, groups));
          }
        }
      }
    }
  }
  
  private final <T> void validateProperty_getid(
      final GwtValidationContext<T> context,
      final Set<ConstraintViolation<T>> violations,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      final org.kie.workbench.common.dmn.api.property.dmn.Id value,
      boolean honorValid,
      Class<?>... groups) {
  }
  
  
  private <T> void validateAllNonInheritedProperties(
      GwtValidationContext<T> context,
      org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object,
      Set<ConstraintViolation<T>> violations,
      Class<?>... groups) {
    validateProperty_getdefinitions(context, violations, object, object.getDefinitions(), true, groups);
    validateProperty_definitions(context, violations, object, _definitions(object), true, groups);
    validateProperty_getid(context, violations, object, object.getId(), true, groups);
    validateProperty_id(context, violations, object, _id(object), true, groups);
  }
  
  // Write the wrappers after we know which are needed
  private native org.kie.workbench.common.dmn.api.definition.model.Definitions _definitions(org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object) /*-{
    return object.@org.kie.workbench.common.dmn.api.definition.model.DMNDiagram::definitions;
  }-*/;
  
  private native org.kie.workbench.common.dmn.api.property.dmn.Id _id(org.kie.workbench.common.dmn.api.definition.model.DMNDiagram object) /*-{
    return object.@org.kie.workbench.common.dmn.api.definition.model.DMNDiagram::id;
  }-*/;
  
  
}
