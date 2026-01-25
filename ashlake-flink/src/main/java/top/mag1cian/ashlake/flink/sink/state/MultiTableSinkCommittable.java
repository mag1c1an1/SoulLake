package top.mag1cian.ashlake.flink.sink.state;

import java.io.Serializable;
import top.mag1cian.ashlake.flink.sink.MultiTableSink;

/**
 * Wrapper class for both type of committables in {@link MultiTableSink}. One committable might be
 * either one or more pending files to commit, or one in-progress file to clean up.
 *
 * @author mag1cian
 */
public class MultiTableSinkCommittable
    implements Serializable, Comparable<MultiTableSinkCommittable> {

  @Override
  public int compareTo(MultiTableSinkCommittable o) {
    return 0;
  }

  @Override
  public String toString() {
    return
"""
multiTableSink
""";
  }
}
