package top.mag1cian.ashlake.flink.sink;

import org.apache.flink.api.connector.sink2.*;
import org.apache.flink.core.io.SimpleVersionedSerializer;

import java.io.IOException;
import java.util.Collection;

/**
 * @author mag1cian
 */
public class MultiTableSink<IN, OUT> implements Sink<IN>, SupportsWriterState, SupportsCommitter {
  /**
   * For backward compatibility
   *
   * @param context the runtime context.
   * @return
   * @throws IOException
   */
  @Override
  public SinkWriter<IN> createWriter(InitContext context) throws IOException {
    return null;
  }

  @Override
  public SinkWriter<IN> createWriter(WriterInitContext context) throws IOException {
    return null;
  }

  @Override
  public Committer createCommitter(CommitterInitContext context) throws IOException {
    return null;
  }

  @Override
  public SimpleVersionedSerializer getCommittableSerializer() {
    return null;
  }

  @Override
  public StatefulSinkWriter restoreWriter(WriterInitContext context, Collection recoveredState)
      throws IOException {
    return null;
  }

  @Override
  public SimpleVersionedSerializer getWriterStateSerializer() {
    return null;
  }
}
