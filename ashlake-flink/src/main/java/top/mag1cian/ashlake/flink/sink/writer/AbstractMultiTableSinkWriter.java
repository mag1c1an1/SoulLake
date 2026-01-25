package top.mag1cian.ashlake.flink.sink.writer;

import org.apache.flink.api.connector.sink2.SinkWriter;
import org.apache.flink.streaming.api.functions.sink.filesystem.RollingPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;

/**
 * @author mag1cian
 */
public abstract class AbstractMultiTableSinkWriter<IN, OUT> implements SinkWriter<IN> {

  private static final Logger LOG = LoggerFactory.getLogger(AbstractMultiTableSinkWriter.class);

  private final RollingPolicy<OUT, String> rollingPolicy;

  public AbstractMultiTableSinkWriter(RollingPolicy<OUT, String> rollingPolicy) {
    this.rollingPolicy = rollingPolicy;
  }

  @Override
  public void write(@Nullable IN element, @Nonnull Context context)
      throws IOException, InterruptedException {
    if (element == null || context == null) {
      LOG.warn("element or context is null");
    }
  }
}
