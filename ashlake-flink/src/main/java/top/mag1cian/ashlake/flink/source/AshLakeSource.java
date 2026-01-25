package top.mag1cian.ashlake.flink.source;

import org.apache.flink.api.connector.source.Source;

/**
 * @author mag1cian
 */
public abstract class AshLakeSource<OUT> implements Source<OUT, PartitionSplit, PendingSplits> {}
