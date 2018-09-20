package br.com.exemplo.parallel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class RangePartitioner implements Partitioner, Serializable {

	private static final long serialVersionUID = 1L;
	
	final static Logger logger = Logger.getLogger(RangePartitioner.class);
	
	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {

		Map<String, ExecutionContext> result 
                       = new HashMap<String, ExecutionContext>();

		int range = 10;
		int fromId = 1;
		int toId = range;

		for (int i = 1; i <= gridSize; i++) {
			ExecutionContext value = new ExecutionContext();
			
			logger.info("Starting : Processo " + i);
			logger.info("fromId : " + fromId);
			logger.info("toId : " + toId);

			value.putInt("fromId", fromId);
			value.putInt("toId", toId);

			value.putString("name", "Processo " + i);

			result.put("partition" + i, value);

			fromId = toId + 1;
			toId += range;

		}

		return result;
	}

}