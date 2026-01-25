package top.mag1cian.ashlake.flink.sink.writer;

import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.functions.sink.filesystem.BucketWriter;
import org.apache.flink.streaming.api.functions.sink.filesystem.InProgressFileWriter;
import org.apache.flink.streaming.api.functions.sink.filesystem.WriterProperties;
import top.mag1cian.ashlake.flink.arrow.ArrowWrapper;

import java.io.IOException;

/**
 * @author mag1cian
 */
public class NativeArrowBucketWriter implements BucketWriter<ArrowWrapper, String> {
  @Override
  public InProgressFileWriter<ArrowWrapper, String> openNewInProgressFile(
      String s, Path path, long creationTime) throws IOException {
    return null;
  }

  @Override
  public InProgressFileWriter<ArrowWrapper, String> resumeInProgressFileFrom(
      String s,
      InProgressFileWriter.InProgressFileRecoverable inProgressFileSnapshot,
      long creationTime)
      throws IOException {
    return null;
  }

  @Override
  public WriterProperties getProperties() {
    return null;
  }

  @Override
  public PendingFile recoverPendingFile(
      InProgressFileWriter.PendingFileRecoverable pendingFileRecoverable) throws IOException {
    return null;
  }

  @Override
  public boolean cleanupInProgressFileRecoverable(
      InProgressFileWriter.InProgressFileRecoverable inProgressFileRecoverable) throws IOException {
    return false;
  }
}
