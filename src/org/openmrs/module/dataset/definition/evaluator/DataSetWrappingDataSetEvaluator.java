package org.openmrs.module.dataset.definition.evaluator;

import org.openmrs.annotation.Handler;
import org.openmrs.module.dataset.DataSet;
import org.openmrs.module.dataset.definition.DataSetDefinition;
import org.openmrs.module.dataset.definition.DataSetWrappingDataSetDefinition;
import org.openmrs.module.evaluation.EvaluationContext;

/**
 * @see DataSetWrappingDataSetDefinition
 * 
 */
@Handler(supports={DataSetWrappingDataSetDefinition.class})
public class DataSetWrappingDataSetEvaluator implements DataSetEvaluator {

	/**
	 * @see DataSetEvaluator#evaluate(DataSetDefinition, EvaluationContext)
	 */
    public DataSet<?> evaluate(DataSetDefinition dataSetDefinition, EvaluationContext evalContext) {
        DataSetWrappingDataSetDefinition def = (DataSetWrappingDataSetDefinition) dataSetDefinition;
        return def.getData();
    }
}