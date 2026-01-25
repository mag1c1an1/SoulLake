package top.mag1cian.ashlake.flink.source;

import org.apache.flink.api.connector.source.SourceSplit;

/**
 * @author mag1cian
 */
public class PartitionSplit implements SourceSplit {
  @Override
  public String splitId() {
    return "";
  }
}
