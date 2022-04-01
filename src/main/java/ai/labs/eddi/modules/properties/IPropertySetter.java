package ai.labs.eddi.modules.properties;

import ai.labs.eddi.models.Property;
import ai.labs.eddi.modules.nlp.expressions.Expressions;

import java.util.List;

/**
 * @author ginccc
 */
public interface IPropertySetter {
    List<Property> extractProperties(Expressions expressions);
}
