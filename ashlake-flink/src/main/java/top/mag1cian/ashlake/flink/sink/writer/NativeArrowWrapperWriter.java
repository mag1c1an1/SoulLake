package top.mag1cian.ashlake.flink.sink.writer;

import org.apache.flink.streaming.api.functions.sink.filesystem.InProgressFileWriter;
import top.mag1cian.ashlake.flink.arrow.ArrowWrapper;

import java.io.IOException;

/**
 * @author mag1cian
 */
public class NativeArrowWrapperWriter implements InProgressFileWriter<ArrowWrapper, String> {

  private void initNativeWriter() {}

  @Override
  public void write(ArrowWrapper element, long currentTime) throws IOException {}

  @Override
  public InProgressFileRecoverable persist() throws IOException {
    return null;
  }

  @Override
  public PendingFileRecoverable closeForCommit() throws IOException {
    return null;
  }

  @Override
  public void dispose() {}

  @Override
  public String getBucketId() {
    return "";
  }

  @Override
  public long getCreationTime() {
    return 0;
  }

  @Override
  public long getSize() throws IOException {
    return 0;
  }

  @Override
  public long getLastUpdateTime() {
    return 0;
  }
}
